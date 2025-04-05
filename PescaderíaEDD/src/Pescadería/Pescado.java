/*

 */
package Pescadería;

/**
 *
 * @author DPCat
 */
public class Pescado {
    private String nombre;
    private float precioPorKilo;
    private float peso;

    public Pescado(String nombre, float precioPorKilo, float peso) {
        this.nombre = nombre;
        this.precioPorKilo = precioPorKilo;
        this.peso = peso;
    }
    
    public float calcularPrecio(){
        return 1;
    }
}
