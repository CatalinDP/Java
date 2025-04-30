package Ejercicios;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Ejercicio 3
 * Pedir un número entero n por consola y, a continuación, pedir n núeros de tipo double,
 * que iremos insertando en un array. Guardar el array en un archivo binario
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        FileOutputStream archivo = null;
        ObjectOutputStream out = null;
        int ini;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la longitud del array");
        ini = sc.nextInt();
        double[] arr = new double[ini];
        try {
            archivo = new FileOutputStream("src\\Ejercicios\\Archivos\\Ejercicio3.dat");
            out = new ObjectOutputStream(archivo);
            for (int i = 0; i < ini; i++) {
                System.out.println("Dime el número " + (i+1) + ":");
                arr[i] = sc.useLocale(Locale.US).nextDouble();
            }
            out.writeObject(arr);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            sc.close();
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
