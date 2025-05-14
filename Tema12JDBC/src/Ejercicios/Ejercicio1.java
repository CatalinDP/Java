package Ejercicios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
        
/**
 * Ejercicio 1
 * Incrementar la nota media en un punto a todos los alumnos del curso "1B".
 * Usar consulta SQL que haga uso de UPDATE.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/instituto";
            Connection con;
        try {
            con = DriverManager.getConnection(url, user, pass);
            String sentencia = "UPDATE alumnos SET media = media+1 WHERE curso = '1B'";
            if (con != null) {
                System.out.println("Conectado");
            } else {
                System.out.println("No conectado");
            }
            Statement st = con.createStatement();
            st.execute(sentencia);
            con.close();
            st.close();
            System.out.println("Nota sumada");
        } catch (SQLException ex) {
            Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
}
