
package misiniciosenjava;

import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        //Escribir un programa que pida un n�mero al usuario e indique mediante un literal booleano si el n�mero es par.
        Scanner sc = new Scanner(System.in);
        int num;
        boolean par;
        int parImpar;
        System.out.println("Dime un n�mero");
        num = sc.nextInt();
        parImpar = num % 2;
        par = parImpar == 0;

        System.out.println("�Es n�mero es par? \n" + par);
        
        
        
        
        
    }
}
