/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema4;

import java.util.Scanner;
import java.util.Random;
/**
Crea una función que muestre por consola una serie de números aleatorios enteros. Los 
parámetros de la función serán: la cantidad de números aleatorios que se mostrarán y los 
valores mínimos y máximos que estos pueden tomar.
 */
public class Practica4 {
    static void randomMinMax(int cantidad, int min, int max) {
        Random ran = new Random();
        for (int i = 0; i < cantidad; i++) {
            System.out.println(ran.nextInt(min, max));
        }

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad, min, max;
        
        System.out.println("Cuantos numeros quieres que se muestren");
        cantidad = sc.nextInt();
        
        System.out.println("Con que minimo");
        min = sc.nextInt();
        
        System.out.println("Y con que máximo");
        max = sc.nextInt();
        
        randomMinMax(cantidad, min, max);
    }
}
