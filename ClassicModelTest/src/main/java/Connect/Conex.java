/*

 */
package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conex {
        public static Connection getConnection() {
            String url = "jdbc:mysql://localhost:3306/classicmodels";
            String user = "conex";
            String pass = "";
            Connection con = null;    
        try {
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected");
        } catch (SQLException e) {
            System.out.println("Ha habido un error con la conexión: " + e);
        }
        return con;
        }
}
