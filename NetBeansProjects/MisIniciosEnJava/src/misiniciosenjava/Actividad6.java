package misiniciosenjava;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
public class Actividad6 {
    public static void main(String[] args) {
//Activida 1-6: Crea una app que calcule la media aritmética de dos notas enteras. Hay que tener en cuenta que la media puede tener decimales.    

Scanner sc = new Scanner(System.in);
        System.out.println("Dime una de las notas");
int nota1 = sc.nextInt();
        System.out.println("Dime la otra nota");
int nota2 = sc.nextInt();

double media = (double) (nota1 + nota2) / 2;
        System.out.println(media);
        
    }
}
