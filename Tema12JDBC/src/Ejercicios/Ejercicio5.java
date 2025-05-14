package Ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Ejercicio 5
 * Modificar el ejercicio 4 para que los alumnos se muestren en orden inverso.
 * Si existera algún criterio de ordenación en la consulta SQL, se podría podificar para que fuera justo el contrario. 
 * Pero en el 4 no existe criterio de ordenación alguno, por lo tanto tendremos que colocar el cursos detrás de la última fila
 */
public class Ejercicio5 {
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
            pr = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pr.setString(1, curso);
            rs = pr.executeQuery();
            rs.afterLast();
            while (rs.previous()) {
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
