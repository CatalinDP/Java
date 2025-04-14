/*

 */
package PracticaTema10.Ejercicio4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
    Implementa una aplicaci�n que mantenga un registro de las temperaturas m�xima y m�nima 
    diarias medidas en una estaci�n meteorol�gica. Los datos se guardar�n en un archivo de texto 
    con el siguiente formato: 
    Fecha    
    2020-01-15    
    2020-01-16    
    ? 
    Temperatura m�xima   
    12     
    15      
    Al arrancar la aplicaci�n aparecer� un men� con las opciones: 
    1. Registrar nueva temperatura 
    2. Mostrar historial de registros 
    3. Salir 
    Temperatura m�nima -1 
    2 
    El historial de registros mostrar� todos los datos registrados junto con el m�ximo valor de las 
    temperaturas m�ximas y el m�nimo de las temperaturas m�nimas. 
 */
public class Ejercicio4 {
    public static void nuevaTemperatura(LocalDate fecha, int tempMax, int tempMin) {
        BufferedWriter out = null;
        String ruta = "C:\\Users\\DPCat\\Documents\\GitHub\\Java\\Tema10Ficheros\\src\\PracticaTema10\\Ejercicio4\\Registro.txt";
        try {
            out = new BufferedWriter(new FileWriter(ruta, true));
            out.newLine();
            out.write(fecha+"                          "+tempMax+"                                          "+tempMin);
            System.out.println("Se ha a�adido con exito");
        } catch (IOException e) {
            System.err.println("Ha habido un error al a�adir una nueva temperatura: " + e);
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                System.out.println("Ha habido un error cerrando la salida: " + e);
            }
        }
    }
    
    public static void mostrarRegistro() {
        BufferedReader in = null;
        String ruta = "C:\\Users\\DPCat\\Documents\\GitHub\\Java\\Tema10Ficheros\\src\\PracticaTema10\\Ejercicio4\\Registro.txt";
        try {
            in = new BufferedReader(new FileReader(ruta));
            String datos = in.readLine();
            while (datos != null) {
                System.out.println(datos);
                datos = in.readLine();
            }
        } catch (IOException e) {
            System.err.println("Ha habido un error al sacar los registros: " + e);
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                System.out.println("Ha habido un error cerrando la entrada: " + e);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        while(!salir) {
            System.out.println("1. Registrar nueva temperatura \n" +
                               "2. Mostrar historial de registros \n" +
                               "3. Salir ");
            System.out.println("Elige una opci�n");
            int opcion = sc.nextInt();
            switch(opcion) {
                case 1: {
                    sc.nextLine();
                    System.out.println("Dime una fecha");
                    String fecha = sc.nextLine();
                    System.out.println("Escribe la temperatura maxima");
                    int max = sc.nextInt();
                    System.out.println("Escribe la temperatura minima");
                    int min = sc.nextInt();
                    LocalDate fechaFormateada = null;
                    try {
                        fechaFormateada = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("yyyy/MM/dd")); //Esto es para que me quite solo las fechas invalidas y solo esten este formato, que es el del archivo
                    } catch (DateTimeParseException e) {
                        System.err.println("Ha habido un error, formato o datos de la fecha incorrectos: " + e);
                        break;
                    } 
                    nuevaTemperatura(fechaFormateada, max, min);
                    break;
                }
                case 2: {
                    mostrarRegistro();
                    break;
                }
                case 3: {
                    salir = true; 
                    break;
                }
            }
        }
    }
}
