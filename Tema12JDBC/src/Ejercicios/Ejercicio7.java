package Ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * Ejercicio 7
 * Escribir un programa que muestre todos los alumnos de un curso cuya nota es mayor que cierta nota de corte.
 * Tanto el curso como la nota de corte serán introducidos por el usuario.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Connection conn = null;
        String user = "root";
        String pass = "";
        String url = "jdbc:mysql://localhost:3306/instituto";
        String sql = "SELECT nombre, media FROM alumnos WHERE curso = ? AND media > ?";
        try {
            conn = DriverManager.getConnection(url, user, pass);
            if (conn != null) {
                System.out.println("Conectado");
            } else {
                System.out.println("Error");
            } 
            PreparedStatement st;
            ResultSet rs;
            st = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime la nota de corte");
            double notaCorte = Double.parseDouble(sc.nextLine());
            System.out.println("Dime el curso");
            String curso = sc.nextLine();
            st.setString(1, curso);
            st.setDouble(2, notaCorte);
            rs = st.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("nombre")+": "+ rs.getDouble("media"));
            }
            conn.close();
            } catch (SQLException ex) {
               System.out.println("Ha habido un error: " + ex);     
        }
    }
}
