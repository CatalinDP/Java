package PracticaTema10.Ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Algunos sistemas operativos disponen de la orden comp, que compara dos archivos y nos dice 
 * si son iguales o distintos. Diseña esta orden de forma que, además, nos diga en qué línea y 
 * carácter se encuentra la primera diferencia. Utiliza los ficheros texto1.txt y texto2.txt.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        BufferedReader read = null;
        Scanner sc = new Scanner(System.in);
        String texto1 = "", texto2 = "";
        boolean iguales = false;
        int linea = 0;
        try {
            read = new BufferedReader(new FileReader("C:\\Users\\DPCat\\Documents\\GitHub\\Java\\Tema10Ficheros\\src\\PracticaTema10\\Ejercicio3\\texto1.txt"));
            String datos = read.readLine();
            while (datos != null) {
                texto1 += datos + "\n";
                datos = read.readLine();
            }
            read = new BufferedReader(new FileReader("C:\\Users\\DPCat\\Documents\\GitHub\\Java\\Tema10Ficheros\\src\\PracticaTema10\\Ejercicio3\\texto2.txt"));
            datos = read.readLine();
            int i = 0;
            while (datos != null && !iguales) {
                linea++;
                texto2 += datos + "\n";
                while (!iguales && i < texto2.length()-1) {
                    if (texto1.charAt(i) != (texto2.charAt(i))) {
                        System.out.println("El caracter " + i + " es diferente: " + texto1.charAt(i));
                        System.out.println("En la línea " + linea);
                        iguales = true;
                    }
                i++;
                }
                datos = read.readLine();
            }
            if (texto1.length() != texto2.length()) {
                System.out.println("Hay una una diferencia de caracteres");
            }
            if (!iguales) {
                System.out.println("Ambos textos son iguales");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                read.close();
            } catch (IOException ex) {
                System.out.println("Error: " + ex);
            }
        }
    }
}
