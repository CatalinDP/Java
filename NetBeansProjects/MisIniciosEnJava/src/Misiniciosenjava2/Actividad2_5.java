
package Misiniciosenjava2;

//   Una aplicaci�n que pide un n�mero entero e imprimir por pantalla si es par o no

import java.util.Scanner;

public class Actividad2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Dime un numero entero: ");
        num = sc.nextInt();
        
        if (num % 2 == 0) {System.out.println("Es par");
        } else {System.out.println("Es impar");}
        
    }
}
