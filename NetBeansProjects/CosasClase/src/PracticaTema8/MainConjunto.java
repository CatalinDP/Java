/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema8;

/**
 *
 * @author DPCat
 */
public class MainConjunto {
    public static void main(String[] args) {
        Conjunto con1 = new Conjunto();
        Conjunto con2 = new Conjunto();
        con1.insertarFinal(8);
        con1.insertarFinal(56);
        con1.insertarFinal(12);
        con1.insertarFinal(6);
        con1.insertarFinal(15);
        con1.insertarPrincipio(9);
        con2.insertarFinal(8);
        con2.insertarFinal(56);
        con2.insertarFinal(12);
        con2.insertarFinal(6);
        con2.insertarFinal(9);
        con2.insertarFinal(15);
        System.out.println(con1);
        System.out.println(con2);
//       con1.insertarFinal(con2);
//       System.out.println(con1);
//       con1.insertar(2, 6);
//       con1.insertar(6, 6);
//       System.out.println(con1);
        System.out.println(con1.equals(con2));
        System.out.println(con1);
    }
}
