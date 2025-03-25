/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misiniciosenjava;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        //Pedimos la edad e identificar si es mayor o menor de edad
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu edad");
        
        int edad = sc.nextInt();
        
        boolean mayor = (edad >= 18);
        
        System.out.println(mayor);    
}
}
