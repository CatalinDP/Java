package Tema12Practica.Ejercicio4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Crea un programa que permita modificar la ciudad e incrementar las ventas de una oficina. 
 * Todos los valores serán introducidos por teclado por el usuario. 
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/empresa";
        String user = "root";
        String pass = "";
        String sql = "UPDATE oficinas set ciudad = ?, ventas = ? WHERE oficina = ?";
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(url, user, pass);
            PreparedStatement ps;
            Scanner sc  = new Scanner(System.in);
            ps = conn.prepareStatement(sql);
            System.out.println("Inserte el valor de la oficina a modificar");
            int oficina = Integer.parseInt(sc.nextLine());
            System.out.println("Dime el nuevo dato de ventas");
            double ventas = Double.parseDouble(sc.nextLine());
            System.out.println("Dime la nueva ciudad");
            String ciudad = sc.nextLine();
            ps.setString(1, ciudad);
            ps.setDouble(2, ventas);
            ps.setInt(3, oficina);

            int filas = ps.executeUpdate();
            System.out.println("Filas devueltas: " + filas);
        } catch (SQLException ex) {
            System.out.println("Ha habido un error: " + ex);
        } catch (NumberFormatException ex) {
            System.out.println("Datos introducidos incorrectos: " + ex);
        }
    }
}
