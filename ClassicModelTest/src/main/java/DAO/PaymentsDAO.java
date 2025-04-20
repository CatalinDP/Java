/*

 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaymentsDAO implements BaseDAO {
    private int customerNumber;
    private String chekcNumber;
    private LocalDate paymentDate;
    private double amount;
    List<PaymentsDAO> payments = new ArrayList();

    @Override
    public String toString() {
        return "PaymentsDAO{" + "customerNumber=" + customerNumber + ", chekcNumber=" + chekcNumber + ", paymentDate=" + paymentDate + ", amount=" + amount + '}';
    }

    public PaymentsDAO() {
    }

    public PaymentsDAO(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public PaymentsDAO(String chekcNumber, LocalDate paymentDate, double amount) {
        this.chekcNumber = chekcNumber;
        this.paymentDate = paymentDate;
        this.amount = amount;
    }

    public PaymentsDAO(int customerNumber, String checkNumber, LocalDate paymentDate, double amount) {
        this(checkNumber, paymentDate, amount);
        this.customerNumber = customerNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCheckNumber() {
        return chekcNumber;
    }

    public void setCheckNumber(String chekcNumber) {
        this.chekcNumber = chekcNumber;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    @Override
    public List listar() {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = Connect.Conex.getConnection();
        String sql = "SELECT * FROM payments";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                PaymentsDAO payment = new PaymentsDAO();
                payment.setCustomerNumber(rs.getInt("CustomerNumber"));
                payment.setCheckNumber(rs.getString("CustomerName"));
                payment.setPaymentDate(rs.getDate("paymentDate").toLocalDate());
                payment.setAmount(rs.getDouble("contactLastName"));
                this.payments.add(payment);
            }
        } catch (SQLException e) {
            System.out.println("Ha habido un error al listar: " + e);
        }
        return payments;
    }

    @Override
    public boolean eliminar(Object obj) {
        PaymentsDAO payment = (PaymentsDAO) obj;
        Scanner sc = new Scanner(System.in);
        boolean succes = false;
        PreparedStatement ps;
        Connection con = Connect.Conex.getConnection();
        String sql = "DELETE FROM payments WHERE checkNumber = ?";
        try {
            ps = con.prepareStatement(sql);
            System.out.println("Estas seguro de que quieres elimiar el pago: 1-Si o 2-No " + payment.buscar(payment));
            int opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1 -> ps.executeQuery();
                case 2 -> System.out.println("No se elimina");
                default -> System.out.println("Introduce un numero correcto");
            }
            succes = true;
        } catch (SQLException e) {
            System.out.println("Ha habido un error eliminado: " + e);
        } finally {
            sc.close();
        }
        return succes;
    }

    @Override
    public boolean añadir(Object obj) {
        PaymentsDAO payment = (PaymentsDAO) obj;
        boolean succes = false;
        PreparedStatement ps;
        Connection con = Connect.Conex.getConnection();
        String sql = "INSERT INTO payments (customerNumber, checkNumber, paymentDate, amount)"
                + "VALUES (?, ?, ?, ?);";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(0, payment.getCustomerNumber());
            ps.setString(1, payment.getCheckNumber());
            ps.setDate(2 ,java.sql.Date.valueOf(payment.getPaymentDate()));
            ps.setDouble(3 ,payment.getAmount());
            ps.execute();
            this.payments.add(payment);
            succes = true;
        } catch (SQLException e) {
            System.out.println("Ha habido un error al listar: " + e);
        }
        return succes;
    }

    @Override
    public boolean modificar(Object obj) {
        PaymentsDAO payment = (PaymentsDAO) obj;
        String sql = "UPDATE payments SET customerNumber = ? , checkNumber= ? , paymentDate = ?, amount = ? WHERE id = ?";
        boolean succes = false;
        PreparedStatement ps;
        Connection con = Connect.Conex.getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(0, payment.getCustomerNumber());
            ps.setString(1, payment.getCheckNumber());
            ps.setString(2 ,payment.getPaymentDate().toString());
            ps.setDouble(3 ,payment.getAmount());
            ps.execute();
            succes = true;
        } catch (SQLException e) {
            System.out.println("Ha habido un error al listar: " + e);
        }
        return succes;
    }

    @Override
    public boolean buscar(Object obj) {
        boolean succes = false;
        PreparedStatement ps;
        PaymentsDAO payment = new PaymentsDAO();
        ResultSet rs;
        Connection con = Connect.Conex.getConnection();
        String sql = "SELECT * FROM payments WHERE checkNumber = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, payment.getCustomerNumber());
            rs = ps.executeQuery();
            while (rs.next()) {
                payment.setCustomerNumber(rs.getInt("customerNumber"));
                payment.setCheckNumber(rs.getString("checkNumber"));
                LocalDate f = LocalDate.parse(rs.getString("paymentDate"));
                payment.setPaymentDate(rs.getDate("paymentDate").toLocalDate());
                payment.setAmount(rs.getDouble("amount"));
                succes = true;
            }
        } catch (SQLException e) {
            System.out.println("Ha habido un error al listar el pago: " + e);
        }
        System.out.println(payment);
        return succes;
    }
}
