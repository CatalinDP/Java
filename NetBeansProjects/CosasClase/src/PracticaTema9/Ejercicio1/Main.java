/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema9.Ejercicio1;

import PracticaTema9.Ejercicio2.CompararEdadNombre;
import java.util.Arrays;

/**
 *
 * @author DPCat
 */
public class Main {
    public static void main(String[] args) {
        Futbolista f1 = new Futbolista("1234A", "Manolo", 22, 12);
        Futbolista f2 = new Futbolista("1234B", "Messi", 10, 100);
        Futbolista f3 = new Futbolista("1234C", "Juan", 32, 112);
        Futbolista f4 = new Futbolista("1234D", "Zacarias", 22, 12);
        Futbolista f5 = new Futbolista("1234E", "Paco", 26, 45);
        CompararNombre c1 = new CompararNombre();
        CompararEdad c2 = new CompararEdad();
        CompararEdadNombre c3 = new CompararEdadNombre();
        Futbolista[] furbo =  {f1,f2,f3,f4,f5};
        for (Futbolista f : furbo) {
            Futbolista guardado = null;
            for (int i = 0; i < furbo.length; i++) {
                if (f.compareTo(furbo[i]) < 0) {
                    guardado = f;
                }
                if (i == furbo.length -1 && guardado == null) {
                    guardado = f;
                }
            }
            System.out.println("Futbolista: " + guardado);
        }
        System.out.println("------------------------------");
        Arrays.sort(furbo, new CompararNombre());
        Arrays.sort(furbo, new CompararNombre().reversed());
        System.out.println(Arrays.toString(furbo));
        System.out.println("------------------------------");
        Arrays.sort(furbo, c2);
        System.out.println(Arrays.toString(furbo));
        System.out.println("------------------------------");
        Arrays.sort(furbo, c3);
        System.out.println(Arrays.toString(furbo));
    }
}
