/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemycurso;

/**
 *
 * @author DPCat
 */
public class IdUnico {
    
    static class Persona {    
        
        private static int contadorPersonas = 0;
        private String nombre;
        private String apellido;
        private int idPersona;

        @Override //Modificamos el metodo toString para que nos devuelva los valores de persona
        public String toString() {
            return "Nombre: " + this.nombre + "\n" + "Apelido: " + this.apellido + ", id: " + this.idPersona;
        }

        public Persona(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
            Persona.contadorPersonas++;
            //Asigna una id unica a cada objeto
            this.idPersona = Persona.contadorPersonas;
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
            Persona persona1 = new Persona("marc", "po");
            Persona persona2 = new Persona("marc", "p2");
            Persona persona3 = new Persona("marc", "po3");
            System.out.println(persona1);
            System.out.println(persona2);
            System.out.println(persona3);
        }
    }
}
