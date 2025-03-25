
package Misiniciosenjava2;

/* Dado el siguiente polinomio de segundo grado:
Y = ax^2 + bx + c
Crea un programa que pida los coeficientes a, b ,c, asi como el valor de x, y calcula el valor correspondiente de y.
*/
import java.util.Scanner;
import java.math.*;

public class Ejercicio2_repaso {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c, Y, x;
    
        System.out.println("Dime un número para a: ");
        a = sc.nextInt();
        
        System.out.println("Dime un número para b: ");
        b = sc.nextInt();
        
        System.out.println("Dime un número para c: ");
        c = sc.nextInt();
        
        System.out.println("Dime un número para x: ");
        x = sc.nextInt();
        
        Y = (a * ((int)Math.pow(x, 2))) + (b * x) + c;
        
        System.out.println("El valor de Y es: " + Y);
             
     
     
    }
}
