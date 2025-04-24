/*

 */
package Cat.ZonaFitSpring.Servicio;

import Cat.ZonaFitSpring.Modelo.Cliente;
import java.util.List;

/**
 *
 * @author DPCat
 */
public interface IClienteServicio {
    public List<Cliente> listarClientes();
    
    public Cliente buscarClientePorId(Integer id);
    
    public void guardarCliente(Cliente cliente);
    
    public void eliminarCliente(Cliente cliente);
}
