package PracticaTema10.Ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Algunos sistemas operativos disponen de la orden comp, que compara dos archivos y nos dice 
 * si son iguales o distintos. Dise�a esta orden de forma que, adem�s, nos diga en qu� l�nea y 
 * car�cter se encuentra la primera diferencia. Utiliza los ficheros texto1.txt y texto2.txt.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        BufferedReader read = null;
        Scanner sc = new Scanner(System.in);
        String texto1 = "", texto2 = "";
        boolean iguales = false;
        int linea1 = 0, linea2 = 0;
        try {
            read = new BufferedReader(new FileReader("C:\\Users\\DPCat\\Documents\\GitHub\\Java\\Tema10Ficheros\\src\\PracticaTema10\\Ejercicio3\\texto1.txt"));
            String datos = read.readLine();
            while (datos != null) {
                texto1 += datos + "\n";
                linea2++;
                datos = read.readLine();
            }
            read = new BufferedReader(new FileReader("C:\\Users\\DPCat\\Documents\\GitHub\\Java\\Tema10Ficheros\\src\\PracticaTema10\\Ejercicio3\\texto2.txt"));
            datos = read.readLine();
            while (datos != null) {
                texto2 += datos + "\n";
                linea1++;
                datos = read.readLine();
            }
            System.out.println(texto1);
            System.out.println(texto2);
            int i = 0;
            while (!iguales) {
                if (texto1.charAt(i) != (texto2.charAt(i))) {
                    System.out.println("El caracter: " + i + " es diferente");
                    iguales = true;
                } else if (linea1 != linea2) {
                    System.out.println("Tienen diferentes lineas");
                    iguales = true;
                } else if (texto1.length() != texto2.length()) {
                    System.out.println("Hay una una diferencia de caracteres");
                    iguales = true;
                }
                i++;
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
