/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Misiniciosenjava2;

/*
Realiza un programa que almacene la evaluación de distintas expresiones relacionales en variables booleanas, y muestra el valor de dichas variables.
*/

public class Actividad2_1 {
    public static void main(String[] args) {
     boolean Expr1, Expr2;
     int b, a, c, d;
     a = 100;
     b = 220;
     d = 190;
     c = 56;
     Expr1 = a >= b;
     Expr2 =  c!= d;
     
        System.out.println("¿Es " + a + " mayor o igual de " + b + " ? \n" + Expr1);
        System.out.println("¿Es " + d + " distinto de " + c + " ? \n" + Expr2);   
    }   
}
