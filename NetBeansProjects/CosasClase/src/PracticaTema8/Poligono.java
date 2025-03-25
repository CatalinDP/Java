/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema8;

/**
 *
 * @author DPCat
 */
public abstract class Poligono {
    double base;
    double altura;

    public Poligono(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    abstract double area();
    
}
