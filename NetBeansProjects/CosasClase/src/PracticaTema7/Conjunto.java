/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema7;

import java.util.Arrays;


public class Conjunto {
    Lista lista;
    
    public Conjunto() {
        lista = new Lista();
    }
    
    public int numeroElementos() {
        return this.lista.numeroElementos();
    }
    
    public boolean insertar(Integer n) {
        boolean valido = false;
        int indice = this.lista.buscar(n);
        if (indice == -1) {
            this.lista.insertarFinal(n);
            valido = true;
        } 
        return valido;
    }
    
    public boolean insertar(Conjunto otro) {
        boolean valido = false;
        int i = 0;
            while (i < otro.numeroElementos()) {
                if (insertar(otro.lista.tabla[i])) {
                    valido = true;
                }
                i++;
            }           
        return valido;
    }
    
    public void muestra() {
        System.out.println(Arrays.toString(this.lista.tabla));
    }
    
    public boolean eliminarElemento(Integer n) {
        boolean valido = false;
        int i = 0;
        for (Integer num : this.lista.tabla) {
            if (num == n) {
                this.lista.eliminar(i);
                valido = true;
            }
            i++;
        }        
        return valido;
    }
    
    public boolean eliminarConjunto(Conjunto otro) {
        boolean valido = false;
        int i = 0;
        int j = 0;
        for (; i < this.numeroElementos();) {
            if (this.lista.tabla[i] == otro.lista.tabla[j]) {
                eliminarElemento(this.lista.tabla[i]);
                valido = true;
                j++;
                if (j >= otro.numeroElementos()) {
                    i = this.numeroElementos();
                }
            } else {
                i++;
            }   
        } 
        return valido;
    }
            
    
    boolean pertenece(Integer n) {
        boolean valido = false;
        for (Integer num : this.lista.tabla) {
            if (num == n) {
                valido = true;
            }
        }
        return valido;
    }
    
    public static boolean incluido(Conjunto c1, Conjunto c2) {
        boolean valido = false;
        int contar = 0;
        
        for (Integer n : c1.lista.tabla) {
            for (int j = 0; j < c2.numeroElementos(); j++) {
                if (n == c2.lista.tabla[j]) {
                contar++;
                }
            }
        }
        if (contar == c1.numeroElementos()) {
            valido = true;
        }
        return valido;
    }
    
    public static Conjunto union(Conjunto c1, Conjunto c2) {
        Conjunto nuevoCon = new Conjunto();
        c1.insertar(c2);
        nuevoCon.insertar(c1);
        return nuevoCon;
    }
    
    public static Conjunto interseccion(Conjunto c1, Conjunto c2) {
        Conjunto nuevoCon = new Conjunto();
        for (Integer n1 : c1.lista.tabla) {
            for (Integer n2 : c2.lista.tabla) {
                if (n1 == n2) {
                    nuevoCon.lista.insertarFinal(n1);
                }
            }
        }
        return nuevoCon;
    }
    
    public static Conjunto diferencia(Conjunto c1, Conjunto c2) {
        Conjunto nuevoCon = new Conjunto();
        for (int j = 0; j < c1.numeroElementos(); j++) {
            boolean existe = false;
            for (int i = 0; i < c2.numeroElementos(); i++) {
                if (c1.lista.tabla[j] == c2.lista.tabla[i]) {
                    existe = true;
                }
            }
            if (!existe) {
                nuevoCon.insertar(c1.lista.tabla[j]);
            }
        }
        return nuevoCon;
    }
    
}
