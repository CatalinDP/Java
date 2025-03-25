/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventas;

/**
 * id del producto
 * nombre del producto
 * Precio del producto
 */
public class Producto {
    protected double precio;
    protected static int contadorId = 0;
    protected String nombre;
    protected int id;
    
    @Override
    public String toString() {
        return "Tipo: " + this.nombre +", precio: "+ this.precio + " euros, ID: " + this.id;
    }
    
    public double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public Producto(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
        Producto.contadorId++;
        this.id = Producto.contadorId;
    }
}


class Camiseta extends Producto{
    public Camiseta(double precio, String nombre) {
       super(precio, nombre); 
    }
}

class Pantalon extends Producto {
    public Pantalon(double precio, String nombre) {
        super(precio, nombre); 
    }
}

class Zapato extends Producto {
    public Zapato(double precio, String nombre) { 
        super(precio, nombre);   
    }
}

class Calcetin extends Producto {
    public Calcetin(double precio, String nombre) { 
        super(precio, nombre); 
    }
}