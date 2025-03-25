
package misiniciosenjava;
import java.util.Scanner;
public class Actividad4 {
    public static void main(String[] args) {
   //Actividad 1-4: Escribir una aplicación que pida el año actual y el de nacimiento del usuario. Debe calcular su edad, suponiendo que en el año en curso, el usuario ya ha cumplido años.

        
   Scanner entrada = new Scanner(System.in);
   
   System.out.println("Dime tu año de nacimiento");
   int añoNaci = entrada.nextInt();
   System.out.println("Dime en que año estamos");
   int añoActual = entrada.nextInt();
 
   int edad = añoActual - añoNaci;
        System.out.println("Tienes " + edad + " años");
   
   
  
   
        
    }
 
}
