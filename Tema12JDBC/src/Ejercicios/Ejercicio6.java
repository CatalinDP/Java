package Ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Ejericio 6
 * Mostrar el nombre y nota de todos los alumnos y, a posteriori, mostrar el alumno con la mejor nota y al alumno con la peor nota media.
 * Obtener los alumnos con la mejor y la peor nota posible mediante una consulta SQL. Existen distintas soluciones:
 * Union, subconsultas, etc. 
 * En lugar de estos, aprovecharemos la consulta que devuelve todos los alumnos ordenados por su nota media en orden decreciente,
 * ya que el rimer alumno será el que posea la mejor nota y el último el que tenga la nota más baja.
 * Por sencillez, supondremos que no existen alumnos con notas repetidas
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Connection conn = null;
        String user = "root";
        String pass = "";
        String url = "jdbc:mysql://localhost:3306/instituto";
        String sql = "SELECT nombre, media FROM alumnos ORDER BY media DESC";
        try {
            conn = DriverManager.getConnection(url, user, pass);
            if (conn != null) {
                System.out.println("Conectado");
            } else {
                System.out.println("Error");
            } 
            Statement st;
            ResultSet rs;
            st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("nombre")+": " + rs.getDouble("media"));
            }
            if (rs.first()) {
                System.out.println("Mejor nota-> " + rs.getString("nombre")+": " + rs.getDouble("media"));
            } 
            if (rs.last()){
                System.out.println("Peor nota-> " + rs.getString("nombre")+": " + rs.getDouble("media"));
            }
            conn.close();
            } catch (SQLException ex) {
               System.out.println("Ha habido un error: " + ex);     
            }
    }
}
