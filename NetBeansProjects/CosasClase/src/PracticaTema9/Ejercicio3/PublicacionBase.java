/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema9.Ejercicio3;

/**
 *
 * @author DPCat
 */
public abstract class PublicacionBase implements Publicacion{
    Usuario autor;
    static int totalPublicaciones;

    public PublicacionBase(Usuario autor) {
        this.autor = autor;
        this.totalPublicaciones++;
    }
    
    public String obtenerAutor() {
        return this.autor.getNombre();
    }

    static int getTotalPublicaciones() {
        return totalPublicaciones;
    }

    abstract void editarPublicacion(String nuevoContenido);
    
}
