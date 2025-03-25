/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author DPCat
 */
public class mainBombilla {
    public static void main(String[] args) {
        Bombilla bomb = new Bombilla();
        bomb.encender();
        Bombilla.interruptorGeneral();
        bomb.estaEncendido();
        Bombilla.interruptorGeneral();
        bomb.estaEncendido();
    }
}
