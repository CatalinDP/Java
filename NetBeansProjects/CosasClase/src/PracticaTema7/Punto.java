/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema7;

/**
 *
 * @author DPCat
 */
public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void desplazaX(double dx) {
        this.x += dx;
    }
    public void desplazaY(double dy) {
        this.y += dy;
    }
    
    public void desplaza(double dy, double dx) {
        this.y += dy;
        this.x += dx;
    }
    
    public double distanciaEuclidea(Punto otro) {
        double distanciaEuc = Math.sqrt(Math.pow((otro.x - this.x), 2)+Math.pow((otro.y - this.y), 2));
        return distanciaEuc;
    }
    
    public void muestra() {
        System.out.println("El punto 'x': " + this.x + ", el punto 'y': " + this.y);
    }
}
