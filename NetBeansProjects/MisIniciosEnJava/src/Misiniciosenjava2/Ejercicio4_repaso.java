
package Misiniciosenjava2;

import java.util.Scanner;
public class Ejercicio4_repaso {
    public static void main(String[] args) {
        //Pide dos numeros al usuario, a y b. Deberá mostrarse true si es mayor o igual que b y false si es menor que b
        Scanner sc = new Scanner(System.in);
        int a, b;
        boolean z;
        
        System.out.println("Dime un numero");
        a = sc.nextInt(); 
        
        System.out.println("Ahora dime otro");
        b = sc.nextInt(); 
        
        z = a >= b;
        System.out.println("¿Es el primer número mayor que el segundo? \n" + z);
        
       
        
    }
}
