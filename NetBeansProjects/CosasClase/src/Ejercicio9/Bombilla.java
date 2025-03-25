/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 * Modelar una casa con muchas bombillas, de forma que cada bombilla se pueda encender o apagar individualmente.
 * Para ello, hacer una clase Bombilla con una variable privada que indique si esta encendida o apagada, así como un método que nos diga el estado de una bombilla concreta.
 * Además, queremos poner un interruptor general, de forma que, si este se apaga, todas las bombillas quedan apagadas, según estuvieran antes.
 * Cada bombilla se enciende y se apaga individualmente, pero solo responde que está encendida si su interruptor particular esta activado y además hay luz general.
 */
public class Bombilla {
    private boolean encendido;
    static boolean general = true;
    
    public Bombilla() {
        this.encendido = false;
    }
    
    public Bombilla(boolean encendido) {
        this.encendido = encendido;
    }
    
    public static boolean interruptorGeneral() {
        if (Bombilla.general == true) {
            Bombilla.general = false;
        } else {
            Bombilla.general = true;
        }  
        return Bombilla.general;
    }
    
    public void apagar() {
        this.encendido = false;
        if (Bombilla.general == false) {
            this.encendido = false;
        } 
    }
    
    public void encender() {
        this.encendido = true;
        if (Bombilla.general == false) {
            this.encendido = false;
        } 
    }
    
    public void estaEncendido() {
        if (Bombilla.general == false) {
            System.out.println("La bombilla esta apagada");
        } else {
            System.out.println("La bomilla esta encendida");
        }
    }
}
