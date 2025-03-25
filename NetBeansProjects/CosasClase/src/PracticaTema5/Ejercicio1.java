/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema5;

import java.util.Arrays;

/**
Realiza la función: int [] buscarTodos(int t[], int clave), que crea y devuelve un array con todos 
los índices de los elementos donde se encuentra la clave de búsqueda. En el caso de que clave 
no se encuentre en el array t, la función devolverá un array vacío.
 */
public class Ejercicio1 {
    static int[] buscarTodos(int[] t, int clave) {
        int[] arrayIndices = new int[0];
        int j = 0;
        for (int i = 0; i < t.length; i++) {
            
            if (t[i] == clave) {
                arrayIndices = Arrays.copyOf(arrayIndices, arrayIndices.length+1);
                arrayIndices[j] = i;
                j++;
            }
        }
        return arrayIndices;
    }
    
    public static void main(String[] args) {
        int[] t = {6, 2, 3, 5, 5, 5, 7, 8, 5, 6, 3, 2, 7, 8};
        int[] indices = buscarTodos(t, 6);
        System.out.println(Arrays.toString(indices));
        
    }
}
