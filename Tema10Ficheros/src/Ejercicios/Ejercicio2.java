package Ejercicios;

/**
 * Leer el archivo de texto Main.java de uno de los proyectos que hayamos terminado y mostrar por pantalla
 */

import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
        FileReader archivo = null;
        String cadena = "";
        try {
            archivo = new FileReader("C:\\Users\\DPCat\\Documents\\NetBeansProjects\\Tema5Arrays\\src\\tema5arrays\\Ejercicio15.java");
            int caracter = 0;
            while (caracter != -1) {
                caracter = archivo.read();
                cadena += (char)caracter;   
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
