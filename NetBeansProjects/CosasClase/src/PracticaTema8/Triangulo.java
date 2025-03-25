/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema8;

/**
 *
 * @author DPCat
 */
public class Triangulo extends Poligono{

    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    double area() {
        return this.base * this.altura / 2;
    }
    
}
