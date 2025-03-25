/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema4;

import java.util.Scanner;

/**
Escribe una función que decida si dos números enteros positivos son amigos. Dos números a y 
b son amigos si la suma de los divisores propios (distintos de él mismo) de a es igual a la suma 
de los de b. Y viceversa.
Para probar se pueden usar los números 220 y 284, que son amigos.
 */
public class Practica3 {
    static void numerosAmigos(int a, int b){
        int suma1, suma2;
        suma1 = 0;
        suma2 = 0;
        for (int i = (a-1); i >= 1; i--) {
            int mcd = (a) % i;
            if (mcd == 0) {
                suma1 += i;
                
            }
        }
        for (int i = (b-1); i >= 1; i--) {
            int mcd = b % i;
            if (mcd == 0) {
                suma2 += i;
                
            }
        }
        System.out.println(suma1);
        System.out.println(suma2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        System.out.println("Dime un numero entero a");
        a = sc.nextInt();
        System.out.println("Dime un numero entero b");
        b = sc.nextInt();
        
        numerosAmigos(a, b);
        
    }
}
