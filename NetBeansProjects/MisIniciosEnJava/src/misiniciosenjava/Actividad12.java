/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misiniciosenjava;

//Escribe un programa que pida un número al usuario (entero) y devuelva su valor absoluto
import java.util.Scanner;
public class Actividad12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, numAbs;
        System.out.println("Dime un número entero");
        num = sc.nextInt();
        
        
        numAbs = num>0 ? num : -num;  //Si es mayor que 0 dará el "num" del valor 1, si no lo es, da el "num" del valor 2 el cual múltiplica por "-" para dar el absoluto.
        System.out.println("El valor absoluto de " + num + " Es "  + numAbs);
    }
}
