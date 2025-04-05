/*

 */
package Pescadería;

/**
 *
 * @author DPCat
 */
public class Empleado extends Persona {
    private String puesto;
    private Pescaderia pescaderia;

    public Empleado(String puesto, String nombre, String direccion) {
        super(nombre, direccion);
        this.puesto = puesto;
    }
    
    public void registrarVenta() {
        
    }
}
