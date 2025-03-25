/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema8;

/**
 *
 * @author DPCat
 */
public class Caja {
    final int alto;
    final int ancho;
    final int fondo;
    private String etiqueta;
    Unidad unidad;
    enum Unidad {cm, m};
    
    public Caja(int ancho, int alto, int fondo, String unidad) {
        
        if (unidad.equals("cm")) {
            this.ancho = ancho / 100;
            this.alto = alto / 100;
            this.fondo = fondo / 100;
            this.unidad = Unidad.m;
        } else {
            this.ancho = ancho;
            this.alto = alto;
            this.fondo = fondo;
        }
    }
    
    public double getVolumen() {
        return this.alto * this.ancho * this.fondo;
    }
    
    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }
    
    @Override
    public String toString() {
        return "El alto de la caja; " + this.alto + this.unidad+ ", el ancho: " + this.ancho + this.unidad + ", el fondo: " + this.fondo + this.unidad;
    }
    
}
