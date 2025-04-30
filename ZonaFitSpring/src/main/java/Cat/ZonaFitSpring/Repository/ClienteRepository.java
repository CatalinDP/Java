/*

 */
package Cat.ZonaFitSpring.Repository;

import Cat.ZonaFitSpring.Modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    
}
