
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeesDAO implements BaseDAO {
    private int employeeNumber;
    private String lastName;
    private String firstName;
    private String extension;
    private String email;
    private String jobTitle;
    private int officeCode;
    private int reportsTo;
    List<EmployeesDAO> employees = new ArrayList();
    
    public EmployeesDAO() {
    }
    @Override
    public String toString() {
        return "EmployeesDAO{" + "employeeNumber=" + employeeNumber + ", lastName=" + lastName + ", firstName=" + firstName + ", extension=" + extension + ", email=" + email + ", jobTitle=" + jobTitle + ", officeCode=" + officeCode + ", reportsTo=" + reportsTo + '}';
    }

    public EmployeesDAO(String lastName, String firstName, String extension, String email, String jobTitle, int officeCode, int reportsTo) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.extension = extension;
        this.email = email;
        this.jobTitle = jobTitle;
        this.officeCode = officeCode;
        this.reportsTo = reportsTo;
    }

    public EmployeesDAO(int employeeNumber, String lastName, String firstName, String extension, String email, String jobTitle, int officeCode, int reportsTo) {
        this(lastName, firstName, extension, email, jobTitle, officeCode, reportsTo);
        this.employeeNumber = employeeNumber;
    }

    public EmployeesDAO(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(int officeCode) {
        this.officeCode = officeCode;
    }

    public int getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(int reportsTo) {
        this.reportsTo = reportsTo;
    }
    
    @Override
    public List listar() {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = Connect.Conex.getConnection();
        String sql = "SELECT * FROM employees";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                EmployeesDAO employee = new EmployeesDAO();
                employee.setEmployeeNumber(rs.getInt("employeeNumber"));
                employee.setLastName(rs.getString("lastName"));
                employee.setFirstName(rs.getString("firstName"));
                employee.setExtension(rs.getString("extension"));
                employee.setEmail(rs.getString("email"));
                employee.setOfficeCode(rs.getInt("officeCode"));
                employee.setReportsTo(rs.getInt("reportsTo"));
                employee.setJobTitle(rs.getString("jobTitle"));
                this.employees.add(employee);
            }
        } catch (SQLException e) {
            System.out.println("Ha habido un error al listar: " + e);
        }
        return employees;
    }

    @Override
    public boolean eliminar(Object obj) {
        EmployeesDAO employee = (EmployeesDAO) obj;
        Scanner sc = new Scanner(System.in);
        boolean succes = false;
        PreparedStatement ps;
        Connection con = Connect.Conex.getConnection();
        String sql = "DELETE FROM employee WHERE employeeNumber = ?";
        try {
            ps = con.prepareStatement(sql);
            System.out.println("Estas seguro de que quieres elimiar el empledo: 1-Si o 2-No " + employee.buscar(employee));
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
        EmployeesDAO employee = (EmployeesDAO) obj;
        boolean succes = false;
        PreparedStatement ps;
        Connection con = Connect.Conex.getConnection();
        String sql = "INSERT INTO employees (employeeNumber, lastName, firstName, extension, email, officeCode, reportsTo, jobTitle)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(0, employee.getEmployeeNumber());
            ps.setString(1, employee.getLastName());
            ps.setString(2 ,employee.getFirstName());
            ps.setString(3 ,employee.getExtension());
            ps.setString(4 ,employee.getEmail());
            ps.setInt(5 ,employee.getOfficeCode());
            ps.setInt(6 ,employee.getReportsTo());
            ps.setString(7 ,employee.getJobTitle());
            ps.execute();
            this.employees.add(employee);
            succes = true;
        } catch (SQLException e) {
            System.out.println("Ha habido un error al listar: " + e);
        }
        return succes;
    }

    @Override
    public boolean modificar(Object obj) {
        EmployeesDAO employee = (EmployeesDAO) obj;
        String sql = "UPDATE employees SET employeeNumber = ? , lastName = ? , firstName = ?, extension = ?, email = ?, officeCode = ?, reportsTo = ?, jobTitle = ? WHERE id = ?";
        boolean succes = false;
        PreparedStatement ps;
        Connection con = Connect.Conex.getConnection();
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(0, employee.getEmployeeNumber());
            ps.setString(1, employee.getLastName());
            ps.setString(2 ,employee.getFirstName());
            ps.setString(3 ,employee.getExtension());
            ps.setString(4 ,employee.getEmail());
            ps.setInt(5 ,employee.getOfficeCode());
            ps.setInt(6 ,employee.getReportsTo());
            ps.setString(7 ,employee.getJobTitle());
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
        EmployeesDAO employee = new EmployeesDAO();
        ResultSet rs;
        Connection con = Connect.Conex.getConnection();
        String sql = "SELECT * FROM employees WHERE employeeNumber = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, employee.getEmployeeNumber());
            rs = ps.executeQuery();
            while (rs.next()) {
                employee.setEmployeeNumber(rs.getInt("EmployeeNumber"));
                employee.setLastName(rs.getString("lastName"));
                employee.setFirstName(rs.getString("firstName"));
                employee.setExtension(rs.getString("extension"));
                employee.setEmail(rs.getString("email"));
                employee.setOfficeCode(rs.getInt("officeCode"));
                employee.setReportsTo(rs.getInt("reportsTo"));
                employee.setJobTitle(rs.getString("jobTitle"));
                succes = true;
            }
        } catch (SQLException e) {
            System.out.println("Ha habido un error al listar el empleado: " + e);
        }
        System.out.println(employee);
        return succes;
    }
}

