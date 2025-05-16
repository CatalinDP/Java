package Tema12Practica.Ejercicio3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Crea un programa que lea todos los datos de un empleado, excepto la fecha de contratación 
 * que será la de hoy, y los inserte en la base de datos. 
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/empresa";
        String user = "root";
        String pass = "";
        String sql = "INSERT INTO empleados values(?, ?, ?, ?, ?, ?)";
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(url, user, pass);
            PreparedStatement ps;
            Scanner sc  = new Scanner(System.in);
            ps = conn.prepareStatement(sql);
            System.out.println("Inserte el valor del numero del empleado");
            int numEmp = Integer.parseInt(sc.nextLine());
            System.out.println("Dime el nombre del empleado");
            String nombre = sc.nextLine();
            System.out.println("Dime la edad del empleado");
            int edad = Integer.parseInt(sc.nextLine());
            System.out.println("Dime la oficina del empleado");
            int oficina = Integer.parseInt(sc.nextLine());
            System.out.println("Dime el puesto del empleado");
            String puesto = sc.nextLine();
            ps.setInt(1, numEmp);
            ps.setString(2, nombre);
            ps.setInt(3, edad);
            ps.setInt(4, oficina);
            ps.setString(5, puesto);
            ps.setDate(6, java.sql.Date.valueOf(LocalDate.now()));
            int filas = ps.executeUpdate();
            System.out.println("Filas devueltas: " + filas);
        } catch (SQLException ex) {
            System.out.println("Ha habido un error: " + ex);
        } catch (NumberFormatException ex) {
            System.out.println("Datos introducidos incorrectos: " + ex);
        }
    }
}
