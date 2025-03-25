/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema9.Ejercicio2;

import java.util.Comparator;
import PracticaTema9.Ejercicio1.*;
public class CompararEdadNombre implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        int result;
        Futbolista ob1 = (Futbolista) o1;
        Futbolista ob2 = (Futbolista) o2;
        result = ob1.edad-(ob2.edad);
        if (result == 0) {
            result = ob1.nombre.compareTo(ob2.nombre);
        }
        return result;
    }
}
