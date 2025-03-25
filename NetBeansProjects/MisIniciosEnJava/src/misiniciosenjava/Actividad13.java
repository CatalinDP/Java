/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misiniciosenjava;

/*
Escribir un programa que solicite las notas del primer, segundo y tercer cuatrimestre. (Notas enteras)
y también como se usa en el expediente académico (con decimales)
Media aritmética con decimaes y media aritmética sin decimales.
 */
import java.util.Scanner;
public class Actividad13 {
    public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
    
    int nota1, nota2, nota3, mediaNoD;
    double expedienteA;
    
    System.out.println("¿Qué nota sacaste el primer cuatrimestre?");
        nota1 = sc.nextInt();
    System.out.println("¿Y en el segundo?");
        nota2 = sc.nextInt();
    System.out.println("¿En el tercero?");
        nota3 = sc.nextInt();

    mediaNoD = (int) (nota1 + nota2 + nota3) / 3;
        System.out.println("Tu nota media sin decimales es: " + mediaNoD);
           
    expedienteA = (nota1 + nota2 + nota3) / 3.0;
        System.out.println("Y la nota con decimales es: " + expedienteA);        
    
    
    
    }
}
