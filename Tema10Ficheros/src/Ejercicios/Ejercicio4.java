package Ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Ejercicio 4
 * Crea con un editor el fichero de texto NumerosReales.txt en la carpeta del proyecto de netBeans actual
 * y escribir en él una serie de numeros reales separados por espacios simples.
 * 
 * Implementar un programa que acceda al archivo, lea los números y calcule la suma 
 * y media artmética, mostrando los resultados por pantalla
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        BufferedReader archivo = null;
        double media = 0;
        String lectura = "";
        try {
            archivo = new BufferedReader(new FileReader("C:\\Users\\DPCat\\Documents\\GitHub\\Java\\Tema10Ficheros\\src\\Ejercicios\\NumerosReales.txt"));
            lectura = archivo.readLine(); 
            String[] numeros = lectura.split(" ");
            for (String n : numeros) {
                media += Double.parseDouble(n);
            }
            media = media / numeros.length;
            System.out.println(media);
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
    }
}
