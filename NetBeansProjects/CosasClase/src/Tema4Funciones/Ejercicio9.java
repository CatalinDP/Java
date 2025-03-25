package Tema4Funciones;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Ejercicio 9
 * Diseñar la función: int máximo(int t[]), que devuelve el máximo valor contenido en un array t. 
 */
public class Ejercicio9 {
    static int maximo(int[] t) {
        int max = t[0];
        for (int num : t) {
            if (num > max) {
                max = num;
            }
        }
        
        return max;
    }
    public static void main(String[] args) {
        int[] t = {1, 5 ,2 ,7 , 9, 4};
        System.out.println(maximo(t));
    }
}
