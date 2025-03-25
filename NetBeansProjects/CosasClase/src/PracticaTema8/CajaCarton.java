/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema8;

/**
 *
 * @author DPCat
 */
public class CajaCarton extends Caja{
    
    public CajaCarton(int ancho, int alto, int fondo) {
        super(ancho, alto, fondo, "cm");
    }
    
    @Override
    public double getVolumen() {
        return this.alto * this.ancho * this.fondo * 80 / 100;
    }
    
    public double getSuperficie() {
        return 2 * (this.alto * this.ancho + this.alto * this.fondo + this.ancho * fondo);
    }
    
}
