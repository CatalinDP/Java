/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calendario;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
/**
 *
 * @author DPCat
 */
public class Calendario {
    private LocalDate fechaActual;
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate[] eventos = new LocalDate[0];
    Dictionary<LocalDate, String> eventosContenido = new Hashtable<>();

    public Calendario() {
        this.fechaActual = LocalDate.now();
    }
    
    public void mostrarFecha() {
        System.out.println("La fecha actual es: " + this.fechaActual);
    }
    
    public void mostrarEdad(String fecha1, String fecha2) {
        LocalDate f1= LocalDate.parse(fecha1, formato);
        LocalDate f2 = LocalDate.parse(fecha2, formato);
        Period edad = Period.between(f1, f2);
        System.out.println("Tienes " + edad.getYears() + " años");
    }
    
    public void mostrarDias(String fecha1, String fecha2) {
        LocalDate f1 = LocalDate.parse(fecha1, formato);
        LocalDate f2 = LocalDate.parse(fecha2, formato);
        long diferenciaDias = ChronoUnit.DAYS.between(f1, f2);
        //diferenciaDias += diferencia.getDays();
        System.out.println("Hay " + diferenciaDias + " días de diferencia");
    }
    
    public void mostrarMes(int mesNum, int diaAnio) {
        LocalDate mes = LocalDate.of(diaAnio, mesNum, 1);
        if (mesNum > 12 || mesNum < 1) {
            System.out.println("Mes no valido, introduce uno correcto");
        } else {
            for (int i = 1; i <= mes.lengthOfMonth(); i++) {
                if (i < 10) {
                    System.out.print(mes.getDayOfMonth() + "  ");
                } else {
                    System.out.print(mes.getDayOfMonth() + " ");
                }
                if (i == 7 || i == 14 || i == 21 || i == 28) {
                    System.out.println("\n");
                }
                for (LocalDate f : this.eventos) {
                    if (mes.equals(f)) {
                    System.out.println("\n\nEvento programado: " + i + " " + this.eventosContenido.get(mes) + "\n");
                    }
                }
                mes = mes.plusDays(1);
            }
        }
    }
    
    public void crearEvento(String fecha, String contenidoEvento) {
        System.out.println("fECHA - " + fecha);
        LocalDate evento = LocalDate.parse(fecha, this.formato);
        this.eventos = Arrays.copyOf(this.eventos, this.eventos.length+1);
        this.eventos[this.eventos.length-1] = evento;
        System.out.println("aaaa " + this.eventos[this.eventos.length-1]);
        this.eventosContenido.put(evento, contenidoEvento);
        System.out.println("Evento añadido el " + this.eventosContenido.get(evento));
    }
    
    
}
