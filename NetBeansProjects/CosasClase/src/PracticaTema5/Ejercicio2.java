/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema5;

import java.util.Arrays;
import java.util.Random;
/**
Escribe la función void desordenar(int t[]), que cambia de forma aleatoria los elementos 
contenidos en el array t. Si el array estuviera ordenado, dejaría de estarlo. 
 */
public class Ejercicio2 {
    static void desordenar(int[] t){
        int indice, guardado, indice2;
        for (int i = 0; i < t.length; i++) {
            indice = new Random().nextInt(0, t.length);
            guardado = t[indice];
            indice2 = new Random().nextInt(0, t.length);
            t[indice] = t[indice2];
            t[indice2] = guardado;
        }
    }
    
    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        desordenar(t);
        System.out.println(Arrays.toString(t));
    }
}
