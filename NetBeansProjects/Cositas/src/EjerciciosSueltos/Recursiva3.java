/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosSueltos;

import java.util.Scanner;

/**
Crea un método que obtenga la cantidad de dígitos de un número N. Se debe pasar como parámetro el número N
 */
public class Recursiva3 {
    static void DigitoSolo (int n)  {
        if (n <= 0) {
        
        } else {      
            System.out.println(n % 10);
            DigitoSolo(n / 10);
        } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime num");
        int n = sc.nextInt();
        DigitoSolo(n);
    }
}
