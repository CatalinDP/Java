package Ejercicios;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
/**
 * Ejercicio 2
 * Realizar una aplicación que solicite todos los datos de un nuevo alumno y los inserte en la base de datos.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String url = "jdbc:mysql://localhost:3306/instituto";
        String user = "root";
        String pass = "";
        Connection conn;
        String sentencia = "INSERT INTO alumnos(curso, fnac, media, nombre) VALUES(?, ?, ?, ?)";
        try {
            conn = DriverManager.getConnection(url, user, pass);
            if (conn != null) {
                System.out.println("Conectado");
            } else {
                System.out.println("No conectado");
            }
            System.out.println("Curso del alumno");
            String curso = sc.nextLine();
            System.out.println("Fecha nacimiento");
            LocalDate fechaNac = LocalDate.parse(sc.nextLine());
            System.out.println("Media del alumno");
            double media = Double.parseDouble(sc.nextLine());
            System.out.println("Nombre del alumno");
            String nombre = sc.nextLine();
            PreparedStatement ps = conn.prepareStatement(sentencia);
            ps.setString(1, curso);
            ps.setDate(2, java.sql.Date.valueOf(fechaNac));
            ps.setDouble(3, media);
            ps.setString(4, nombre);
            ps.executeUpdate();
            conn.close();
            System.out.println("Alumno añadido");
        } catch (SQLException ex) {
            System.out.println("Ha habido un error: " + ex);
        }
    }
}
