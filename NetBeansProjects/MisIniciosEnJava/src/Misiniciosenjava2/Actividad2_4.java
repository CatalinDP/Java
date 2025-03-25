/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Misiniciosenjava2;

import java.util.Scanner;

/*
Realiza un programa que informe al usuario si un número s múltiplo de otro número (true)
*/
public class Actividad2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int numA, numB, resto;
     boolean multiplo;
        System.out.println("Dimero un número entero: ");
        numA = sc.nextInt();
        
        System.out.println("Dime otro entero");
        numB = sc.nextInt();
       
        multiplo = numB != 0 && (numA % numB == 0);
        
        System.out.println("Es múltiplo: " + multiplo);
}
   } 
