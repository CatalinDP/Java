/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema4;

import java.util.Scanner;

/**
Diseña una función a la que se le pasan las horas y minutos de dos instantes de tiempo, con el 
siguiente prototipo:
static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2)
La función devolverá la cantidad de minutos que existen de diferencia entre los dos instantes 
utilizados (el valor devuelto por la función debe de ser siempre positivo).
 */
public class Practica2 {
    static int diferenciaMin(int hora1, int min1, int hora2, int min2) {
        int total1, total2, diferencia;
        total1 = (hora1 * 60) + min1;
        total2 = (hora2 * 60) + min2;
        if (hora1 > 23 || hora2 > 23 || min1 >= 60 || min2 >= 60) {
            System.out.println("Las horas estan mal, cambialas y vuelve a intentarlo");
            return 0;
        }
        if (total1 > total2) {
            diferencia = total1 - total2;
            return diferencia;
        } else if (total1 == total2) {
            System.out.println("No hay diferencia");
            return 0;
        } else {
            diferencia = total2 - total1;
            return diferencia;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora1, hora2, min1, min2;
        
        System.out.println("Hora1");
        hora1 = sc.nextInt();
        
        System.out.println("Min1");
        min1 = sc.nextInt();
        
        System.out.println("Hora2");
        hora2 = sc.nextInt();
        
        System.out.println("Min2");
        min2 = sc.nextInt();
        
        int diferencia = diferenciaMin(hora1, min1, hora2, min2);
        System.out.println("La diferencia es de " +diferencia + " minutos");
    }
}
