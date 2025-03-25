/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema9.Ejercicio3;

import java.util.Arrays;

/**
 *
 * @author DPCat
 */
public class Usuario {
    String nombre;
    Publicacion[] publicaciones;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.publicaciones = new Publicacion[0];
    }

    public String getNombre() {
        return nombre;
    }
    
    void agregarPublicacion(Publicacion publicacion) {
        this.publicaciones = Arrays.copyOf(this.publicaciones, this.publicaciones.length+1);
        this.publicaciones[this.publicaciones.length-1] = publicacion;
    }
    
    void mostrarPublicaciones() {
        for (Publicacion pub : this.publicaciones) {
            pub.mostrarDetalles();
        }
    }
    
}
