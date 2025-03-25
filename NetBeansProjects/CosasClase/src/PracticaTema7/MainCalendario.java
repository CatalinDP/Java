/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema7;

/**
 *
 * @author DPCat
 */
public class MainCalendario {
    public static void main(String[] args) {
        Calendario cale = new Calendario(30, 12, 1992);
        cale.incrementarAnio(5);
        cale.incrementarMes();
        cale.mostrar();
        cale.incrementarMes();
        cale.mostrar();
    }
}
