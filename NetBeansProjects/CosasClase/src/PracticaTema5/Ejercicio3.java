/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema5;
import java.util.Arrays;
import java.util.Scanner;
/**
El ayuntamiento de tu localidad te ha encargado una aplicación que ayude a realizar encuestas 
estadísticas para conocer el nivel adquisitivo de los habitantes del municipio. Para ello, tendrás 
que preguntar el sueldo a cada persona encuestada. A priori, no conoces el número de 
encuestados. Para finalizar la entrada de datos, introduce un sueldo con valor -1. 
Una vez terminada la entrada de datos, muestra la siguiente información:
- Todos los sueldos introducidos ordenador de forma decreciente. 
- El sueldo máximo y mínimo. 
- La media de los sueldos. 
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int sueldoMax = 0, sueldoMin = 0, sueldo = 0, i = 0;
        int[] sueldos = new int[0];
        double media = 0;
        
        System.out.println("Encuesta: Introduce tu salario o -1 si no hay salarios");
        sueldo = new Scanner(System.in).nextInt();
        sueldoMin = sueldo; 
        sueldos = Arrays.copyOf(sueldos, sueldos.length+1);
        sueldos[i] = sueldo;
        i++;
        
        while (sueldo != -1) {
            System.out.println("Encuesta: Introduce tu salario o -1 si no hay salarios");
            sueldo = new Scanner(System.in).nextInt();
            if (sueldo != -1) {
                if (sueldo > sueldoMax) {
                    sueldoMax = sueldo;
                } else if (sueldo < sueldoMin) {
                    sueldoMin = sueldo;
                }

                sueldos = Arrays.copyOf(sueldos, sueldos.length+1);
                sueldos[i] = sueldo;
                i++;
            }
        }
        for (int sueldoMedia : sueldos) {
            media += sueldoMedia;
        }
        media = media / sueldos.length;
        System.out.println("Los sueldos son: "+Arrays.toString(sueldos));
        System.out.println("Con una media de: " + media);
        System.out.println("Siendo el mayor sueldo: " + sueldoMax);
        System.out.println("Siendo el menor sueldo: " + sueldoMin);
        
    }
}
