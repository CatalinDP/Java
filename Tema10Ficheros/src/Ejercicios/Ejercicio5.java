package Ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Ejercicio 5
 * Crea un archivo de texto con un conjunto de números reales, uno por línea. Abrir con un flujo de texto
 * para lectura y leerlo línea por línea. Convertir las cadenas leídas en números de tipo double por medio
 * de Scanner, y mostrar al final la suma de todos ellos
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        BufferedReader read = null;
        double sumaTotal = 0.0;
        try {
            read = new BufferedReader(new FileReader("C:\\Users\\DPCat\\Documents\\GitHub\\Java\\Tema10Ficheros\\src\\Ejercicios\\NumerosReales.txt"));
            String numeros = read.readLine();
            
            while (numeros != null) {
                double numero = new Scanner(numeros).useLocale(Locale.US).nextDouble();
                sumaTotal += numero;
                numeros = read.readLine(); 
                System.out.println(numero);
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
    }
}
