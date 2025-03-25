/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MáquinaDeSnacks;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author DPCat
 */
public class Snack {
    private static int contadorSnacks = 0;
    private int idSnack;
    private String nombre;
    private double precio;
    
    public Snack() {
        contadorSnacks++;
        idSnack = Snack.contadorSnacks;
        this.precio = 0;
        this.nombre = "Sin nombre";
    }
    
    
    public Snack(String nombre, double precio){
        contadorSnacks++;
        idSnack = Snack.contadorSnacks;
        this.precio = precio;
        this.nombre = nombre;
    }
    

    public static int getContadorSnacks() {
        return contadorSnacks;
    }

    @Override
    public String toString() {
        return "Snack: " + "id: " + idSnack + ", nombre: " + nombre + ", precio: " + precio + " euros";
    }
   
    public String getNombre() {
        return this.nombre;
    }
    
    public double getPrecio() {
        return this.precio;
    }
    
    public int getId() {
        return this.idSnack;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.idSnack;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Snack other = (Snack) obj;
        if (this.idSnack != other.idSnack) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
}
