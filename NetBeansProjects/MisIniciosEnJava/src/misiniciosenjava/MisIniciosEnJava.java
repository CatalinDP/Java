/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package misiniciosenjava;
 //@author DAW
 
import java.time.*;
//no nos obliga a usar la clase
//import java.time.*; = Importas todo el paquete de time
public class MisIniciosEnJava {
    
     // @param args the command line arguments
     
    public static void main(String[] args) {
        
//Java es el paquete
//LocalTime es la clase
//time es un paquete hijo de java
//now es el método

java.time.LocalTime queHoraEs = java.time.LocalTime.now();
//No hace falta incluir los paquetes (java.time.) ya que los he importado
java.time.YearMonth anoMes = java.time.YearMonth.now();
//ava.time.LocalTime = nombre cualifidado.

System.out.println("Hola,\nla hora del sistema es: \n" + queHoraEs);
System.out.println("Del ano y mes: \n" + anoMes);
    }
    
}
