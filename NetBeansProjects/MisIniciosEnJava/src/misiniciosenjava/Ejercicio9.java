
package misiniciosenjava;

import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        //Escribir un programa que pida un número al usuario e indique mediante un literal booleano si el número es par.
        Scanner sc = new Scanner(System.in);
        int num;
        boolean par;
        int parImpar;
        System.out.println("Dime un número");
        num = sc.nextInt();
        parImpar = num % 2;
        par = parImpar == 0;

        System.out.println("¿Es número es par? \n" + par);
        
        
        
        
        
    }
}
