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


public class OrdersDAO implements BaseDAO {

    @Override
    public String toString() {
        return "ordersDAO{" + "orderNumber=" + orderNumber + ", orderDate=" + orderDate + ", requiredDate=" + requiredDate + ", status=" + status + ", cooments=" + cooments + ", customerNumber=" + customerNumber + '}';
    }
    private int orderNumber;
    private LocalDate orderDate;
    private LocalDate shippedDate;
    private LocalDate requiredDate;
    private String status;
    private String cooments;
    private int customerNumber;
    List<OrdersDAO> orders = new ArrayList();

    public OrdersDAO() {
    }

    public OrdersDAO(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrdersDAO(LocalDate orderDate, LocalDate requiredDate, String status, String cooments, int customerNumber) {
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.status = status;
        this.cooments = cooments;
        this.customerNumber = customerNumber;
    }

    public OrdersDAO(int orderNumber, LocalDate orderDate, LocalDate requiredDate, String status, String coments, int customerNumber) {
        this(orderDate, requiredDate, status, coments, customerNumber);
        this.orderNumber = orderNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public LocalDate getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(LocalDate shippedDate) {
        this.shippedDate = shippedDate;
    }

    
    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(LocalDate requiredDate) {
        this.requiredDate = requiredDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComments() {
        return cooments;
    }

    public void setComments(String cooments) {
        this.cooments = cooments;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
    
    @Override
    public List listar() {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = Connect.Conex.getConnection();
        String sql = "SELECT * FROM orders";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                OrdersDAO order = new OrdersDAO();
                order.setOrderNumber(rs.getInt("orderNumber"));
                order.setOrderDate(rs.getDate("orderDate").toLocalDate());
                order.setRequiredDate(rs.getDate("requiredDate").toLocalDate());
                order.setShippedDate(rs.getDate("shippedDate").toLocalDate());
                order.setStatus(rs.getString("status"));
                order.setComments(rs.getString("comments"));
                order.setCustomerNumber(rs.getInt("customerNumber"));
                this.orders.add(order);
            }
        } catch (SQLException e) {
            System.out.println("Ha habido un error al listar: " + e);
        }
        return orders;
    }

    @Override
    public boolean eliminar(Object obj) {
        OrdersDAO order = (OrdersDAO) obj;
        Scanner sc = new Scanner(System.in);
        boolean succes = false;
        PreparedStatement ps;
        Connection con = Connect.Conex.getConnection();
        String sql = "DELETE FROM orders WHERE orderNumber = ?";
        try {
            ps = con.prepareStatement(sql);
            System.out.println("Estas seguro de que quieres elimiar el pedido: 1-Si o 2-No " + order.buscar(order));
            int opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1 -> ps.executeQuery();
                case 2 -> System.out.println("No se elimina");
                default -> System.out.println("Introduce un numero correcto");
            }
            succes = true;
        } catch (SQLException e) {
            System.out.println("Ha habido un error eliminando: " + e);
        } finally {
            sc.close();
        }
        return succes;
    }

    @Override
    public boolean añadir(Object obj) {
        OrdersDAO order = (OrdersDAO) obj;
        boolean succes = false;
        PreparedStatement ps;
        Connection con = Connect.Conex.getConnection();
        String sql = "INSERT INTO payments (orderNumber, orderDate, requiredDate, shippedDate, status, comments, customerNumber)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?);";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(0, order.getOrderNumber());
            ps.setDate(1, java.sql.Date.valueOf(order.getOrderDate()));
            ps.setDate(2 ,java.sql.Date.valueOf(order.getRequiredDate()));
            ps.setDate(3 ,java.sql.Date.valueOf(order.getShippedDate()));
            ps.setString(4 ,order.getStatus());
            ps.setString(5 ,order.getComments());
            ps.setInt(6 ,order.getCustomerNumber());
            ps.execute();
            this.orders.add(order);
            succes = true;
        } catch (SQLException e) {
            System.out.println("Ha habido un error al listar: " + e);
        }
        return succes;
    }

    @Override
    public boolean modificar(Object obj) {
        OrdersDAO order = (OrdersDAO) obj;
        String sql = "UPDATE payments SET orderNumber = ? , orderDate = ? , requiredDate = ?, shippedDate = ?, status = ?, comments = ?, customerNumber = ? WHERE orderNumber = ?";
        boolean succes = false;
        PreparedStatement ps;
        Connection con = Connect.Conex.getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(0, order.getCustomerNumber());
            ps.setDate(1, java.sql.Date.valueOf(order.getOrderDate()));
            ps.setDate(2, java.sql.Date.valueOf(order.getRequiredDate()));
            ps.setDate(3, java.sql.Date.valueOf(order.getShippedDate()));
            ps.setString(4, order.getStatus());
            ps.setString(5, order.getComments());
            ps.setInt(6, order.getCustomerNumber());
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
        OrdersDAO order = new OrdersDAO();
        ResultSet rs;
        Connection con = Connect.Conex.getConnection();
        String sql = "SELECT * FROM orders WHERE orderNumber = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, order.getCustomerNumber());
            rs = ps.executeQuery();
            while (rs.next()) {
                order.setOrderNumber(rs.getInt("orderNumber"));
                order.setOrderDate(rs.getDate("orderDate").toLocalDate());
                order.setRequiredDate(rs.getDate("requiredDate").toLocalDate());
                order.setShippedDate(rs.getDate("shippedDate").toLocalDate());
                order.setStatus(rs.getString("status"));
                order.setComments(rs.getString("comments"));
                order.setCustomerNumber(rs.getInt("customerNumber"));
                succes = true;
            }
        } catch (SQLException e) {
            System.out.println("Ha habido un error al listar el pedido: " + e);
        }
        System.out.println(order);
        return succes;
    }
    
}
