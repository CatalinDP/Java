/*

 */
package Estudiointerface;


/**
 *
 * @author DPCat
 */
public class Futbolista2 implements Comparable{
    public String dni;
    public String nombre;
    public int edad;
    public int numGoles;

    public Futbolista2(String dni, String nombre, int edad, int numGoles) {
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
        Futbolista2 otroOb = (Futbolista2) obj;
        if (this.dni.equals(otroOb.dni)) {
            esIgual = true;
        }
        return esIgual;
    } 

    @Override
    public int compareTo(Object o) {
        return this.edad - ((Futbolista2)o).edad;
    }
}
