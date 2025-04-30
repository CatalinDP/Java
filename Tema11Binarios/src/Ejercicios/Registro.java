package Ejercicios;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Registro implements Serializable{
    private double temperatura;
    private LocalDate fecha;
    private LocalTime hora;
    private Registro[] registros;

    public Registro(double temperatura, LocalDate fecha, LocalTime hora) {
        this();
        this.temperatura = temperatura;
        this.fecha = fecha;
        this.hora = hora;  
    }

    public Registro() {
        File arch = new File("src\\Ejercicios\\Archivos\\registros.dat");
        try {
            arch.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (this.registros == null) {
            leerArchivo();
        }
    }
    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "temperatura: " + this.temperatura + "ºc, fecha: " + this.fecha + ", hora: " + this.hora;
    }
    
    private void leerArchivo() {
        try (FileInputStream archivo = new FileInputStream("src\\Ejercicios\\Archivos\\registros.dat");
                ObjectInputStream entrada = new ObjectInputStream(archivo)) { 
            this.registros = (Registro[]) entrada.readObject();
        } catch (EOFException ex) {
            this.registros = new Registro[0];
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Ha habido un error: " + ex);
        }
    }
    
    public void listarRegistros() {
        if (this.registros.length < 1) {
            System.out.println("No hay datos, por favor crea algunos.");
        } else {
            for (Registro r : this.registros) {
                System.out.println(r);
            }
        }
    }
    
    public void addRegistro() {
        System.out.println("Escribe la nueva temperatura");
        double temp = Double.parseDouble(new Scanner(System.in).useLocale(Locale.US).nextLine());
        this.registros = Arrays.copyOf(this.registros, this.registros.length+1);
        this.registros[registros.length-1] = new Registro(temp, LocalDate.now(), LocalTime.now());
        try (FileOutputStream archivo = new FileOutputStream("src\\Ejercicios\\Archivos\\registros.dat");
                ObjectOutputStream salida = new ObjectOutputStream(archivo)) { 
            salida.writeObject(this.registros);
        } catch (IOException ex) {
            System.out.println("Ha habido un error: " + ex);
        }
    }
           
}
