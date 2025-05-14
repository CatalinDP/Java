package Ejercicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;
/**
 * Ejercicio 4
 * Mostar el nombre y fecha de nacimiento de todos los alumnos de un curso, que se solicitará por teclado
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Connection conn;
        String url = "jdbc:mysql://localhost:3306/instituto";
        String user = "root";
        String pass = "";
        String sql = "SELECT nombre, fnac FROM alumnos WHERE curso = ?";
        try {
            conn = DriverManager.getConnection(url, user, pass);
            if (conn != null) {
                System.out.println("Conectado");
            }
            System.out.println("Que curso quieres que nombre");
            String curso = new Scanner(System.in).nextLine();
            ResultSet rs;
            PreparedStatement pr;
            pr = conn.prepareStatement(sql);
            pr.setString(1, curso);
            rs = pr.executeQuery();
            while (rs.next()) {
                System.out.println("Alumno: " + rs.getString("nombre") + ", " + rs.getDate("fnac"));
            }
            conn.close();
            rs.close();
            pr.close();
        } catch (SQLException ex) {
            System.out.println("Ha habido un error: " + ex);
        }
    }
}
