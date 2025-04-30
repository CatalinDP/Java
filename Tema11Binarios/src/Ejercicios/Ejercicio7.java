package Ejercicios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Ejercicio 7
 * Grabar en el fichero numeros.dat una serie de números enteros no negativos introducidos por teclado. La serie acabará cuando escribamos -1.
 * Abrir de nuevo numeros.dat para lectura y leer los numeros hata el final del fichero, 
 * mostrándolos por pantalla y copiandolos en un segundo fichero, numerosCopia.dat
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        int[] numeros = new int[0];
        ObjectInputStream inp = null;
        FileOutputStream archivoOut = null;
        FileInputStream archivoRead = null;
        FileOutputStream archivoOut2 = null;
        ObjectOutputStream out = null;
        Scanner sc = new Scanner(System.in);
        int opcion, i = 0;
        try {
            archivoOut = new FileOutputStream("src\\Ejercicios\\Archivos\\numeros.dat");
            out = new ObjectOutputStream(archivoOut);
            System.out.println("Dime el número " + (i+1) + ":");
            opcion = Integer.parseInt(sc.nextLine());
            while (opcion != -1) {
                numeros = Arrays.copyOf(numeros, numeros.length+1);
                numeros[numeros.length-1] = opcion;
                System.out.println("Dime el número " + (i+1) + ":");
                opcion = Integer.parseInt(sc.nextLine());
                i++;
            }
            out.writeObject(numeros);
            archivoRead = new FileInputStream("src\\Ejercicios\\Archivos\\numeros.dat"); 
            archivoOut2 = new FileOutputStream("src\\Ejercicios\\Archivos\\numerosCopia.dat");
            inp = new ObjectInputStream(archivoRead);
            int[] arr = (int[])inp.readObject();
            for (int n : arr) {
                System.out.println(n);
            }
            out = new ObjectOutputStream(archivoOut2);
            out.writeObject(arr);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ejercicio7.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (inp != null) {
                try {
                    inp.close();
                    out.close();
                } catch (IOException ex) {
                    Logger.getLogger(Ejercicio7.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
