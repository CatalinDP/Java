/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema5Arrays;

import java.util.Arrays;

/**
    Ejercicio 14 
Leer y almacenar n números enteros en un array, a partir del cual se construirán otros dos 
arrays con los elementos con valores pares e impares del primero, respectivamente. Los arrays 
pares e impares deben mostrarse ordenados. 
 */
public class Ejercicio14 {
    static int[]arrPares (int[]t) {
        int[] pares = new int[0];
        for (int numero : t) {
            if (numero % 2 == 0) {
                pares = Arrays.copyOf(pares, pares.length +1);
                pares[pares.length -1] = numero;
            }
        }
        return pares;
    }
    
    static int[] arrImpares (int[] t) {
        int[] impares = new int[0];
        for (int numero : t) {
            if (numero % 2 != 0) {
                impares = Arrays.copyOf(impares, impares.length +1);
                impares[impares.length -1] = numero;
            }
        }
        return impares;
    }
    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6};
        int[] pares = arrPares(t);
        int[] impares = arrImpares(t);
        System.out.println(Arrays.toString(pares));
        System.out.println(Arrays.toString(impares));
    }
}
