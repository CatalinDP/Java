/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema5Arrays;

import java.util.Arrays;

/**
 * Ejercicio 18 
Crea una función que realice el borrado de un elemento de un array ordenado. 
 */
public class Ejercicio18 {
    static int[] borradoOrd(int[] t, int num) {
        int[] arr = new int[t.length-1];
        int indice = Arrays.binarySearch(t, num);
        if (indice < 0) {
            return t;
        }
        System.arraycopy(t, 0, arr, 0, indice);
        System.arraycopy(t, indice+1, arr, indice, t.length-indice-1);
        
        return arr;
    }
    public static void main(String[] args) {
        int[] t = {1, 3, 5, 6, 7};
        t = borradoOrd(t, 7);
        System.out.println(Arrays.toString(t));
    }
}
