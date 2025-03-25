/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema5Arrays;

import java.util.Arrays;

/**
    Ejercicio 15 
Escribe en una función el comportamiento de la inserción ordenada. 
 */
public class Ejercicio15 {
    static int[] insercion(int[]t, int num) {
        int[] copia = new int[t.length];
        int indice = Arrays.binarySearch(t, num);
        if (indice < 0) {
            indice = -indice - 1;
        }
        
        copia = Arrays.copyOf(copia, copia.length+1);
        System.arraycopy(t, 0, copia, 0, indice);
        System.arraycopy(t, indice, copia, indice+1, t.length-indice);   
        copia[indice] = num;
        return copia;
    }
    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 6, 9 , 10, 12};
        int[] tInser = insercion(t, 11);
        System.out.println(Arrays.toString(tInser));
    }
}
