/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Misiniciosenjava2;

import java.math.RoundingMode;
import java.util.Scanner;
public class Actividad4 {
    public static void main(String[] args) {
        // Realiza un programa que reciba como enttrada un decimal y lo muestre redondeado al entero mas positivo
        Scanner sc = new Scanner(System.in);
        double numD, numD2;
        int numNoD; 
        
        System.out.println("Dime un numero con decimales");
        numD = sc.nextDouble();
        
        numNoD = (int)(numD + 0.5);
        System.out.println("Redondeado " + numNoD);
        
        System.out.println("Ahora dime otro numero con decimal");
        
        numD2 = sc.nextDouble();
        System.out.println("Ahora usando la libería MATH: " + Math.round(numD2));

      }
}
