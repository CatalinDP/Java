
package misiniciosenjava;
import java.util.Scanner;
public class Actividad4 {
    public static void main(String[] args) {
   //Actividad 1-4: Escribir una aplicaci�n que pida el a�o actual y el de nacimiento del usuario. Debe calcular su edad, suponiendo que en el a�o en curso, el usuario ya ha cumplido a�os.

        
   Scanner entrada = new Scanner(System.in);
   
   System.out.println("Dime tu a�o de nacimiento");
   int a�oNaci = entrada.nextInt();
   System.out.println("Dime en que a�o estamos");
   int a�oActual = entrada.nextInt();
 
   int edad = a�oActual - a�oNaci;
        System.out.println("Tienes " + edad + " a�os");
   
   
  
   
        
    }
 
}
