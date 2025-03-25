/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemycurso.Cadenas;

/**
Crear un programa para generar un email a partir de los siguientes datos
 */
public class EjercicioStrEmail {
    public static void main(String[] args) {
        String nombre = "Tensheo el Eo";
        String escuela = "Miguel Hernandez";
        String dominio = ".com.es";
        
        String nombre1 = nombre.substring(0, 7);
        String nombre2 = nombre.substring(8, 10);
        String nombre3 = nombre.substring(11, 13);
        
        String nombreEmail = String.join(".", nombre1, nombre2, nombre3).toLowerCase(); //Podría haber usado replace para reempalzar los espacios por puntos
        System.out.println(nombreEmail);
        
        String escuela1 = escuela.substring(0, 6);
        String escuela2 = escuela.substring(7, 16);
        String dominioEmail = String.join("","@", escuela1, escuela2).toLowerCase();
        System.out.println("El email será: " + nombreEmail + dominioEmail+ dominio);
        
        
    }
}
