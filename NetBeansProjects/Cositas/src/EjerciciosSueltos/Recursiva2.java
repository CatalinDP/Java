/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosSueltos;

import java.util.Scanner;

/**
Crea un m�todo que imprima los d�gitos desde N hasta 1. Se debe pasar como par�metro el n�mero N
 */
public class Recursiva2 {
    static int NumDigito(int n) {
        if (n == 0) {
         return n;   
        } else {
            System.out.println(NumDigito(n - 1));
            return n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime num");
        int n = sc.nextInt();
        NumDigito(n);
    }
}
