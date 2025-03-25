/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema7;

/**
 *
 * @author DPCat
 */
public class MainPunto {
    public static void main(String[] args) {
        Punto pun = new Punto(3,4);
        Punto pun2 = new Punto(5,8);
        
        pun.desplaza(5, 10);
        pun.muestra();
        System.out.println(pun.distanciaEuclidea(pun2));
    }
}
