/*

 */
package PracticaTema11.Ejercicio2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

/*
Implementa una aplicación que gestione una lista de nombres ordenada por orden alfabético. 
Al arrancar, se leerá de un fichero los nombres insertados anteriormente y se pedirán nombres 
nuevos hasta que se introduzca la cadena ?fin?. Cada nombre que se introduzca deberá 
añadirse a los que ya había, de forma que la lista permanezca ordenada. Al terminar, se 
guardará en el fichero la lista actualizada. 

1. Leer fichero nada más comenzar
2. Los nombres tienen que estar ordenados alfabeticamente
3. Introducir nuevos nombres hasta que se ponga "fin"
4. Al terminar se escribira de nuevo la lista de forma ordenada
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        String[] nombres = new String[0];
        try (
                FileInputStream archivoEntrada = new FileInputStream("src\\PracticaTema11\\Ejercicio2\\nombres.dat");
                ObjectInputStream entrada = new ObjectInputStream(archivoEntrada);) 
        {   
            nombres = (String[]) entrada.readObject();
            System.out.println(Arrays.toString(nombres));
        } catch (IOException ex) {
            System.out.println("Ha habido un error: " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Ha habido un error: " + ex);
        }
        
        try (
                FileOutputStream archivoSalida = new FileOutputStream("src\\PracticaTema11\\Ejercicio2\\nombres.dat");
                ObjectOutputStream salida = new ObjectOutputStream(archivoSalida);
                Scanner sc = new Scanner(System.in);) 
        {   
            System.out.println("Escribe nombres para añadir al archivo o 'fin' para salir");
            String nombre = sc.nextLine();
            while (!nombre.toLowerCase().equals("fin")) {
                nombres = Arrays.copyOf(nombres, nombres.length+1);
                nombres[nombres.length-1] = nombre;
                System.out.println("Escribe nombres para añadir al archivo o 'fin' para salir");
                nombre = sc.nextLine();
            }
            Arrays.sort(nombres);
            salida.writeObject(nombres);
        } catch (IOException ex) {
            System.out.println("Ha habido un error: " + ex);
        }
    }
}

