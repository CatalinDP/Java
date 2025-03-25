/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema9.Ejercicio3;

/**
 *
 * @author DPCat
 */
public class Main {
    public static void main(String[] args) {
        Usuario ali = new Usuario("Alice");
        Usuario bob = new Usuario("Bob");
        PublicacionImagen img = new PublicacionImagen("playa.jpg", ali);
        PublicacionVideo vid = new PublicacionVideo("partidoFutbol.wav", bob);
        PublicacionTexto tex = new PublicacionTexto(bob, "Guion");
        ali.agregarPublicacion(img);
        bob.agregarPublicacion(vid);
        bob.agregarPublicacion(tex);
        
        ali.mostrarPublicaciones();
        bob.mostrarPublicaciones();
        
        vid.mostrarMultimedia();
        vid.reaccionar("Reaccion");
        vid.reaccionar("Reaccion");
        System.out.println(vid.getReacciones());
        
        vid.editarPublicacion("PartidoTenis.wav");
        img.editarPublicacion("Castillo.jpg");
        tex.editarPublicacion("Opinion");
        vid.mostrarDetalles();
        tex.mostrarDetalles();
        img.mostrarDetalles();
        
        System.out.println(PublicacionBase.getTotalPublicaciones());
        
    }
}
