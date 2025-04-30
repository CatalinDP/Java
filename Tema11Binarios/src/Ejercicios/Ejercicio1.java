package Ejercicios;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Ejercicio 1
 * Escribir en un archivo datos.dat los valores de un array de diez enteros.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        FileOutputStream archivo = null;
        ObjectOutputStream out = null;
        int[] arr = {1, 3, 2, 4, 6, 7, 5, 8, 9 , 10};
        try {
            archivo = new FileOutputStream("src\\Ejercicios\\Archivos\\datos.dat");
            out = new ObjectOutputStream(archivo);
            /*out.writeObject(arr);*/
            
            for (int n : arr) {
                out.writeInt(n);
            }
            //Segun lo hagamos tendremos que leer luego con readInt o readObject
            
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
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
