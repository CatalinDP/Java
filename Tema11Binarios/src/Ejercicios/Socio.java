package Ejercicios;

import java.io.Serializable;

/**
 * Ejercicio 8
 * Implementar un programa que guarde en el fichero socios.dat un array de objetos Socio.
 * Después se abrirá de nuevo el fichero en en modo lectura para recuperar el array de socios,
 * mostrandose por pantalla
 */
public class Socio implements Serializable{
    private int id;
    private String nombre;

    public Socio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "id: " + id + ", nombre: " + nombre;
    }
}
