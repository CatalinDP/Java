package DAO;
import Connect.Conex;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomersDAO implements BaseDAO{
    private int customerNumber;
    private String customerName;
    private String contactLastName;
    private String contactFirstName;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String country;
    private String postalCode;
    private int salesRepEmployeeNumber;
    private double creditLimit;
    List<CustomersDAO> customers = new ArrayList();

    public CustomersDAO() {
    }

    public CustomersDAO(String customerName, String contactLastName, String contactFirstName, String phone, String addressLine1, String addressLine2, String city, String state, String country, String postalCode, int salesRepEmployeeNumber, double creditLimit) {
        this.customerName = customerName;
        this.contactLastName = contactLastName;
        this.contactFirstName = contactFirstName;
        this.phone = phone;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.postalCode = postalCode;
        this.salesRepEmployeeNumber = salesRepEmployeeNumber;
        this.creditLimit = creditLimit;
    }

    public CustomersDAO(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public CustomersDAO(int customerNumber, String customerName, String contactLastName, String contactFirstName, String phone, String addressLine1, String addressLine2, String city, String state, String country, String postalCode, int salesRepEmployeeNumber, double creditLimit) {
        this(customerName,contactLastName,contactFirstName,phone,addressLine1,addressLine2,city,state,country,postalCode,salesRepEmployeeNumber,creditLimit);
        this.customerNumber = customerNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String adressline1) {
        this.addressLine1 = adressline1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String adressline2) {
        this.addressLine2 = adressline2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public int getSalesRepEmployeeNumber() {
        return salesRepEmployeeNumber;
    }

    public void setSalesRepEmployeeNumber(int salesRepEmployeeNumber) {
        this.salesRepEmployeeNumber = salesRepEmployeeNumber;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public List listar() {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = Connect.Conex.getConnection();
        String sql = "SELECT * FROM customers";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                CustomersDAO customer = new CustomersDAO();
                customer.setCustomerNumber(rs.getInt("CustomerNumber"));
                customer.setCustomerName(rs.getString("CustomerName"));
                customer.setContactFirstName(rs.getString("contactFirstName"));
                customer.setContactLastName(rs.getString("contactLastName"));
                customer.setPhone(rs.getString("phone"));
                customer.setAddressLine1(rs.getString("addressLine1"));
                customer.setAddressLine2(rs.getString("addressLine2"));
                customer.setCity(rs.getString("city"));
                customer.setState(rs.getString("state"));
                customer.setPostalCode(rs.getString("postalCode"));
                customer.setCountry(rs.getString("country"));
                customer.setSalesRepEmployeeNumber(rs.getInt("salesRepEmployeeNumber"));
                customer.setCreditLimit(rs.getDouble("creditLimit"));
                this.customers.add(customer);
            }
        } catch (SQLException e) {
            System.out.println("Ha habido un error al listar: " + e);
        }
        return customers;
    }

    @Override
    public boolean eliminar(Object obj) {
        CustomersDAO customer = (CustomersDAO) obj;
        Scanner sc = new Scanner(System.in);
        boolean succes = false;
        PreparedStatement ps;
        Connection con = Connect.Conex.getConnection();
        String sql = "DELETE FROM customers WHERE customerNumber = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, customer.getCustomerNumber());
            System.out.println("Estas seguro de que quieres elimiar el cliente: 1-Si o 2-No " + customer.buscar(customer));
            int opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1 -> ps.execute();
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
        CustomersDAO customer = (CustomersDAO) obj;
        boolean succes = false;
        PreparedStatement ps;
        Connection con = Connect.Conex.getConnection();
        String sql = "INSERT INTO customers (customerNumber, customerName, contactLastName, contactFirstName, phone, addressLine1, addressLine2, city, state, postalCode, country, salesRepEmployeeNumber, creditLimit)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, customer.getCustomerNumber());
            ps.setString(2, customer.getCustomerName());
            ps.setString(3 ,customer.getContactLastName());
            ps.setString(4 ,customer.getContactFirstName());
            ps.setString(5 ,customer.getPhone());
            ps.setString(6 ,customer.getAddressLine1());
            ps.setString(7 ,customer.getAddressLine2());
            ps.setString(8 ,customer.getCity());
            ps.setString(9 ,customer.getState());
            ps.setString(10, customer.getPostalCode());
            ps.setString(11 ,customer.getCountry());
            ps.setInt(12 ,customer.getSalesRepEmployeeNumber());
            ps.setDouble(13 ,customer.getCreditLimit());
            ps.execute();
            this.customers.add(customer);
            System.out.println(customer);
            succes = true;
        } catch (SQLException e) {
            System.out.println("Ha habido un error al añadir: " + e);
        }
        return succes;
    }

    @Override
    public boolean modificar(Object obj) {
        CustomersDAO customer = (CustomersDAO) obj;
        String sql = "UPDATE customers SET customerNumber = ? , customerName = ? , contactLastName = ?, contactFirstName = ?, phone = ?, addressLine1 = ?, addressLine2 = ?, city = ?, state = ?, "
                + "postalCode = ?, country = ?, salesRepEmployeeNumber = ?,creditLimit = ? WHERE customerNumber = ?";
        boolean succes = false;
        PreparedStatement ps;
        Connection con = Connect.Conex.getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, customer.getCustomerNumber());
            ps.setString(2, customer.getCustomerName());
            ps.setString(3 ,customer.getContactLastName());
            ps.setString(4 ,customer.getContactFirstName());
            ps.setString(5 ,customer.getPhone());
            ps.setString(6 ,customer.getAddressLine1());
            ps.setString(7 ,customer.getAddressLine2());
            ps.setString(8 ,customer.getCity());
            ps.setString(9 ,customer.getState());
            ps.setString(10, customer.getPostalCode());
            ps.setString(11 ,customer.getCountry());
            ps.setInt(12 ,customer.getSalesRepEmployeeNumber());
            ps.setDouble(13 ,customer.getCreditLimit());
            ps.setDouble(14 ,customer.getCustomerNumber());
            ps.execute();
            succes = true;
        } catch (SQLException e) {
            System.out.println("Ha habido un error al listar: " + e);
        }
        return succes;
    }

    @Override
    public String toString() {
        return "CustomersDAO{" + "customerNumber=" + customerNumber + ", customerName=" + customerName + ", customerLastName=" + contactLastName + ", phone=" + phone + ", adressline1=" + addressLine1 + ", adressline2=" + addressLine2 + ", city=" + city + ", state=" + state + ", country=" + country + ", postalCode=" + postalCode + ", salesRepEmployeeNumber=" + salesRepEmployeeNumber + ", creditLimit=" + creditLimit + '}';
    }

    @Override
    public boolean buscar(Object obj) {
        boolean succes = false;
        PreparedStatement ps;
        CustomersDAO customer = (CustomersDAO)obj;
        ResultSet rs;
        Connection con = Connect.Conex.getConnection();
        String sql = "SELECT * FROM customers WHERE customerNumber = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, customer.getCustomerNumber());
            rs = ps.executeQuery();
            while (rs.next()) {
                customer.setCustomerNumber(rs.getInt("CustomerNumber"));
                customer.setCustomerName(rs.getString("CustomerName"));
                customer.setContactFirstName(rs.getString("contactFirstName"));
                customer.setContactLastName(rs.getString("contactLastName"));
                customer.setPhone(rs.getString("phone"));
                customer.setAddressLine1(rs.getString("addressLine1"));
                customer.setAddressLine2(rs.getString("addressLine2"));
                customer.setCity(rs.getString("city"));
                customer.setState(rs.getString("state"));
                customer.setPostalCode(rs.getString("postalCode"));
                customer.setCountry(rs.getString("country"));
                customer.setSalesRepEmployeeNumber(rs.getInt("salesRepEmployeeNumber"));
                customer.setCreditLimit(rs.getInt("creditLimit"));
                succes = true;
            }
        } catch (SQLException e) {
            System.out.println("Ha habido un error al listar el cliente: " + e);
        }
        System.out.println(customer);
        return succes;
    }
    
    
}
