/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema4Funciones;

/**
 * Ejercicio 12 
Diseñar una función recursiva que calcule el enésimo término de la serie de Fibonnacci. En esta 
serie el enésimo valor se calcula sumando los dos valores anteriores de la serie. Es decir: 
? fibonacci(n) = fibonacci(n - 1) + fibonacci(n - 2) 
? fibonacci(0) = 1 
? fibonacci(1) = 1 
 */
public class Ejercicio12 {
    static int fibonacci(int n) {
        int res;
        if (n == 0 || n == 1) {
            res = 1;
        } else {
            res =  fibonacci(n-1) + fibonacci(n-2);
        }
        return res;
    }
    
    static int fibo(int num) {
        int res;

        if (num == 0 || num == 1) { 
            res = 1;
        } else {
            res = fibo(num - 1) + fibo(num - 2); 
        }

        return (res);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(5)); 
        System.out.println(fibo(5)); 
    }
}
