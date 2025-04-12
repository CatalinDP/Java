package Ejercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Ejercicio 9
 * Escribe un texto en un archivo de texto, línea a línea leídas del teclado, hasta que introduzca la cadena fin
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        BufferedWriter salida = null;
        String texto;
        Scanner sc = new Scanner(System.in);
        try {
            salida = new BufferedWriter(new FileWriter("C:\\Users\\DPCat\\Documents\\GitHub\\Java\\Tema10Ficheros\\src\\Ejercicios\\Ejercicio9.txt", false));
            System.out.println("Escribe texto");
            texto = sc.nextLine();
            while (!texto.toLowerCase().equals("fin")){
                salida.write(texto);
                salida.newLine();
                System.out.println("Escribe texto");
                texto = sc.nextLine();
            }
            salida.flush();
        } catch (IOException ex) {
            System.out.println("Error: "+ ex);
        } finally {
            try {
                salida.close();
            } catch (IOException ex) {
                Logger.getLogger(Ejercicio9.class.getName()).log(Level.SEVERE, null, ex);
            }
            sc.close();
        }
    }
}
