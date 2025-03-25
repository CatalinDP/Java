/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema4;

import java.util.Scanner;
import java.util.Random;
/**
Crea una funci�n que muestre por consola una serie de n�meros aleatorios enteros. Los 
par�metros de la funci�n ser�n: la cantidad de n�meros aleatorios que se mostrar�n y los 
valores m�nimos y m�ximos que estos pueden tomar.
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
        
        System.out.println("Y con que m�ximo");
        max = sc.nextInt();
        
        randomMinMax(cantidad, min, max);
    }
}
