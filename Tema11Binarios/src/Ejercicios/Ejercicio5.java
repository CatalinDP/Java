package Ejercicios;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Ejercicio 5
 * Leer un array de enteros de un archivo datos.dat
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        try (
        FileInputStream archivo = new FileInputStream("src\\Ejercicios\\Archivos\\datos.dat");
        ObjectInputStream inp = new ObjectInputStream(archivo)
        ) {
            for (int i = 0; i < 10; i++) {
                System.out.println(inp.readInt());
            }
        } catch(IOException ex) {
            System.out.println("Error: " + ex);
        }
    }
}
