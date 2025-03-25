/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema4;

import java.util.Scanner;

/**
Crea la función muestraPares(int n) que muestre por consola los primeros n números pares.
 */
public class Practica1 {
        static void muestraPares(int n) {
            n = 2 * n;
            for(int i = n; i >= 1; i--) {
                if (i %2 == 0) {
                    System.out.println(i);
                }
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Dime un numero");
        n = sc.nextInt();
        
        muestraPares(n);
        
    }
}
