/*

 */
package PracticaTema11.Ejercicio4;

import java.util.Arrays;
import java.util.Scanner;

/*
    Implementa una aplicación que gestione los empleados de un banco. Para ello se definirá la 
    clase Empleado con los atributos dni, nombre y sueldo. 
    Los empleados se guardarán en un 
    objeto de la clase Lista para objetos de la clase Object. La aplicación cargará en la memoria, al 
    arrancar, la lista de empleados desde el archivo binario empleados.dat y mostrará un menú con 
    las siguientes opciones: 1. Alta empleado; 2. Baja empleado; 3. Mostrar datos empleado; 4. 
    Listar empleados, y 5. Salir. Al pulsar 5, se grabará en el disco la lista actualizada y terminará el 
    programa. 

1. Clase empleado con dni, nombre y sueldo.
2. Clase lista que guarda empleados en empleados.dat que opera con objetos de clase object.
3. Carga al arrancar la lista de empleados
4. Menú de empleados: Añadir*, eliminar*, mostrar datos de un empleado*, listar empleados*.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Lista l = new Lista();
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        while (!salir) {
            System.out.println("--------------------------------------------------");
            System.out.println("Bienvenido a la gestion del banco");
            System.out.println("--------------------------------------------------");
            System.out.println("1 - Listar empleados\n2 - Mostrar datos de un empleeado\n3 - Alta empleado\n4 - Baja empleado\n5 - Salir");
            System.out.println("--------------------------------------------------");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1 -> l.listarEmpleados();
                case 2 -> {
                    System.out.println("Escribe el DNI del empleado a mostrar");
                    String dni = sc.nextLine();
                    l.mostrarDatos(dni);
                } 
                case 3 -> {
                    System.out.println("Escribe el DNI del nuevo empleado");
                    String dni = sc.nextLine();
                    System.out.println("Escribe el nombre del nuevo empleado");
                    String nombre = sc.nextLine();
                    System.out.println("Escribe el sueldo del nuevo empleado");
                    double sueldo = 0;
                    try {
                        sueldo = Double.parseDouble(sc.nextLine());
                    } catch (NumberFormatException ex) {
                        System.out.println("Introduce un numero correcto: " + ex);
                    }
                    if (sueldo > 0) {
                        l.agregarEmpleado(new Empleado(dni, nombre, sueldo));
                    }
                }
                case 4 -> {
                    System.out.println("Escribe el DNI del empleado a eliminar");
                    String dni = sc.nextLine();
                    l.eliminarEmpleado(dni);
                }
                case 5 ->  {
                    l.guardarLista();
                    salir = true;
                }
                default -> System.out.println("El numero no es correcto");
            }
            
        }
    }
}
