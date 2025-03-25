/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemycurso;

/**
 *
 * @author DPCat
 */
public class ClaseObject {
    //La clase Object es la clase padre de todas las clase en java
    /*
    Contiene métodos como equals(), toString(), hashCode();
    Todas las clases en java heredan de manera indirecta de la clase object
    */
    
    static class Persona {
        
    private String nombre;
    private String apellido;

    @Override //Modificamos el metodo toString para que nos devuelva los valores de persona
    public String toString() {
        return "Nombre: " + this.nombre + "\n" + "Apelido: " + this.apellido;
    }
            
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        
    }        
            
            
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
        
        
       }
    
    }
        public static void main(String[] args) {
            Persona objeto1 = new Persona("Layla", "Acosta");
            //System.out.println(objeto1.toString());
            System.out.println(objeto1); //Automaticamente se llama el método toString, no hce falta ponerlo manualmente

        }
    
 
}

