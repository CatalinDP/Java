/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosSueltos;

import java.util.Scanner;

/**
 * Suma los numeros de 1 a n recursivamente
 * 
*/
public class Recursiva1 {
   static int SumaNum(int n) {
      System.out.println(n);
      if (n == 0) {
          return n;
      } else {
          return n + SumaNum(n - 1);
      } 
   } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int n = sc.nextInt();
        System.out.println(SumaNum(n));
    }
   
}
