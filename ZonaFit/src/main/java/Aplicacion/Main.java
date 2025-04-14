
package Aplicacion;

import Datos.ClienteDAO;
import dominio.Cliente;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void aplicacionBase() {
        ClienteDAO cliente = new ClienteDAO();
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la app de ZonaFit");
        boolean salir = false;
        while (!salir) {
            System.out.println("Que desea hacer?");
            System.out.println("---------------------------------------------");
            System.out.println("1. Listar los clientes");
            System.out.println("2. Agregar cliente");
            System.out.println("3. Modificar cliente");
            System.out.println("4. Eliminar cliente");
            System.out.println("5. Salir de la app");
            System.out.println("---------------------------------------------");
            int option = 0;
            try {
                option = Integer.parseInt(sc.nextLine());
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduzca un número válido");
            }
            
            
            switch(option) {
                case 1: {
                    List<Cliente> clientes = cliente.listarClientes();
                    for (Cliente cli : clientes) {
                        System.out.println(cli);
                    }
                    break;
                }
                case 2: {
                    try {
                        System.out.println("Introduzca el nombre del cliente");
                        String nombre = sc.nextLine();
                        System.out.println("Introduzca el apellido del cliente");
                        String apellido = sc.nextLine();
                        System.out.println("Intoduzca el numero de mebresia");
                        int membresia = Integer.parseInt(sc.nextLine());
                        Cliente nuevo = new Cliente(nombre, apellido, membresia);
                        cliente.agregarCliente(nuevo);
                    } catch (NumberFormatException e) {
                        System.out.println("Error con los datos, vuelva a intentarlo: " + e);
                    } finally {
                        break;
                    }    
                }
                case 3: {
                    try {
                        System.out.println("Introduzca la id del cliente a modificar");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Introduzca el nuevo nombre del cliente");
                        String nombre = sc.nextLine();
                        System.out.println("Introduzca el nuevo apellido del cliente");
                        String apellido = sc.nextLine();
                        System.out.println("Intoduzca el nuevo numero de mebresia");
                        int membresia = Integer.parseInt(sc.nextLine());
                        Cliente mod = new Cliente(id, nombre, apellido, membresia);
                        cliente.modificarCliente(mod);
                    } catch (NumberFormatException e) {
                        System.out.println("Error con los datos, vuelva a intentarlo");
                    } finally {
                        break;
                    }
                }
                case 4: {
                    try {
                        System.out.println("Introduzca la id del cliente a eliminar");
                        int id = Integer.parseInt(sc.nextLine());
                        Cliente elim = new Cliente(id);
                        System.out.println("Estas seguro de que quieres eliminar al cliente: 1. Si - 2. No");
                        cliente.buscarClientePorId(elim);
                        int resp = sc.nextInt();
                        if (resp == 1) {
                            cliente.eliminarCliente(elim);
                        } else if (resp == 2) {
                            break;
                        } else {
                            System.out.println("Número invalido, vuelva a intentarlo con 1 para 'Si' o 2 para 'No'");
                        }
                    } catch(NumberFormatException e) {
                        System.out.println("Error al eliminar: " + e);
                    } finally {
                        break;
                    }
                }
                case 5: {
                    salir = true;
                    break;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        aplicacionBase();
    }
}
