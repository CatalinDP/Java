/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemasAvanzados;

import java.io.Serializable;

/**
 *Un javaBean es una clase de java que dee cubrir ciertas caracteristicas
 * 1 --> Debe tener un constructor vacío, aunque pude tener más constructores
 * 2 --> Debe aplicar el concepto de encapsulamiento. Es decir, atributos privatos, y métodos getter/setter para acceder a atributos
 * 3 --> Debe implementar la interface Serializable. Permie enviar los objetos por la red o a disco duro
 */
public class JavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Carlos");
        System.out.println( persona.toString());
        System.out.println(persona.getNombre());
        System.out.println(persona.getApellido());
    }
}

class Persona implements Serializable{
    public Persona(){}
    private String nombre;
    private String apellido;
    
    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona\n"  + "nombre: "  + nombre +  "\napellido: " + apellido;
    }
    
    
}