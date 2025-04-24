/*

 */
package Cat.ZonaFitSpring.Servicio;

import Cat.ZonaFitSpring.Modelo.Cliente;
import Cat.ZonaFitSpring.Repository.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //De manera interna los métodos que trabajemos, seran métodos transaccionales
public class ClienteServicio implements IClienteServicio{

    @Autowired
    private ClienteRepository clienteRepository;
    
    @Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = this.clienteRepository.findAll();
        return clientes;
    }

    @Override
    public Cliente buscarClientePorId(Integer id) {
        Cliente cliente = this.clienteRepository.findById(id).orElse(null); //?
        return cliente;
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        this.clienteRepository.save(cliente);
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        this.clienteRepository.delete(cliente);
    }
    
}
