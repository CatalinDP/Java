/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema7;

/**
 *
 * @author DPCat
 */
public class Calendario {
    private int dia;
    private int mes;
    private int anio;
    private int[] meses31Dias = {1, 3, 5, 7, 8, 10, 12};
    private int[] meses30Dias = {4, 6, 9, 11};
    
    
    
    public Calendario(int dia, int mes, int anio) {
        switch (mes) {
            case 2: 
                if (dia > 28 || dia < 1) {
                System.out.println("Error, dia mal introducido");
            } else {
                this.dia = dia;
                this.mes = mes;
            }
                break;
            case 1, 3, 5, 7, 8, 10, 12: 
                if (dia > 31 || dia < 1) {
                    System.out.println("Error, dia mal introducido");
                } else {
                    this.dia = dia;
                    this.mes = mes;
                }
            case 4, 6, 9, 11:
                if (dia > 30 || dia < 1) {
                    System.out.println("Error, dia mal introducido");
                } else {
                    this.dia = dia;
                    this.mes = mes;
                }
                break;
            default: System.out.println("Error, mes mal introducido");
        }
        if (anio < 0) {
            System.out.println("Error, año mal introducido");
        } else {
            this.anio = anio;
        }    
    }
    
    public void incrementarDia() {
        this.dia++;
        switch (this.mes) {
            case 2: 
                if (dia > 28) {
                this.dia = 1;
                this.mes++;
                if (mes > 12) {
                    this.mes = 1;
                    this.anio++;
                }
            }
                break;
            case 1, 3, 5, 7, 8, 10, 12: 
                if (dia > 31) {
                    this.dia = 1;
                    this.mes++;
                    if (mes > 12) {
                        this.mes = 1;
                        this.anio++;
                    }
                }
            case 4, 6, 9, 11:
                if (dia > 30) {
                    this.dia = 1;
                    this.mes++;
                    if (mes > 12) {
                        this.mes = 1;
                        this.anio++;
                    }
                }
            default:
        }
    }
    
    public void incrementarMes() {
        this.mes++;
        if (this.mes > 12){
            this.mes = 1;
            this.anio++;
        }
        switch (this.mes) {
            case 2:
                if (this.dia > 28) {
                    incrementarDia();
                }
                break;
            case 4, 6, 9, 11:
                if (this.dia > 30){
                    incrementarDia();
                }
                break;
            case 1, 3, 5, 7, 8, 10, 12:    
                if (this.dia > 31) {
                    incrementarDia();
                }
                break;
            default:
        }  
    }
    
    public void incrementarAnio(int cantidad) {
        if (this.anio < 1) {
            System.out.println("Error");
        } else {
            this.anio += cantidad;
        }
    }
    
    public void mostrar() {
        System.out.println("La fecha es: " + this.dia + "/" + this.mes+ "/" +this.anio);
    }
    
    public boolean iguales(Calendario otraFecha) {
        boolean esIgual = false;
        if (this.dia == otraFecha.dia && this.mes == otraFecha.mes && this.anio == otraFecha.anio) {
            esIgual = true;
        }
        return esIgual;
    }
}
