package zonafit.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/gym_db";
        String user = "root";
        String pass = "";
        Connection conn = null;
    
        try {
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected");
        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }
        return conn;
    }
}
