/*

 */
package PracticaTema11.Ejercicio4;

import java.io.Serializable;


public class Empleado implements Serializable{
    private String dni;
    private String nombre;
    private double sueldo;

    public Empleado(String dni, String nombre, double sueldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Empleado() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado-> " + "dni: " + this.dni + ", nombre: " + this.nombre + ", sueldo: " + this.sueldo;
    }

    
}
