
package Correos;

/**
 *
 * @author DPCat
 */
public class Paquete extends Envio{
    private String dimensiones;

    public Paquete(String dimensiones, int idEnvio, double peso, Cliente cliente, Empleado empleado) {
        super(idEnvio, peso, cliente, empleado);
        this.dimensiones = dimensiones;
    }
}
