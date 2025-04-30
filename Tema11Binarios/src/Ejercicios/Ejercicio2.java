package Ejercicios;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Ejercicio 2
 * Escribir como una cadena, en el fichero binario cancionPirata.txt, la siguiente estrofa:
 * Con diez cañones por banda,
 * viento en popa a toda vela,
 * no corta el mar, sino vuela
 * un velero bergantín.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        FileOutputStream archivo = null;
        ObjectOutputStream out = null;
        String cancion = "Con diez cañones por banda,\n" +
                         "viento en popa a toda vela,\n" +
                         "no corta el mar, sino vuela\n" +
                         "un velero bergantín.";
        try {
            archivo = new FileOutputStream("src\\Ejercicios\\Archivos\\cancionPirata.dat");
            out = new ObjectOutputStream(archivo);
            out.writeObject(cancion);
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
