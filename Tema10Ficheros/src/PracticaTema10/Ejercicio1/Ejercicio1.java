package PracticaTema10.Ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Implementa un programa que lea dos listas de números enteros no ordenados de dos archivos 
 * que contienen un número por línea, los reúna en una lista única y los guarde en orden 
 * creciente en un tercer archivo, de nuevo uno por línea.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
       File archivo = null;
       BufferedReader read = null;
       BufferedWriter escribir = null;
       String numeros = "";
       Scanner sc = null;
       String ruta = "C:\\Users\\DPCat\\Documents\\GitHub\\Java\\Tema10Ficheros\\src\\PracticaTema10";
       try {
           archivo = new File(ruta + "\\ejercicio1_res.txt");
           archivo.createNewFile();
           read = new BufferedReader(new FileReader(ruta + "\\ejercicio1_1.txt"));
           escribir = new BufferedWriter(new FileWriter(ruta + "\\ejercicio1_res.txt"));
           String datos = read.readLine();
           while (datos != null) {
               System.out.println(datos);
               numeros += datos;
               datos = read.readLine();
           }
           System.out.println(numeros);
           read = new BufferedReader(new FileReader(ruta + "\\ejercicio1_2.txt"));
           datos = read.readLine();
           while (datos != null) {
               System.out.println(datos);
               numeros += datos;
               datos = read.readLine();
           }
            String[] nums = numeros.split("");
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
            for (int i = 0; i < nums.length; i++) {
                escribir.write(nums[i]);
                escribir.newLine();
            }
       } catch (IOException e) {
           System.out.println("Error: "+ e);
       } finally {
           try {
               read.close();
               escribir.close();
           } catch (IOException ex) {
               System.out.println("Error");
           }
       }
    }
}
