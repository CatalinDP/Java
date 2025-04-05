/*

 */
package Correos;

/**
 *
 * @author DPCat
 */
public class Cartero extends Empleado{
    private Vehiculo vehiculo;
    private Carta[] cartas;
    
    public Cartero(String nombre, int idEmpleado, Vehiculo vehiculo, Carta[] cartas) {
        super(nombre, idEmpleado);
        this.vehiculo = vehiculo;
        this.cartas = cartas;
    }
    
    public void entregarEnvio() {
        
    }
}
