/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema5Arrays;
import java.util.Arrays;
import java.util.Random;
/**
    Ejercicio 10 
Escribir la función int [] rellenaPares(int longitud, int fin), que crea y devuelve un array 
ordenado de la longitud especificada, que se encuentra rellenado con números pares 
aleatorios comprendidos en el rango desde 2 hasta fin (inclusive). 
 */
public class Ejercicio10 {
    static int[] rellenaPares(int longit, int fin){
        int[] array = new int[longit];
        Random ran = new Random();
        int i = 0;
        while ( i < longit) {
            int num  = ran.nextInt(2, fin);
            System.out.println(num);
            if (num %2 == 0) {
                array[i] = num;
                i++;
            }
        }
        Arrays.sort(array);
        return array;
    }
    public static void main(String[] args) {
        int [ ] rellenado = rellenaPares(10, 50);
        System.out.println(Arrays.toString(rellenado));
    }
}
