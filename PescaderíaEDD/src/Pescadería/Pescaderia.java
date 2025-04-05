/*

 */
package Pescadería;

import java.util.List;

/**
 *
 * @author DPCat
 */
public class Pescaderia {
    private String nombre;
    private String direccion;
    private Cliente[] clientes;
    private Empleado[] empleados;
    private List<Pescado> inventario;

    public Pescaderia(String nombre, String direccion, Cliente[] clientes, Empleado[] empleados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.clientes = clientes;
        this.empleados = empleados;
    }

    
    
    public List<Pescado> obtenerInventario() {
        return this.inventario;
    }
}
