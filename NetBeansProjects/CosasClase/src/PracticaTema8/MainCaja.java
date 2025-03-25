/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema8;

/**
 *
 * @author DPCat
 */
public class MainCaja {
    public static void main(String[] args) {
        Caja caja = new Caja(1000, 1500, 1200, "cm");
        System.out.println(caja.getVolumen());
        System.out.println(caja);
        
//        CajaCarton cajaC = new CajaCarton(10, 15, 12);
//        System.out.println(cajaC.getVolumen());
//        System.out.println(cajaC.getSuperficie());
    }
}
