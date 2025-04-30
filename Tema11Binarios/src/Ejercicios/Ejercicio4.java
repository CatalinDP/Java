package Ejercicios;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.Arrays;

/**
 * Ejercicio 4
 * Leer de un archivo datos.dat 10 números enteros, guardandolos en un array de tipo int
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        int[] arr = null;
        try (
        FileInputStream archivo = new FileInputStream("src\\Ejercicios\\Archivos\\datos.dat");
        ObjectInputStream inp = new ObjectInputStream(archivo)
        ) {
            arr = (int[])inp.readObject();
            System.out.println(Arrays.toString(arr));
        } catch(IOException ex) {
            System.out.println("Error: " + ex);
        } catch(ClassNotFoundException ex) {
            System.out.println("Error: " + ex);
        }
    }   
}
