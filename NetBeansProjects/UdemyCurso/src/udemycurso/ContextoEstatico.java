/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemycurso;

/**
 *
 * @author DPCat
 */
public class ContextoEstatico {
    //El contexto estatico es cuando definimos/creamos nuestras clases.
    //El contexto dinamico es cuando creamos objetos
    //El contexto estático no puede acceder al contexto dinámico
    //El contexto dinámico si puede acceder al contexto estático
    
    static class Persona {    
        
        static int contadorPersonas = 0;
        private String nombre;
        private String apellido;

        @Override //Modificamos el metodo toString para que nos devuelva los valores de persona
        public String toString() {
            return "Nombre: " + this.nombre + "\n" + "Apelido: " + this.apellido;
        }

        public Persona(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
            Persona.contadorPersonas++;
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
        
        
        
        public static void main(String[] args) {
            Persona persona1 = new Persona("Lau", "Ra");
            Persona persona2 = new Persona("Go", "Man");
            System.out.println(persona1);
            System.out.println(persona2);
            //Con contadorPersonas definido en la clase, puedo aumentarlo en 1 en el contructor por el cual pasan todos los objetos al crearse
            System.out.println(Persona.contadorPersonas);
        }
    }
}
