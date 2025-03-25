package misiniciosenjava;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.math.*;
import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
//Actividad 1-7: Diseña una app que calcule la longitud y el área de una circunferencia. Para ello, el usuario debe introducir el radio (que puede tener decimales).
//Recordamos longitud = 2*pi*radio área = pi*radio(2)
        
Scanner sc = new Scanner(System.in);

System.out.println("Dime el radio:");
double radio = sc.nextDouble();

double longi = 2 * Math.PI * radio; 
double area = Math.PI * Math.pow(radio, 2);
        System.out.println("La logitud es " + longi + "Y el área es " + area);




    }
}
