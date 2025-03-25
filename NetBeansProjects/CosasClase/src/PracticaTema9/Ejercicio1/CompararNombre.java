/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema9.Ejercicio1;

import java.util.Comparator;
public class CompararNombre implements Comparator{
    
    
    
    @Override
    public int compare(Object o1, Object o2) {
        Futbolista ob1 = (Futbolista) o1;
        Futbolista ob2 = (Futbolista) o2;
        return ob1.nombre.compareTo(ob2.nombre);
    }
    
}
