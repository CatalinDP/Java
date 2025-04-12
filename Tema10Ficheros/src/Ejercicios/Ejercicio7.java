package Ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


/**
 * Ejercicio 7
 * Crea con un editor de el fichero de texto jugadores.txt en la carpeta del proyecto de NetBeans actual y escribe en él los nombres,
 * edades y estaturas de los jugadores de un equipo, cada uno en una línea, ejemplo
 * Juan 22 1.77
 * Alberto 26 1.89
 * Luis 22 1.80
 * Pedro 20 1.73
 * Implementa un programa que le del fichero los datos, muestre los nombres y calcule la media de la edad y estaturas,
 * mostrándolas por pantalla
 */
public class Ejercicio7 {
    public static void main(String[] args) {
         BufferedReader read = null;
        int sumaEdad = 0, contador = 0;
        double sumaAltura = 0;
        Scanner sc;
        try {
            read = new BufferedReader(new FileReader("C:\\Users\\DPCat\\Documents\\GitHub\\Java\\Tema10Ficheros\\src\\Ejercicios\\Futbolistas.txt"));
            String jugador = read.readLine();
            while (jugador != null) {
                
                sc = new Scanner(jugador);
                
                String nombre = sc.next();
                sumaEdad += sc.nextInt();
                sumaAltura += sc.nextDouble();
                
                contador++;
                System.out.println("El nombre es: " + nombre);
                jugador = read.readLine();
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
        double mediaEdad = sumaEdad / contador;
        double mediaAltura = sumaAltura / contador;
        System.out.println("Media edad: " + Math.round((mediaEdad*100.0)/100.0));
        System.out.println("Media altura: " + Math.round(mediaAltura*100.0)/100.0);
    }
}
