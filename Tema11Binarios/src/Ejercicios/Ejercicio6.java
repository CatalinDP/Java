package Ejercicios;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Ejercicio 6
 * Recuperar la estrofa del archivo cancion pirata y mostrar por consola
 */
public class Ejercicio6 {
public static void main(String[] args) {
        try (FileInputStream archivo = new FileInputStream("src\\Ejercicios\\Archivos\\cancionPirata.dat"); ObjectInputStream inp = new ObjectInputStream(archivo)) {
            String estrofa = (String) inp.readObject();
            System.out.println(estrofa);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex);
        }
    }
}
