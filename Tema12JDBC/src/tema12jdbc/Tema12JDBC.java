package tema12jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Tema12JDBC {
public static void main(String[] args) { 
        String usuario_ddbb = "root"; 
        String password_bbdd = ""; 
        String url = "jdbc:mysql://localhost:3306/instituto"; 
        Connection connection; 
        Statement st = null; 
        try { 
            // Paso 1: Cargar el controlador JDBC 
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            // Paso 2: Establecer la conexión 
            connection = DriverManager.getConnection(url, usuario_ddbb, 
                password_bbdd); 
            if (connection != null) { 
                st = connection.createStatement(); 
                System.out.println("Conectado "); 
            } else { 
                System.err.println("Conexion fallida. "); 
            } 
        } catch (SQLException e) { 
            System.err.println("Error de conexión. "+ e.getMessage()); 
        } catch (ClassNotFoundException e) { 
            System.err.println("Error al cargar el controlador. "+ 
            e.getMessage()); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    }  
}
