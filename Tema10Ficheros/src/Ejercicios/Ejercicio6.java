package Ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Ejercicio 6
 * Crea con un editor en el fichero de texto eteros.txt en la carpeta del proyecto actual de NetBeans y escribir en �l
 * una serie de enteros separados por secuencisa de espacios y tabuladores, incluso en l�neas distintas, tal como:
 * 123 4 5   566
 * 12  54    56
 * Implementar un programa que acceda a enteros.txt con un objeto scanner a trav�s de un flujo de entrada, lea los n�meros y calcula su
 * suma y su media aritm�tica, mostrando los resultdos por pantalla.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        BufferedReader read = null;
        int sumaTotal = 0, contador = 0;
        String enteros = "";
        Scanner sc;
        try {
            read = new BufferedReader(new FileReader("C:\\Users\\DPCat\\Documents\\GitHub\\Java\\Tema10Ficheros\\src\\Ejercicios\\Enteros.txt"));
            enteros = read.readLine();
            while (enteros != null) {
                sc = new Scanner(enteros);
                while (sc.hasNextInt()) {
                    sumaTotal += sc.nextInt();
                    contador++;
                }
                enteros = read.readLine();
            }
        } catch (IOException e) {
            System.err.println("Error: " + e);
        } finally {
            try {
                read.close();
            } catch (IOException ex) {
                System.out.println("Error " + ex);
            }
        }
        System.out.println("Suma: " + sumaTotal);
        System.out.println("Media: " + sumaTotal/ contador);
    }
}
