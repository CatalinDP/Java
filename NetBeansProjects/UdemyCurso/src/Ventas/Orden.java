/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventas;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1 Almacenar productos
 * Calcular total de la orden
 * Mostrar la orden
 */
public class Orden {
    static double[] precio = new double[0];
    static String[] objetosCarrito = new String[0];
   
    static void carrito(Producto producto) {
        precio = Arrays.copyOf(Orden.precio, Orden.precio.length+1);
        Orden.precio[Orden.precio.length-1] = producto.getPrecio();  
        
        Orden.objetosCarrito = Arrays.copyOf(Orden.objetosCarrito, Orden.objetosCarrito.length+1);
        Orden.objetosCarrito[Orden.objetosCarrito.length-1] = producto.getNombre();

    }
    
    static void eliminarDelCarrito(int indice){
        indice -= 1;
        System.out.println("Has eliminado con éxito " + objetosCarrito[indice]);
        Orden.precio[indice] = Orden.precio[Orden.precio.length-1];
        Orden.precio = Arrays.copyOf(precio, Orden.precio.length-1);
        
        Orden.objetosCarrito[indice] = Orden.objetosCarrito[Orden.objetosCarrito.length-1];
        Orden.objetosCarrito = Arrays.copyOf(objetosCarrito, Orden.objetosCarrito.length-1);
    }
    
    static double precioFinal() {
        int precioTotal = 0;
        for (double num : Orden.precio) {
            precioTotal += num;
        }
        return precioTotal;
    }
    
    public static void main(String[] args) {
        Camiseta camiseta =  new Camiseta(12, "Camiseta Nike");
        Pantalon pantalon = new Pantalon(15, "Pantalones Gucci");
        Zapato zapato = new Zapato(12, "Zapatos Puma");
        Calcetin calcetin = new Calcetin(10, "Calcetines Fila");
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        boolean salir2 = false;
        
        System.out.println("Bienvenido a la tienda, que desea comprar");
        
        while (!salir) {
            System.out.println("Información:"
                    + "\n1 -> Camisetas \n2 -> Pantalones \n3 -> Zapatos \n4 -> Calcetines \n5 -> Información del carrito \n6 -> Elimina un objeto del carrito \n7 -> Salir y pagar");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.println("Precio de la camiseta");
                    System.out.println(camiseta.getPrecio());
                    System.out.println("1 para añadir al carrito, o cualquier otro número para volver a la información");
                    opcion = sc.nextInt();
                    if (opcion == 1) {
                        carrito(camiseta);
                    }
                    break;
                } case 2: {
                    System.out.println("Precio del pantalon");
                    System.out.println(pantalon.getPrecio());
                    System.out.println("1 para añadir al carrito, o cualquier otro número para volver a la información");
                    opcion = sc.nextInt();
                    if (opcion == 1) {
                        carrito(pantalon);
                    }
                    break;
                } case 3: {
                    System.out.println("Precio de los zapato");
                    System.out.println(zapato.getPrecio());
                    System.out.println("1 para añadir al carrito, o cualquier otro número para volver a la información");
                    opcion = sc.nextInt();
                    if (opcion == 1) {
                        carrito(zapato);
                    }
                    break;
                } case 4: {
                    System.out.println("Precio del calcetin");
                    System.out.println(calcetin.getPrecio());
                    System.out.println("1 para añadir al carrito, o cualquier otro número para volver a la información");
                    opcion = sc.nextInt();
                    if (opcion == 1) {
                        carrito(calcetin);
                    }
                    break;
                }  case 5: {
                    System.out.println("Información del carrito: " + Arrays.toString(objetosCarrito) + " con un precio de " + precioFinal() + " euros");
                    break;
                } case 6: {
                    System.out.println("Elige objeto a eliminar del carrito por orden númerico");
                    System.out.println(Arrays.toString(objetosCarrito));
                    opcion = sc.nextInt();
                    eliminarDelCarrito(opcion);                 
                    System.out.println(Arrays.toString(objetosCarrito));
                    break;
                } case 7: {
                    salir = true;
                    break;
                }
                default: {
                    System.out.println("Error");
                    break;
                }             
            }
        }
        System.out.println("Precio final =  " + precioFinal() + " euros");
        System.out.println("Has comprado: " + Arrays.toString(objetosCarrito));
    }
}


