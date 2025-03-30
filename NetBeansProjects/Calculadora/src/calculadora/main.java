/*

 */
package calculadora;

import Contenedor.CalculadoraPantalla;
import java.util.Scanner;

/**
 *
 * @author DPCat
 */
public class main {
    public static void main(String[] args) {
//        Calculadora calc = new Calculadora();
//        
//        Scanner sc = new Scanner(System.in);
//        long v1, v2;
//        char op;
//        
//        System.out.println("Dime el valor 1");
//        v1 = sc.nextLong();
//        System.out.println("Dime el valor 2");
//        v2 = sc.nextLong();
//        
//        System.out.println("Dime que tipo de operación quieres");
//        String a = sc.nextLine();
//        a = sc.nextLine();
//        
//        op = a.charAt(0);
//        calc.funcional(v1, v2, op);
//        calc.resultado();
        CalculadoraPantalla panta = new CalculadoraPantalla();
        panta.setVisible(true);
        panta.setLocationRelativeTo(null);
    }
}
