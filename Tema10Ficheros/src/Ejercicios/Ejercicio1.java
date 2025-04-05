package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio 1
 * Escribir el método Integer leerEntero()
 * Pide un entero por consola, lo lee del teclado y lo devuelve. Si la cadena introducida por consola no tiene el formato correcto, 
 * mostrar un mensaje de error y volver a pedirlo.
 * Usar bucle while(true) y break para salir del bucle solo si lo introducido tiene el formato correcto
 */
public class Ejercicio1 {
//    static Integer leerEntero(){
//        Scanner sc = new Scanner(System.in);
//        Integer n = 0;
//        while (true) {
//           try {
//                System.out.println("Dime un entero");
//                n = sc.nextInt();
//                break;
//            } catch (InputMismatchException e) {
//                System.out.println("Hubo un error " + e); 
//                n = leerEntero();
//                break;
//            }
//        }
//        return n;
//    }
    static Integer leerEntero(){
        Scanner sc = new Scanner(System.in);
        Integer n = 0;
        while (true) {
           try {
                System.out.println("Dime un entero");
                n = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Hubo un error " + e); 
                sc.nextLine();
            }
        }
        return n;
    }   
    public static void main(String[] args) {
        System.out.println(leerEntero());
    }
}
