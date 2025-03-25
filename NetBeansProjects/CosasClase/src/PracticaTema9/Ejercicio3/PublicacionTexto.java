/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema9.Ejercicio3;

/**
 *
 * @author DPCat
 */
public class PublicacionTexto extends PublicacionBase{
    String contenido;
    
    public PublicacionTexto(Usuario autor, String contenido) {
        super(autor);
        this.contenido = contenido;
    }

    @Override
    void editarPublicacion(String nuevoContenido) {
        this.contenido = nuevoContenido;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Autor: " + this.autor.nombre + "\n" + "Contenido: " + this.contenido);
    } 
}
