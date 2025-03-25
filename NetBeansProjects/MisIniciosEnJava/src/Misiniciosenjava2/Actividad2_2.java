
package Misiniciosenjava2;

import java.util.Scanner;


public class Actividad2_2 {
    public static void main(String[] args) {
        /*  
        Solicita por teclado un num int al usuario y escribe un programa que muestre true o false, dependiendo de si el num es positivo
        */
    Scanner sc = new Scanner(System.in);
        int num;
        boolean positivo;
        
        System.out.println("Dime un número positivo o negativo");
        num = sc.nextInt();
        
        positivo = num >= 0;
        System.out.println("¿Es positivo? " + positivo);
        
        
    }
}
