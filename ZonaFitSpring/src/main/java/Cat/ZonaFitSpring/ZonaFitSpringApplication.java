package Cat.ZonaFitSpring;

import Cat.ZonaFitSpring.Modelo.Cliente;
import Cat.ZonaFitSpring.Servicio.IClienteServicio;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZonaFitSpringApplication implements CommandLineRunner{

    @Autowired
    private IClienteServicio clienteServicio;
    
    private static final Logger logger = LoggerFactory.getLogger(ZonaFitSpringApplication.class);
    
	public static void main(String[] args) {
            logger.info("Iniciando la aplicación");
            
            SpringApplication.run(ZonaFitSpringApplication.class, args);
            logger.info("Aplicación finalizada");
	}

    @Override
    public void run(String... args) throws Exception {
        logger.info("***Aplicacion Gym***");
        aplicacionBase();
    }
    public void aplicacionBase() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la app de ZonaFit");
        boolean salir = false;
        while (!salir) {
            logger.info("Que desea hacer?");
            logger.info("---------------------------------------------");
            logger.info("1. Listar los clientes");
            logger.info("2. Agregar cliente");
            logger.info("3. Modificar cliente");
            logger.info("4. Eliminar cliente");
            logger.info("5. Salir de la app");
            logger.info("---------------------------------------------");
            int option = 0;
            try {
                option = Integer.parseInt(sc.nextLine());
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduzca un número válido");
            }
            
            
            switch(option) {
                case 1: {
                    List<Cliente> clientes = this.clienteServicio.listarClientes();
                    for (Cliente cli : clientes) {
                        logger.info(cli.toString());
                    }
                    break;
                }
                case 2: {
                    try {
                        logger.info("Introduzca el nombre del cliente");
                        String nombre = sc.nextLine();
                        logger.info("Introduzca el apellido del cliente");
                        String apellido = sc.nextLine();
                        logger.info("Intoduzca el numero de mebresia");
                        Integer membresia = Integer.valueOf(sc.nextLine());
                        Cliente nuevo = new Cliente();
                        nuevo.setApellido(apellido);
                        nuevo.setNombre(nombre);
                        nuevo.setMembresia(membresia);
                        this.clienteServicio.guardarCliente(nuevo);
                    } catch (NumberFormatException e) {
                        System.out.println("Error con los datos, vuelva a intentarlo: " + e);
                    } break;
                }
                case 3: {
                    try {
                        System.out.println("Introduzca la id del cliente a modificar");
                        Integer id = Integer.valueOf(sc.nextLine());
                        System.out.println("Introduzca el nuevo nombre del cliente");
                        String nombre = sc.nextLine();
                        System.out.println("Introduzca el nuevo apellido del cliente");
                        String apellido = sc.nextLine();
                        System.out.println("Intoduzca el nuevo numero de mebresia");
                        Integer membresia = Integer.valueOf(sc.nextLine());
                        Cliente mod = new Cliente();
                        mod.setId(id);
                        mod.setApellido(apellido);
                        mod.setNombre(nombre);
                        mod.setMembresia(membresia);
                        this.clienteServicio.guardarCliente(mod);
                    } catch (NumberFormatException e) {
                        System.out.println("Error con los datos, vuelva a intentarlo");
                    } break;
                }
                case 4: {
                    try {
                        System.out.println("Introduzca la id del cliente a eliminar");
                        Integer id = Integer.valueOf(sc.nextLine());
                        Cliente elim = new Cliente();
                        elim.setId(id);
                        System.out.println("Estas seguro de que quieres eliminar al cliente: 1. Si - 2. No");
                        System.out.println(this.clienteServicio.buscarClientePorId(id));
                        int resp = Integer.parseInt(sc.nextLine());
                        if (resp == 1) {
                            this.clienteServicio.eliminarCliente(elim);
                        } else if (resp == 2) {
                            break;
                        } else {
                            System.out.println("Número invalido, vuelva a intentarlo con 1 para 'Si' o 2 para 'No'");
                        }
                    } catch(NumberFormatException e) {
                        System.out.println("Error al eliminar: " + e);
                    } break;
                }
                case 5: {
                    salir = true;
                    break;
                }
            }
        }
    }

}
