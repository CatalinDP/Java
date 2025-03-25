/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aritmetica_paquete.Prueba_aritmetica;

import Aritmetica_paquete.Aritmetica;

/**
 *
 * @author DPCat
 */
public class prueba_arit {
    public static void main(String[] args) {
        Aritmetica mate = new Aritmetica(5, 6);
        System.out.println("Operando 1: " + mate.getOperando1());
        mate.setOperando1(10);
        System.out.println("Operando 1: " + mate.getOperando1());
        mate.setOperando2(-1);
        System.out.println("Operando 2: "+ mate.getOperando2());
        System.out.println("--------------------------");
        //Para añadir los valores entre los parentesis, hay que mandarle los parametros al constructor de arriba
        Aritmetica mate2 = new Aritmetica(5, 7);
        System.out.println("---------------------------");
        //Constructor vacio
        Aritmetica mate3 = new Aritmetica(3, 5); //Hay que inicializar los valores como en el primer ejemplo
        System.out.println("---------------------------");
        //Operador this: Es buena práctica usarlo en las variables de clase
        System.out.println("Dirección de memoria de objeto 1 " + mate3);
        //El operador this apunta al objeto que se esta ejecuntando en ese momento
        
        
    }
}
