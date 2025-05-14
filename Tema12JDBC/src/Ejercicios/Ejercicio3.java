package Ejercicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.Scanner;

/**
 * Solicitar el número de un alumno y elíminalo de la base de datos
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/instituto";
        String user = "root";
        String pass = "";
        String sentencia = "DELETE FROM alumnos WHERE num = ?";
        Connection conn;
        Scanner sc = new Scanner(System.in);
        try {
            conn = DriverManager.getConnection(url, user, pass);
            if (conn != null) {
                System.out.println("Conectado");
            } else {
                System.out.println("No conectado");
            }
            PreparedStatement ps;
            ps = conn.prepareStatement(sentencia);
            System.out.println("Dime el numero del alumno a eliminar");
            int numero = sc.nextInt();
            ps.setInt(1, numero);
            ps.execute();
            conn.close();
            sc.close();
            System.out.println("Alumno eliminado");
        } catch (SQLException ex) {
            System.out.println("Ha habido un error: " + ex);
        }
    }
}
