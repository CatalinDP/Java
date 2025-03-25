/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MáquinaDeSnacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MaquinaSnacks {
    public static Snacks snack;
    static boolean salir = false;

    public static void maquinaSnack() {
        Scanner sc = new Scanner(System.in);
        List<Snack> ticket = new ArrayList<>();
        int opcion;
        
        while(!salir) {
            try {
                opcion = mostrarMenu(sc);
                ejecutarOpciones(opcion, sc, ticket);
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
            finally {
                System.out.println();
            }
            }
    }
    
    private static int mostrarMenu(Scanner sc) {
        System.out.println("*** Máquina de snacks ***");
        System.out.println("--- Inventario ---");
        Snacks.mostrarSnacks();
        System.out.println("\nMenú: ");
        System.out.println("1. Comprar snack");
        System.out.println("2. mostrar ticket");
        System.out.println("3. Agregar nuevo snack");
        System.out.println("4. salir");
        System.out.println("Elige una opción");
        return sc.nextInt();

    }
    
    
    private static void ejecutarOpciones(int opcion, Scanner sc, List<Snack> ticket) {
        switch (opcion) {
            case 1: {
                Snacks.mostrarSnacks();
                System.out.println("Inserta id del snack");
                comprarSnacks(sc.nextInt(), sc, ticket);
                break;
            }
            case 2: {
                mostrarTicket(ticket);
                break;
            }
            case 3: {
                agregarSnack(sc);
                 break;
            }
            case 4: {
                salir = true;
            }
        
        }
    }

    private static void comprarSnacks(int id, Scanner sc, List<Snack> ticket) {
        if (id <= 0) {
            System.out.println("Error, introduce un id valido");
            id = sc.nextInt();
        }
        for (var cosas : Snacks.getSnacks()) {
            if (id == cosas.getId()) {
                ticket.add(cosas);
            }
        } 
    }
    
    private static void agregarSnack(Scanner sc) {
        sc.nextLine();
        System.out.println("Nombre del snack");
        String nombre = sc.nextLine();
        
        System.out.println("Precio del snack");
        double precio = sc.nextDouble();
        Snacks.agregarSnack(nombre,precio);
    }
    
    private static void mostrarTicket(List<Snack> ticket) {
            System.out.println("*** Tu ticket ***");
            String productos = "";
            double total = 0.0;
            for (Snack producto : ticket) {
                total += producto.getPrecio();
               productos += producto.getNombre() + ", " + producto.getPrecio() + " euros\n";
            }
            System.out.println("Productos:\n" + productos + "\n" + "Total: " +total + " euros");
            
    }
    
    public static void main(String[] args) {
        maquinaSnack();
            
        }
    
    
        
    }
   
