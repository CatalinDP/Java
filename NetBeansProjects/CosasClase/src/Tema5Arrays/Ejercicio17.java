/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema5Arrays;

import java.util.Arrays;

/**
    Ejercicio 17 
Escribir la función: int[] eliminarMayores(int t[], int valor), que crea y devuelve una copia del 
array t donde se han eliminado todos los elementos que son mayores que valor. 
 */
public class Ejercicio17 {
    static int[] eliminarMayores (int[] t, int valor) {
            int i = 0;
            while (i < t.length) {
                if (t[i] > valor) {
                    t[i] = t[t.length-1]; 
                    t = Arrays.copyOf(t, t.length-1);
                    System.out.println("asdas");  
                    i--;
                } 
                i++;
            }
        return t;
    }
    public static void main(String[] args) {
        int[] t = {1, 2, 5, 3, 7, 7, 8, 10, 15, 15, 12, 13, 4, 5, 2, 3, 6};
        int[] tEli = eliminarMayores(t, 2);
        System.out.println(Arrays.toString(tEli));
    }
}
