/*

 */
package Correos;

/**
 *
 * @author DPCat
 */
public class Envio {
    private int idEnvio;
    private double peso;
    private Cliente cliente;
    private Empleado empleado;

    public Envio(int idEnvio, double peso, Cliente cliente, Empleado empleado) {
        this.idEnvio = idEnvio;
        this.peso = peso;
        this.cliente = cliente;
        this.empleado = empleado;
    }
    public double calcularCosto() {
        return 1;
    }
}
