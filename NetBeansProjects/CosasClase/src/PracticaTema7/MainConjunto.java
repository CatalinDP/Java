/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema7;

/**
 *
 * @author DPCat
 */
public class MainConjunto {

    public static void main(String[] args) {
        Conjunto con1 = new Conjunto();
        Conjunto con2 = new Conjunto();
        Conjunto con3 = new Conjunto();
        Conjunto con4 = new Conjunto();
        Conjunto con5 = new Conjunto();
        con1.insertar(3);
        con1.insertar(4);
        con1.insertar(5);
        con2.insertar(5);
        con2.insertar(7);
        con2.insertar(8);
        con3.insertar(12);
        con3.insertar(11);
        con3.insertar(100);
        con4.insertar(100);
        con4.insertar(120);
        con4.insertar(111);
        con5.insertar(120);
        con5.insertar(101);
        con5.insertar(111);
        con5.insertar(100);
        
//        con1.muestra();
//        con2.muestra();
        con1.insertar(con2);
//        con1.muestra();
//        System.out.println(con1.pertenece(9));
//        
//        con1.eliminarConjunto(con2);
//        con1.muestra();

        con1.muestra();
        System.out.println(Conjunto.incluido(con3, con4));

//        con3.muestra();
//        con4.muestra();
//        con4.insertar(con3);
//        con4.muestra();
//        con4 = Conjunto.union(con3, con4);
        con3.muestra();
//        con5.muestra();
//        con5 = Conjunto.interseccion(con4, con5);
//        con5.muestra();
        con4.muestra();
        con3 = Conjunto.diferencia(con5, con2);
        con3.muestra();
         
        
    }
}
