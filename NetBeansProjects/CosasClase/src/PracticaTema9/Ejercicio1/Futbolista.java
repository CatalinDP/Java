package PracticaTema9.Ejercicio1;

/**
 *
 * @author DPCat
 */
public class Futbolista implements Comparable{
    public String dni;
    public String nombre;
    public int edad;
    public int numGoles;

    public Futbolista(String dni, String nombre, int edad, int numGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numGoles = numGoles;
    }

    @Override
    public String toString() {
        return "Futbolista: " + "dni: " + this.dni + ", nombre: " + this.nombre + ", edad: " + this.edad + ", numGoles: " + this.numGoles;
    }

    @Override
    public boolean equals(Object obj) {
        boolean esIgual = false;
        Futbolista otroOb = (Futbolista) obj;
        if (this.dni.equals(otroOb.dni)) {
            esIgual = true;
        }
        return esIgual;
    } 
    
    @Override
    public int compareTo(Object o) {
        Futbolista otro = (Futbolista)o;
        return this.dni.compareTo(otro.dni);
    }
}
