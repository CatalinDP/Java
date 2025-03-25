/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author DPCat
 */
public class PruebaPersona {
    
    
    
    
    public static void main(String[] args) {
        Persona objeto1 = new Persona();
        objeto1.setApellido("Mariano");
        objeto1.setNombre("Luigino");
        objeto1.mostrarPersona();
        //Segundo objeto
        Persona objeto2 = new Persona();
        objeto2.setApellido("Adios");
        objeto2.setNombre("Hola");
        objeto2.mostrarPersona();  
    }
}
