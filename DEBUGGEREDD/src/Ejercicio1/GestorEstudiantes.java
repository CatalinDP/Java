package com.mycompany.debug;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorEstudiantes {

    private List<Estudiante> listaEstudiantes;
    private Map<String, Estudiante> indicePorId;  
    private int contadorOperaciones;
    private double notaMaximaRegistrada;

    // Constructor principal
    public GestorEstudiantes() {
        this.listaEstudiantes = new ArrayList<>();
        this.notaMaximaRegistrada = 0.0;
        this.contadorOperaciones = 0;
    }

    /**
     * Agrega un estudiante a la lista y realiza un conteo de operaciones.
     * @param nombre nombre del estudiante
     * @param edad edad del estudiante
     * @param nota nota inicial del estudiante
     */
    public void agregarEstudiante(String nombre, int edad, double nota) {
        // Aumentamos el contador por cada operación que afecte la lista
        contadorOperaciones++;

        // Creamos un nuevo Estudiante y lo agregamos
        Estudiante nuevo = new Estudiante(nombre, edad, nota);
        listaEstudiantes.add(nuevo);

        // Actualizamos la nota máxima registrada
        if (nota > notaMaximaRegistrada) {
            notaMaximaRegistrada = nota;
        }

        // Cada vez que se agregan suficientes estudiantes u operaciones,
        // intentamos inicializar el índice
        inicializarIndice();
    }

    /**
     * Inicializa el mapa 'indicePorId' solo cuando
     * el contador de operaciones supera un umbral.
     */
    private void inicializarIndice() {
        if (contadorOperaciones > 1) {
            // Si ya existe o se superó el umbral, se inicializa (o reinicializa).
            if (indicePorId == null) {
                indicePorId = new HashMap<>();
            }
            // Rellenamos el mapa con las entradas actuales
            for (Estudiante e : listaEstudiantes) {
                indicePorId.put(e.getNombre(), e);
            }
        }
    }

    
    public void actualizarNota(String nombre, double nuevaNota) {
       
        Estudiante estudiante = indicePorId.get(nombre);

        if (estudiante != null) {
            estudiante.setNota(nuevaNota);
            if (nuevaNota > notaMaximaRegistrada) {
                notaMaximaRegistrada = nuevaNota;
            }
        }
    }

    
    public Estudiante obtenerEstudianteConMejorNota() {
        if (listaEstudiantes.isEmpty()) {
            return null;
        }
        Estudiante mejor = listaEstudiantes.get(0);
        for (Estudiante e : listaEstudiantes) {
            if (e.getNota() > mejor.getNota()) {
                mejor = e;
            }
        }
        return mejor;
    }

    /**
     * Imprime un informe rápido de los estudiantes y la nota máxima.
     */
    public void imprimirInforme() {
        System.out.println("===== INFORME DE ESTUDIANTES =====");
        System.out.println("Nota máxima registrada: " + notaMaximaRegistrada);
        System.out.println("Número de estudiantes: " + listaEstudiantes.size());
        System.out.println("--- Listado ---");
        for (Estudiante e : listaEstudiantes) {
            System.out.println(" * " + e);
        }
        System.out.println("===================================");
    }

    
    public void buscarEstudiantePorNombre(String nombre) {
 
        Estudiante resultado = indicePorId.get(nombre);
        if (resultado != null) {
            System.out.println("Estudiante encontrado: " + resultado);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    // Clase interna Estudiante
    private static class Estudiante {
        private String nombre;
        private int    edad;
        private double nota;

        public Estudiante(String nombre, int edad, double nota) {
            this.nombre = nombre;
            this.edad = edad;
            this.nota = nota;
        }

        public String getNombre() {
            return nombre;
        }

        public double getNota() {
            return nota;
        }

        public void setNota(double nota) {
            this.nota = nota;
        }

        @Override
        public String toString() {
            return "[Nombre: " + nombre + ", Edad: " + edad + ", Nota: " + nota + "]";
        }
    }

    // Método main
    public static void main(String[] args) {
        GestorEstudiantes gestor = new GestorEstudiantes();

        gestor.agregarEstudiante("Ana", 20, 8.5);
        gestor.agregarEstudiante("Pedro", 21, 7.2);
        gestor.agregarEstudiante("Lucía", 22, 9.0);

        gestor.buscarEstudiantePorNombre("Lucía");

    
    }
}