
package Misiniciosenjava2;
/*
Escribe una app que pida al usuario dos números 
enteros y muestre true Si ambos números son distintos entre si o alguno de ellos es cero o false en caso contrario
*/

import java.util.Scanner;

public class Actividad2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA, numB;
        boolean bool;
        
        System.out.println("Dime un numero entero");
        numA = sc.nextInt();
        System.out.println("Dime otro numero entero");
        numB = sc.nextInt();
        
        bool = numA != numB && numA == 0 || numB == 0;
        
        System.out.println("Son distintos; " + bool);
    }
}
