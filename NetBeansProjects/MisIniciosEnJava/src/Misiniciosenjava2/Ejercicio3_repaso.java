
package Misiniciosenjava2;

/*
Solicita al usuario tres distancias:
- La primera medida en mm
- La segunda medida en cm
- La tercera medida en m
Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en cm)
*/

import java.util.Scanner;
public class Ejercicio3_repaso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int mm, cm, m, totalcm;
        
        System.out.println("Dime un numero que será entendido en mm");
        mm = sc.nextInt();
        
        System.out.println("Dime un numero que será entendido en cm");
        cm = sc.nextInt();
        
        System.out.println("Dime un numero que será entendido en m");
        m = sc.nextInt();
        
        totalcm = (mm / 10) + (m * 100) + cm;
        System.out.println("El total en cm es: " + totalcm);
    }
    
}
