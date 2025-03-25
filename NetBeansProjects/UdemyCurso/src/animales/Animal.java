/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author DPCat
 */
public class Animal {
    //Si se le añade protected solo podrá ser accedido por las clases hijas
    protected void comer() {
        System.out.println("Como");
    }
    protected void dormir() {
        System.out.println("Duermo");
    }
}

class Perro extends Animal{
    public void hacerSonido() {
        System.out.println("guau guau guau");
    }
}

class PruebaAnimal {
    public static void main(String[] args) {
        System.out.println("--Ejemplo herencia--");
        System.out.println("Clase padre, soy un animal");
        Animal animal1 = new Animal();
        animal1.comer();
        animal1.dormir();
        System.out.println("Perro------------");
        Perro perro1 = new Perro();
        perro1.hacerSonido();
        perro1.dormir();
        perro1.comer();
        
    }
}