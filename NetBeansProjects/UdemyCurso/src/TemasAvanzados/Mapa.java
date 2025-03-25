/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemasAvanzados;

import java.util.HashMap;
import java.util.Map;

/**
 * No permite duplicados
 */
public class Mapa {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();   
        persona.put("Nombre", "Diego");
        persona.put("Apellido", "Flores");
        persona.put("Edad", "31");
        System.out.println("Valores del mapa o diccionario: ");
        persona.entrySet().forEach(System.out::println);
        persona.put("Edad", "35");
        //Se puede sobreescribir el valor existente
        System.out.println("Valores nuevos del mapa o diccionario: ");
        persona.entrySet().forEach(System.out::println);
        
        persona.remove("Apellido");
        System.out.println("Valores 3 del mapa o diccionario: ");
        persona.entrySet().forEach(System.out::println);
        
        //iterar sobre los elementos del mapa por separado
        System.out.println("Iterando cada elementos (llave, valor)");
        persona.forEach((llave, valor) -> {
            System.out.println("Llave: " + llave + ", Valor: "  + valor);
        });
    }
}
