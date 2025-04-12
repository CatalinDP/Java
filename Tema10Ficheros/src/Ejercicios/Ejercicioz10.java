package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Ejercicio 10
 * Escribir un programa que duplique el contenido de un fichero cuyo nombre se pide al usuario.
 * El fichero copia tendrá el mismo nombre con el prefijo de "copia_de_";
 */
public class Ejercicioz10 {
    public static void main(String[] args) {
       File archivo = null;
       BufferedReader read = null;
       BufferedWriter escribir = null;
       String nombre = "";
       Scanner sc = new Scanner(System.in);
       FileReader ruta = null;
       FileWriter rutaWriter = null;
       
       try {
           System.out.println("Dime el nombre del archivo que quieras copiar exacto");
           nombre = sc.nextLine();
           archivo = new File("C:\\Users\\DPCat\\Documents\\GitHub\\Java\\Tema10Ficheros\\src\\Ejercicios\\Copia_de_"+ nombre);
           ruta = new FileReader("C:\\Users\\DPCat\\Documents\\GitHub\\Java\\Tema10Ficheros\\src\\Ejercicios\\"+ nombre);
           archivo.createNewFile();
           rutaWriter = new FileWriter("C:\\Users\\DPCat\\Documents\\GitHub\\Java\\Tema10Ficheros\\src\\Ejercicios\\Copia_de_"+ nombre);
           read = new BufferedReader(ruta);
           escribir = new BufferedWriter(rutaWriter);
           
           String datos = read.readLine();
           while (datos != null) {
               escribir.write(datos);
               escribir.newLine();
               System.out.println(datos);
               escribir.flush();
               datos = read.readLine();
           }
       } catch (IOException e) {
           System.out.println("Error: "+ e);
       }
    }
}
