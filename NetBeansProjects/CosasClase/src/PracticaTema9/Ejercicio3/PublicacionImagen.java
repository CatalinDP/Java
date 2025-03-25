/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema9.Ejercicio3;

/**
 *
 * @author DPCat
 */
public class PublicacionImagen extends PublicacionBase implements PublicacionConMultimedia{
    String url;

    public PublicacionImagen(String url, Usuario autor) {
        super(autor);
        this.url = url;
    }

    @Override
    void editarPublicacion(String url) {
        this.url = url;
    }

    @Override
    public void mostrarMultimedia() {
        System.out.println("Muestra la imagen");
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Autor: " + this.autor.nombre + "\n" + "Imagen: " + this.url);   
    }
    
    
}
