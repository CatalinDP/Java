/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemasAvanzados;

import java.util.Set;
import java.util.TreeSet;

/**
 * Sets, tambien conocidos como estructura de datos
 */
public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Carlos");
        conjunto.add("Carlos");
        conjunto.add("Maria");
        conjunto.add("Carla");
       
        
        System.out.println("Elementos del set 1");
        conjunto.forEach(System.out::println);
        conjunto.remove("Carla");
        
        System.out.println("\nElementos del set 2");
        conjunto.forEach(System.out::println);
    }
}
