/*

 */
package PracticaTema11.Ejercicio4;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Lista {
    static Object[] empleados = null;

    public Lista() {
        leerArchivo();
        if (Lista.empleados == null) {
            Lista.empleados = new Empleado[0];
        }
    }
    
    public boolean guardarLista() {
        boolean succes = false;
        try (FileOutputStream archivo = new FileOutputStream("src\\PracticaTema11\\Ejercicio4\\empleados.dat");
                ObjectOutputStream salida = new ObjectOutputStream(archivo))  
        {
            salida.writeObject(Lista.empleados); 
            succes = true;
        } catch (FileNotFoundException ex) {
            System.out.println("Ha habido un error: " + ex);
        } catch (IOException ex) {
            System.out.println("Ha habido un error: " + ex);
        }
        return succes;
    }
    
    public boolean agregarEmpleado(Object empleado) {
        Lista.empleados = Arrays.copyOf(Lista.empleados, Lista.empleados.length+1);
        Lista.empleados[Lista.empleados.length-1] = empleado;
        guardarLista();
        return true;
    }
    
    public boolean leerArchivo() {
        boolean succes = false;
        try (FileInputStream archivo = new FileInputStream("src\\PracticaTema11\\Ejercicio4\\empleados.dat");
                ObjectInputStream entrada = new ObjectInputStream(archivo)) 
        {
            Lista.empleados = (Object[]) entrada.readObject(); 
            succes = true;
        } catch (EOFException ex) {
            System.out.println("No hay datos que leer");
        } catch (FileNotFoundException ex) {
            System.out.println("Ha habido un error leyendo: " + ex);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Ha habido un error leyendo: " + ex);
        } 
        return succes;
    }
    
    public boolean eliminarEmpleado(String dni) {
        boolean succes = false;
        int indice = -1, i = 0;
        while (i < Lista.empleados.length && indice == -1) {
            Empleado empleado = (Empleado)Lista.empleados[i];
            if (empleado.getDni().equals(dni)) {
                indice = i;
            }
            i++;
        }
        if (indice != -1) {
            System.arraycopy(Lista.empleados, indice+1, Lista.empleados, indice, Lista.empleados.length-indice-1);
            Lista.empleados = Arrays.copyOf(Lista.empleados, Lista.empleados.length-1);
            succes = true;
        }
        return succes;
    }
    
    public boolean mostrarDatos(String dni) {
        int i = 0;
        boolean succes = false;
        Empleado empleado = (Empleado) Lista.empleados[i];
        try {
            while (!empleado.getDni().equals(dni) && i < Lista.empleados.length){ 
            i++;
            empleado = (Empleado) Lista.empleados[i];
            } 
            succes = true;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Ha habido un error: " + ex);
        }
        System.out.println(empleado);
        return succes;
    }
    
    public boolean listarEmpleados() {
        for (Empleado empleado : (Empleado[])Lista.empleados) {
            System.out.println(empleado);
        }   
        return true;
    }
}
