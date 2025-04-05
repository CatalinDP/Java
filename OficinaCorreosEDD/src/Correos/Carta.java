/*

 */
package Correos;

/**
 *
 * @author DPCat
 */
public class Carta extends Envio{
    private String contenido;
    private Cartero cartero;

    public Carta(String contenido, Cartero cartero, int idEnvio, double peso, Cliente cliente, Empleado empleado) {
        super(idEnvio, peso, cliente, empleado);
        this.contenido = contenido;
        this.cartero = cartero;
    }

      
}
