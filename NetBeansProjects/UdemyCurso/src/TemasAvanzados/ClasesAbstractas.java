/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemasAvanzados;

/**
 * Las clases abstractas son aquellas que tienen un método imcompleto pensado para que las clases hijas lo hereden y lo completen según su necesidad
 */
public class ClasesAbstractas {
    public static void main(String[] args) {
        FiguraGeometrica rectang = new Rectangulo();
        rectang.dibujar();
        FiguraGeometrica circu = new Circulo();
        circu.dibujar();
    }
}

abstract class FiguraGeometrica { //No se pueden crear objetos de esta clase
    public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica {
    public void dibujar() {
        System.out.println("Me dibujo un tremendo rectangulo");
    }
}

class Circulo extends FiguraGeometrica {
    public void dibujar() {
        System.out.println("Me dibujo tremendo circuliño");
    }
}
