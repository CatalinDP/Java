/*

 */
package PracticaTema11.Ejercicio1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/*
Implementa un programa que lea números enteros desde el fichero números.dat y los vaya 
guardando en los ficheros pares.dat e impares.dat, según su paridad. 

1. Leer numeros enteros desde fichero
2. Guardar los numeros según sean pares o impares
*/


public class Ejercicio1 {
    
    public static void escribirNumeros() {
        try (
                FileOutputStream escrituraArchivo = new FileOutputStream("src\\PracticaTema11\\Ejercicio1\\numeros.dat");
                ObjectOutputStream salida = new ObjectOutputStream(escrituraArchivo);
            ) 
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escribe numeros enteros para añadir al archivo o -1 para salir");
            int num = sc.nextInt();
            while (num != -1) {
                System.out.println("Escribe numeros enteros para añadir al archivo o -1 para salir");
                salida.writeInt(num);
                num = sc.nextInt();
            }
        } catch (IOException ex) {
            System.out.println("Ha habido un error: " + ex);
        } 
    }
    
    public static void main(String[] args) {
        escribirNumeros(); //Un programa para escribir los numeros
        try (
                FileInputStream archivoEntrada = new FileInputStream("src\\PracticaTema11\\Ejercicio1\\numeros.dat");
                ObjectInputStream entrada = new ObjectInputStream(archivoEntrada);
                FileOutputStream archivoPar = new FileOutputStream("src\\PracticaTema11\\Ejercicio1\\pares.dat");
                FileOutputStream archivoImpar = new FileOutputStream("src\\PracticaTema11\\Ejercicio1\\impares.dat");
                ObjectOutputStream salidaPar = new ObjectOutputStream(archivoPar);
                ObjectOutputStream salidaImpar = new ObjectOutputStream(archivoImpar);) 
        {   
            while(true) {
                int num = entrada.readInt();
                if (num % 2 == 0 ) {
                    salidaPar.writeInt(num);
                } else {
                    salidaImpar.writeInt(num);
                }
                System.out.println(num);
            }
        } catch (EOFException ex) {
            System.out.println("Se han terminado de ordenar los numeros: " + ex);
        } catch (IOException ex) {
            System.out.println("Ha habido un error: " + ex);
        }
       
        try ( //Este try lo he hecho para comprobarlo, se puede ignorar ya que el ejercicio no lo pide.
                FileInputStream entradaPar = new FileInputStream("src\\PracticaTema11\\Ejercicio1\\pares.dat");
                FileInputStream entradaImpar = new FileInputStream("src\\PracticaTema11\\Ejercicio1\\impares.dat");
                ObjectInputStream leerImpares = new ObjectInputStream(entradaImpar);
                ObjectInputStream leerPares = new ObjectInputStream(entradaPar);) 
        {
            boolean elegir = true;
            while (true) {
                if (elegir) {
                    System.out.println("Pares: " + leerPares.readInt());
                } else {
                    System.out.println("Impares: " +leerImpares.readInt());
                }
            }
        }catch (EOFException ex) {
            System.out.println("Se han terminado de ordenar los numeros");
        } catch (IOException ex) {
            System.out.println("Ha habido un error: " + ex);
        }
    }
}
