/*

 */
package PracticaTema11.Ejercicio3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

/*
    Un libro de firmas es útil para recoger los nombres de todas las personas que han pasado por 
    un determinado lugar. Crea una aplicación que permita mostrar el libro de firmas o insertar un 
    nuevo nombre (comprobando que no se encuentre repetido) usando el fichero binario 
    firmas.dat. 
1. Aplicacion de elegir*
2. Mostrar firmas*
3. Insertar nuevo nombre si no esta ya añadido*
 */
public class Ejercicio3 {

    static String[] nombres = null;

    public static boolean leerFirmas() {
        boolean succes = false;
        try (
                FileInputStream archivoEntrada = new FileInputStream("src\\PracticaTema11\\Ejercicio3\\firmas.dat"); 
                ObjectInputStream entrada = new ObjectInputStream(archivoEntrada);) {
            Ejercicio3.nombres = (String[]) entrada.readObject();
            succes = true;
        } catch (IOException ex) {
            System.out.println("Ha habido un error: " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Ha habido un error: " + ex);
        }
        if (Ejercicio3.nombres == null) {
            Ejercicio3.nombres = new String[0];
        }
        return succes;
    }

    public static boolean addFirma(String nombre) {
        boolean succes = false;
        try (
                FileOutputStream archivoSalida = new FileOutputStream("src\\PracticaTema11\\Ejercicio3\\firmas.dat");
                ObjectOutputStream salida = new ObjectOutputStream(archivoSalida);
                ) 
        {
            boolean existe = false;
            int i = 0;
            while (!existe && i < Ejercicio3.nombres.length) {
                if (Ejercicio3.nombres[i].equalsIgnoreCase(nombre)) {
                    existe = true;
                }
                i++;
            }
            if (!existe) {
                Ejercicio3.nombres = Arrays.copyOf(Ejercicio3.nombres, Ejercicio3.nombres.length + 1);
                Ejercicio3.nombres[Ejercicio3.nombres.length - 1] = nombre;
                succes = true;
            } else {
                System.out.println("Ese nombre ya esta");
            }
            salida.writeObject(Ejercicio3.nombres);
        } catch (IOException ex) {
            System.out.println("Ha habido un error: " + ex);
        }
        return succes;
    }

    public static void main(String[] args) {
        leerFirmas();
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        while (!salir) {
            System.out.println("--------------------------------------------------");
            System.out.println("Bienvenido a la gestion de firmas");
            System.out.println("--------------------------------------------------");
            System.out.println("1 - Mostrar firmas\n2 - Añadir firma\n3 - Salir");
            System.out.println("--------------------------------------------------");
            int option = 0;
            try {
                option = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Escribe un número entero: " + ex);
            }
            switch (option) {
                case 1 ->
                    System.out.println(Arrays.toString(nombres));
                case 2 -> {
                    System.out.println("Que nombre quieres añadir");
                    String nombre = sc.nextLine();
                    addFirma(nombre);
                }
                case 3 ->
                    salir = true;
                default ->
                    System.out.println("El numero no es correcto");
            }

        }
    }
}
