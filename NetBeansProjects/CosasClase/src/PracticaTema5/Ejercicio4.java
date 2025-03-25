/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaTema5;

import java.util.Arrays;
import java.util.Scanner;

/**
Debes desarrollar una aplicación que ayude a gestionar las notas de un centro educativo. Los 
alumnos se organizan en grupos compuestos por 5 personas. Leer las notas (números enteros) 
del primer, segundo y tercer trimestre de un grupo. Debes mostrar al final la nota media del 
grupo en cada trimestre y la media del alumno que se encuentra en una posición dada (que el 
usuario introduce por teclado). Es obligatorio hacer uso de arrays bidimensionales. 
 */
public class Ejercicio4 {
    static void mediaTrimestre(int[][] alumnosNotas) {
        for (int i = 1; i < 4; i++) {
            int mediaTrimestre = 0;
            for (int j = 0; j < 5; j++) {
                mediaTrimestre += alumnosNotas[j][i];
            }
            System.out.println("Media del trimestre " + i + ": " + mediaTrimestre / 5);
        }
    }
    
    static void mediaPorAlumno(int[][] alumnosNotas) {
        boolean verNotas = false;
        while (!verNotas) {
            int alumno = new Scanner(System.in).nextInt();
            switch (alumno) {
                case 1: {
                    System.out.println("La media del alumno " + 1 + " es de " + alumnosNotas[0][4]);
                    break;
                }
                case 2: {
                    System.out.println("La media del alumno " + 2 + " es de " + alumnosNotas[1][4]);
                    break;
                }
                case 3: {
                    System.out.println("La media del alumno " + 3 + " es de " + alumnosNotas[2][4]);
                    break;
                }
                case 4: {
                    System.out.println("La media del alumno " + 4 + " es de " + alumnosNotas[3][4]);
                    break;
                }
                case 5 : {
                    System.out.println("La media del alumno " + 5 + " es de " + alumnosNotas[4][4]);
                    break;
                }
                case -1: {
                    verNotas = true;
                    break;
                }
                default: System.out.println("Alumno no encontrado, introduce otro alumno");
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        int[][] alumnosNotas = new int [5][5];
        for (int i = 0; i < 5; i++) {
            int media = 0;
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    alumnosNotas[i][j] = i;
                } else {
                    System.out.println("Introduce la nota del alumno: " + (i+1) + " del trimestre " + (j));
                    alumnosNotas[i][j] = new Scanner(System.in).nextInt(); 
                }
                if (j >= 1) {
                    media += alumnosNotas[i][j];
                }
            }
            System.out.println(Arrays.deepToString(alumnosNotas));
            alumnosNotas[i][4] = media / 3;
            System.out.println("La media del alumno " + (i+1) + " es: " + alumnosNotas[i][4]); 
        }
        
        mediaTrimestre(alumnosNotas);
        
        System.out.println("Si quieres ver la nota media de cierto alumno, introduce su número. Introduce -1 para salir");   
        mediaPorAlumno(alumnosNotas);
    }
}
