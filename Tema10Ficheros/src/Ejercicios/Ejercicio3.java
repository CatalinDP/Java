package Ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Ejercicio 3
 * Repite el ejercicio 2 usando un flujo de texto búfer
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        BufferedReader archivo = null;
        String cadena = "";
        try {
            archivo = new BufferedReader(new FileReader("C:\\Users\\DPCat\\Documents\\NetBeansProjects\\Tema5Arrays\\src\\tema5arrays\\Ejercicio15.java"));
            String linea = archivo.readLine();
            while (linea != null) {
                cadena += linea + "\n"; 
                linea = archivo.readLine();
            }
        } catch (IOException e) {
            System.err.println("Error E/S: " + e);
        } finally {
            if (archivo != null) {
                try {
                    archivo.close();
                } catch (Exception e) {
                    System.out.println("Error, no se pudo cerrar: "+ e);
                }
            }
        }
        System.out.println(cadena);
    }
}
