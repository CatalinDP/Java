/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemasAvanzados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * 
 */
public class ListasYLambda {
    public static void main(String[] args) {
        List<String> lista1 = new ArrayList<>();
        lista1.add("lunes");
        lista1.add("martes");
        lista1.add("miercoles");
        lista1.add("jueves");
        lista1.add("viernes");
        lista1.add("sabado");
        lista1.add("domingo");
        
//        for(String elemento : lista1) {
//            System.out.println("For each normal: " + elemento);
//        }
//        
//        //Funciones lambda (funcion anonima de un codigo muy compacto)
//        //Tambien conocido como programacion funcional
//        lista1.forEach(elemento -> {
//            System.out.println("Lambda: " + elemento);
//        });
        //Este código todavia se puede simplificar aun más, asi usando las ventaja de las funciones lambda
        
        lista1.forEach(System.out::println);
        
        List<String> nombres = Arrays.asList("Pedro", "Ivan", "Noemi");
        nombres.forEach(System.out::println);
    }
}
