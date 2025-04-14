package PracticaTema10.Ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


/**
 * Escribe un programa que lea un fichero de texto llamado carta.txt. Tenemos que contar los 
 * caracteres, las líneas y las palabras. Para simplificar supondremos que cada palabra está 
 * separada de otra por un único espacio en blanco o por un cambio de línea.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
       BufferedReader read = null;
       Scanner sc = new Scanner(System.in);
       String palabras = "";
       int linea = 0;
       try {
           read = new BufferedReader(new FileReader("C:\\Users\\DPCat\\Documents\\GitHub\\Java\\Tema10Ficheros\\src\\PracticaTema10\\Ejercicio2\\carta.txt"));
           String datos = read.readLine();
           while (datos != null) {
                System.out.println(datos);
                palabras += datos + " ";
                datos = read.readLine();
                linea++;
           }
           String[] contadorPalabras = palabras.split(" ");
           palabras = palabras.replace(" ", "");
           System.out.println(palabras);
           System.out.println("En total hay: " + contadorPalabras.length + " palabras");
           System.out.println("En total hay: " + linea + " lineas");
           System.out.println("En total hay: " + palabras.length() + " caracteres");
       } catch (IOException e) {
           System.out.println("Error: "+ e);
       } finally {
           try {
                read.close();
           } catch (IOException ex) {
               System.out.println("Error: "+ ex);
           }
       }
    }
}
