package Ejercicios;

/**
 * Ejercicio 8
 * Diseñar una app que muestre un informe de los alumnos, según sus notas: 
 * todos los alumnos cuya notas bien(6-7) y todos los alumnos cuya nota es Notable(7-9).
 * Cada informe debe ordenarse por la nota de forma ascendente. Usar parametros y reutilizaremos.
 */
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class Ejercicio8 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/instituto";
        String pass = "";
        String user = "root";
        String sql = "SELECT nombre, media FROM alumnos WHERE media > ? and media <= ? ORDER BY media ASC";
        Connection conn = null;
        PreparedStatement ps;
        ResultSet rs;
        
        try {
             conn = DriverManager.getConnection(url, user, pass);
             if (conn != null) {
                 System.out.println("Connected");
             } else {
                 System.out.println("Not connected");
             }
             
            ps = conn.prepareStatement(sql);
            otbenerAlumnosPorNota(6, 7, ps);
            otbenerAlumnosPorNota(7, 9, ps);

            conn.close();
        } catch (SQLException ex) {
            System.out.println("Ha habido un error: " + ex);
        }  
    }
    static void otbenerAlumnosPorNota(double min, double max, PreparedStatement ps) throws SQLException {
        ps.setDouble(1, min);
        ps.setDouble(2, max);
        ResultSet rs;
        rs = ps.executeQuery();
        System.out.println("--------------------------");
        System.out.println("Alumnos: ");
        while (rs.next()) {
            System.out.println(rs.getString("nombre") + ", nota: " + rs.getDouble("media"));
        }
        System.out.println("--------------------------");
    }
}
