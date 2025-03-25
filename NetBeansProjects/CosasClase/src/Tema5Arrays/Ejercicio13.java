/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema5Arrays;

import java.util.Arrays;

/**
Ejercicio 13 
Implementar la función: int [] sinRepetidos(int t[]), que construye y devuelve un array de la 
longitud apropiada, con los elementos de t, donde se han eliminado los datos repetidos. 
 */
public class Ejercicio13 {
    static boolean existe(int[] t, int numeroBuscar) {
        boolean encontrado = false;
        int i = 0;        
        while(!encontrado && i < t.length) {
                if (t[i] == numeroBuscar) {
                    encontrado = true;
                }
            i++;
        }    
        return encontrado;
    }
    
    static int[] sinRepetidos(int[] t) {
        int[] sinRepe = new int[0];
        for (int numero : t) {
            if (!existe(sinRepe, numero)) {
                sinRepe = Arrays.copyOf(sinRepe, sinRepe.length + 1);
                sinRepe[sinRepe.length-1] = numero;
            }
        }
        
        
        return sinRepe;
    }
    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 4, 5, 2, 3};
        int[] tSinRepe = sinRepetidos(t);
        System.out.println(Arrays.toString(tSinRepe));
    }
}
