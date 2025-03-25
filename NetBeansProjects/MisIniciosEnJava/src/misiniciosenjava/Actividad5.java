/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misiniciosenjava;

public class Actividad5 {
    public static void main(String[] args) {
//Actividad 1-5: El tipo short permite almacenar valores comprendidos entre -32768 y 32767.
//Escribir un programa que compruebe el rango de valores de un tipo se comporte de forma cíclica, es decir, el valor siguiente al máximo es el mínimo.

 short numb1 = 32767;
 
        System.out.println(++numb1);
        
        if (numb1 > 32767) { System.out.println("No volvió al mínimo");
        } else if (numb1 == -32768){ System.out.println("Es ciclico");
        }



    }
}
