
package Misiniciosenjava2;
/* Un economista te ha encargado un programa para realizar cálculos con el IVA. La app debe solicitar la base imponible y el IVAa que se debe aplicar.
muestra en pantalla el importe correspondiente al IVA.
*/

import java.util.Scanner;
public class Ejercicio1_repaso {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    double baseImp, total, ivaT;
    int iva;

        System.out.println("Dime el IVA del producto");
        iva = sc.nextInt();
        
        System.out.println("Dime el precio");
        baseImp = sc.nextDouble();
        
        ivaT = baseImp * (iva / 100.0);
        total = ivaT + baseImp;
        
        System.out.println("El IVA es: " + ivaT + " Y en total es: " + total);
        
        
        
    }
}
