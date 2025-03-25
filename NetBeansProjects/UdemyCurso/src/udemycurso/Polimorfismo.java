/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemycurso;

/**
 *
 */
public class Polimorfismo {
    //Significa multiples formas, o sea, multiples comportamientos dependiendo del dato con el que estamos trabajando
    //El método que se llama es el método 
      
}
    class Animal {
    protected void dormir() {
        System.out.println("Duermo");
    }
}

class Perro extends Animal{
    @Override //Significa que estamos sobre escribiendo
    //Con dormir sobreescrito, ejemplo de poliformismo
    protected void dormir() {
            System.out.println("Duermo como un perro");
        }
}

class Gato extends Animal {
    //Otro ejemplo de poliformismo, esta vez con el gato
    protected void dormir() {
        System.out.println("El gato duerme miau");
    }
}

class Prueba {
    //Esto se llama método polimorfico.
    static void imprimirDormir(Animal animal) {
        animal.dormir();
    }
    
    public static void main(String[] args) {
        Perro perro = new Perro();
        
        Gato gato = new Gato();
        
        Animal animal = new Animal();
        imprimirDormir(gato);
    } 
}