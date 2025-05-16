package Tema12Practica.Ejercicio2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * Muestra un listado con el nombre y la edad de los empleados cuya edad se encuentra 
 * comprendida entre un valor máximo y un valor mínimo, introducidos por el usuario. 
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/empresa";
        String user = "root";
        String pass = "";
        String sql = "SELECT numemp, nombre, oficina, edad, puesto FROM empleados WHERE edad > ? AND edad < ?";
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(url, user, pass);
            PreparedStatement st;
            ResultSet rs;
            
            st = conn.prepareStatement(sql);
            System.out.println("Dime un valor maximo de la edad de un empleado");
            int max = new Scanner(System.in).nextInt();
            System.out.println("Dime un valor minimo de la edad de un empleado");
            int min = new Scanner(System.in).nextInt();
            st.setInt(1, min);
            st.setInt(2, max);
            rs = st.executeQuery();
            while (rs.next()) {
                System.out.println("Empleado: " + rs.getInt("numemp") + ", " + rs.getString("nombre") + ", oficina: " + rs.getInt("oficina") + ", puesto: " + rs.getString("puesto") + ", edad: " + rs.getInt("edad"));
            }
        } catch (SQLException ex) {
            System.out.println("Ha habido un error: " + ex);
        }
    }
}
