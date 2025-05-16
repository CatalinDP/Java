package Tema12Practica.Ejercicio1;
/**
 * Ejercicio 1
 * Crea un programa que muestre todos los empleados. 
 */

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Ejercicio1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/empresa";
        String user = "root";
        String pass = "";
        String sql = "SELECT numemp, nombre, oficina, puesto FROM empleados";
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(url, user, pass);
            Statement st;
            ResultSet rs;
            
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println("Empleado: " + rs.getInt("numemp") + ", " + rs.getString("nombre") + ", oficina: " + rs.getInt("oficina") + ", puesto: " + rs.getString("puesto"));
            }
        } catch (SQLException ex) {
            System.out.println("Ha habido un error: " + ex);
        }
    }
}
