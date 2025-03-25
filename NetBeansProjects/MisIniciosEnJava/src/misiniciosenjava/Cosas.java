/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misiniciosenjava;
import java.util.Scanner;
public class Cosas {
    public static void main(String[] args) {
        
        
        String text = "Hola este es un texto";
        int count = text.split("\\s").length;
        System.out.println(count);
        
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.endsWith("a")); //Comprobar con que simbolo acaba
        System.out.println(text.replace("e", "o")); //reemplazar lo primero por lo segundo.
        int num;
        num = 19;
        
        Scanner sc = new Scanner(System.in);
        String saludo = "Hola";
        
        String lower = saludo.toLowerCase();
        
        if (lower.equals("hola")) { 
        System.out.println("Es hola"); 
        } else { System.out.println("No es hola");
                }
        
        
        
    }
}
