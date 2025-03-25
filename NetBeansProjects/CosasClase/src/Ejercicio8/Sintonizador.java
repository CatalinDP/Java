/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author DPCat
 */
public class Sintonizador {
    private double frecuencia;
    
    public Sintonizador() {
        this.frecuencia = 80.0;
    }
    
    public Sintonizador(double frecuencia) {
        this.frecuencia = frecuencia;
    }
    
    public void up() {
        this.frecuencia += 0.5;
        if (this.frecuencia > 108) {
            this.frecuencia = 90;
        }
        display();
    }
    
    public void up(double up) {
        this.frecuencia += up;
        if (this.frecuencia > 108) {
            this.frecuencia = 90;
        }
        display();
    }
    
    public void down() {
        this.frecuencia -= 0.5;
        if (this.frecuencia < 90) {
            this.frecuencia = 108;
        }
        display();

    }
    
    public void down(double down) {
        this.frecuencia -= down;
        if (this.frecuencia < 90) {
            this.frecuencia = 108;
        }
        display();
    }
    
    public void display() {
        System.out.println("La frecuencia es: " + this.frecuencia);
    }
}
