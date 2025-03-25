/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misiniciosenjava;
import java.util.Scanner;

/*Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras.
Por ese motivo, es necesario diseñar una app que solicite las ventas(en kg) de cada semestre para cada fruta. 
La app mostrará el importe total sabiendo que el precio del kilo de manzanas esta fijado en 2.35? y el de peras en 1.95?
*/

public class Actividad11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int manzana1, manzana2;
        int pera1, pera2;
        double peraT, manzanaT, importe;
        final double PRECIO_MANZ = 2.35;
        final double PRECIO_PERA = 1.95;
        
        System.out.println("¿Cuántos kilos de manzanas hemos vendido en el primer semestre? ");
        manzana1 = sc.nextInt();
        System.out.println("¿Y en el segundo?");
        manzana2 = sc.nextInt();

        System.out.println("¿Cuántos kilos de pera hemos vendido?");
        pera1 = sc.nextInt();
        System.out.println("¿Y en el segundo?");
        pera2 = sc.nextInt();
        
        manzanaT = manzana1 + manzana2;
        manzanaT *= PRECIO_MANZ;
                
        peraT = pera1 + pera2;
        peraT *= PRECIO_PERA;       
        
        importe = (manzanaT) + (peraT);
        System.out.println("Hemos generado un total de: " + importe +  " euros");
    }
   
}
