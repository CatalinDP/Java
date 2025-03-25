/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema4Funciones;

/**
    Ejercicio 10 
Diseñar una función que calcule an, donde a es real y n es entero no negativo. Realizar una 
versión iterativa y otra recursiva. 
 */
public class Ejercicio10 {
    static double calculo(int a, int n) {
        double calc;
        if (n == 0) {
            calc = 1;
        } else {
            calc = a * calculo(a, n-1);
        }
        return calc;
    }
    public static void main(String[] args) {
        int a = 5;
        int n = 5;
        System.out.println(calculo(a, n));
    }
}
