/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema9.Ejercicio3;

/**
 *
 * @author DPCat
 */
public class PublicacionVideo extends PublicacionBase implements PublicacionConMultimedia, PublicacionInteractiva{

    String urlVideo;
    int reacciones;

    public PublicacionVideo(String urlVideo, Usuario autor) {
        super(autor);
        this.urlVideo = urlVideo;
    }
    
    @Override
    void editarPublicacion(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    @Override
    public void mostrarMultimedia() {
        System.out.println("Se reproduce el video");
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Autor: " + this.autor.nombre + "\n" + "Video: " + this.urlVideo);   
    }
    
    @Override
    public void reaccionar(String reaccion) {
        this.reacciones++;
        System.out.println("Reaccion añadida: " + reaccion);
    }

    public int getReacciones() {
        return reacciones;
    }
    
    
    
}
