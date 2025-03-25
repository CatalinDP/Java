/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema4Funciones;

/**
    Ejercicio 11 
Escribir una función que calcule de forma recursiva el máximo común divisor de dos números. 
Para ello sabemos: 
? mcd(a, b): 
? mcd(a ? b, b) si a >= b 
? mcd(a, b - a) si b > a 
? a si b = 0 
? b si a = 0 
 */
public class Ejercicio11_2 {
    static int mcd(int a, int b) {

        int result;
        if (a == 0) {
            result = b;
        } else if (b == 0) {
           result = a;
        } else {
            int max = a > b ? a : b;
            int min = a > b ? b : a;
            result = mcd(min, max-min);
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(mcd(48, 18));
    }
}
