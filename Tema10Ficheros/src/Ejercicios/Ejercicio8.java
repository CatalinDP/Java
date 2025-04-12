package Ejercicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Ejercicio 8
 * Como ejemplo, vamos a guardar en un fichero de texto,
 * "En un lugar de la Mancha,
 * de cuyo nombre no quiero acordarme"
 * La primera línea, caracter a caracter, y la segunda, en una sola sentencia
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        String l1 = "En un lugar de la Mancha";
        String l2 = "de cuyo nombre no quiero acordarme";
        String ruta = "C:\\Users\\DPCat\\Documents\\GitHub\\Java\\Tema10Ficheros\\src\\Ejercicios\\Eejercicio8.txt";
        File fichero = new File(ruta);   
        BufferedWriter salida = null;
        try {
            fichero.createNewFile();
            salida = new BufferedWriter(new FileWriter("C:\\Users\\DPCat\\Documents\\GitHub\\Java\\Tema10Ficheros\\src\\Ejercicios\\Ejercicio8.txt", false));
            for (int i = 0; i < l1.length(); i++) {
                salida.write(l1.charAt(i));
            }
            salida.newLine();
            salida.write(l2);
            salida.flush();
        } catch (IOException ex) {
            System.out.println("Error: "+ ex);
        }
    }
}
