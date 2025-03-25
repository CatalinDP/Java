/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemasAvanzados;

/**
 * Una interface es un tipo similar a una clase abstracta. Sin embargo la interface se enfoca m�s en el comportamiento,
 * y la clase abstracta se enfoca en abstraer las caracteristicas en com�n.
 */
public interface Interfaces { //Interface ser� utilizada como traductor --> public interface traductor
        //Los m�todos si no especificamos otra cosa, son p�blicos y abstractos
    void traducir();
    
    default void iniciandoTraductor() {
        System.out.println("Iniciando traductor");
    }   
}

class Ingles implements Interfaces {
    @Override
    public void traducir() {
        System.out.println("Traduciendo al ingles");
    }
    @Override
    public void iniciandoTraductor() {
        System.out.println("INICIANDO TRADUCTOR ingels");
    }
}

class Frances implements Interfaces {
    @Override 
    public void traducir(){
        System.out.println("Traduzco al frances");
    }
}

class prueba {
    public static void main(String[] args) {
        Interfaces ingles = new Ingles();
        Interfaces frances = new Frances();
        ingles.iniciandoTraductor();
        ingles.traducir();
        frances.iniciandoTraductor();
        frances.traducir();
    }
}