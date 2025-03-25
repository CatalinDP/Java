/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misiniciosenjava;






public class Operadores {
    
    
     public static void main(String[] args) { 
     //Operador asignación
     // variable = expresión
     
     int total, x;
     total = 123;
     x = 543;
     total = 0;
     x = 2 + total; //expresión
     
     /*Operadores artiméticos
      + Suma/positivo
      - resta/negativo
      * multiplicación
      / división
      % obtener el resto de una división
      ++ incremento
      -- decremento
      a++ --> a = a + 1;
      a-- --> a = a - 1;
      ++a = prefijo primero sumo, luego asigno (1 + a) 
      a++ = postfijo primero  asigno y luego sumo (
      */
     
     int a, b, c, d, e, f; // = 0, no le hemos asignado un valor.
     a = 1;
     b = a++; //b recoge el valor de a
     c = ++a; // primero se le suma 1 a "c" y luego se le asigna el valor de "a"
     
     d = 1;
     e = ++d;
     f = d++;
     System.out.println(d);
     System.out.println(e);
     System.out.println(f);

     Double z = 1.0/10.0 + 2.0/10.0;
     z = z * 10.0;
     System.out.println(z); //Error de calculo al trabajar con decimales
     
     //Los tipos primitivos son circulares, cuando sobrepasan su máximo, vuelven al primer número
    
       
     
     
     
     
     
     
     }
}
