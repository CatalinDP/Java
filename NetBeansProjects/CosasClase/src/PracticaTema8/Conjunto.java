/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema8;

import java.util.Arrays;

/**
 *
 * @author DPCat
 */
public class Conjunto extends Lista{

    public Conjunto() {
        super();
    }
    
    @Override
    void insertarPrincipio(Integer nuevo) {
        if (listaLLena()) {//Si el array está lleno, aumentamos en 10 su tamaño
            tabla = Arrays.copyOf(tabla, tabla.length + 10);
        }
        if (buscar(nuevo) == -1) {
            for (int i = numeroElementos; i >= 1; i--) {
                tabla[i] = tabla[i - 1];
            }
            this.tabla[0] = nuevo;
            numeroElementos++;
        }    
    }
    
    @Override
    void insertarFinal(Integer nuevo) {
        if (listaLLena()) {
            tabla = Arrays.copyOf(tabla, tabla.length + 10);
        }
        if (buscar(nuevo) == -1) {
            tabla[numeroElementos] = nuevo;
            numeroElementos++;
        }
    }
    
    void insertarFinal(Lista otraLista) {
        //Aumentamos la capacidad hasta que quepan los elementos de las dos
        //listas
        while (numeroElementos + otraLista.numeroElementos > tabla.length) {
            tabla = Arrays.copyOf(tabla, tabla.length + 10);
        }
        for (int i = numeroElementos, j = 0; j < otraLista.numeroElementos; i++, j++) {
            if (buscar(otraLista.tabla[j]) == -1) {
                tabla[i] = otraLista.tabla[j];
                numeroElementos++;
            } else {
                System.out.println("repe");
            }  
        }
    }
    
    @Override
    boolean insertar(int posicion, Integer nuevo) {
        boolean insertado = true;
        if (posicion < 0 || posicion > numeroElementos) {//índice no válido
            insertado = false;
        } else {
            if (listaLLena()) {
                tabla = Arrays.copyOf(tabla, tabla.length + 10);
            }
            if (buscar(nuevo) == -1) {
                for (int i = numeroElementos; i > posicion; i--) {
                    tabla[i] = tabla[i - 1];
                }
                tabla[posicion] = nuevo;
                numeroElementos++;
            }
        }
        return insertado;
    }
    
    @Override
    public boolean equals(Object otra) {
        boolean igual = false;
        int indices[] = new int[0];
        int ind = 0;
        Conjunto con = (Conjunto) otra;
        
        for (int i = 0; i < this.numeroElementos; i++) {
            for (int j = 0; j < con.numeroElementos; j++) {
                boolean esta = true; 
                if (con.tabla[j] == this.tabla[i]) {
                    esta = false;
                }
                if (!esta) {
                    indices = Arrays.copyOf(indices, indices.length+1);
                    indices[indices.length-1] = con.tabla[j];
                    ind++;
                    System.out.println(Arrays.toString(indices));
                }
            }
        }
        if (indices.length == this.numeroElementos) {
            igual = true;
        }
        return igual;
    }
}
