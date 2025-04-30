package Ejercicios;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
/**
 * Ejercicio 9
 * Implementar un programa que registra la evoluci�n temporal de la temperatura en una ciudad.
 * La aplicaci�n mostrar� un men� que permite a�adir nuevos registros de temperatura y mostrar el listado de todos los registros hist�ricos.
 * Cada registro constar� de la temperatura en grados cent�grados, 
 * introducida por teclado, y la fecha y hora que se leera del sistema en el momento de la creaci�n del registro
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Registro r = new Registro();
        boolean salir = false;
        while (!salir) {
            System.out.println("------------------------------------------");
            System.out.println("Dime que quieres hacer:");
            System.out.println("\n1 - Listar registros\n2 - A�adir registro\n3 - Salir");
            System.out.println("------------------------------------------");
            int option = Integer.parseInt(new Scanner(System.in).nextLine());
            switch(option) {
                case 1 -> r.listarRegistros();
                case 2 -> r.addRegistro();
                case 3 -> salir = true;
                default -> System.out.print("N�mero incorrecto");
            } 
        }
    }
}
