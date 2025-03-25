package misiniciosenjava;


import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAW
 */
public class EntradaDeDatos {
 //Es para utilidades importantes pero no imprescindibles

public static void main(String[] args) {


//Entrada de datos, usamos la class Scanner.
//Necesitamos hacer uso del operador new.
//(System.in); es la parte de lectura del teclado

Scanner sc = new Scanner(System.in);
sc.useLocale(Locale.US); //Para escribir las decimales con puntos en lugar de comas
/*sc.nextint();
sc.nextdouble();
sc.nextLine();
sc.next();
next lee la línea hata que encuentra un tabulador, espacio en blanco o intro.
1) Se usa para la ejecución
2)Recoge lo escrito hasta que hay un intro
3)Devuelve el valor recogido, asigna una variable
4)Dispoible para usar
*/
//System.out.println("Introduce un número decimal");

//double num = sc.nextDouble();

//System.out.println("Has escrito: " + num );

System.out.println("¿Cual es tu nombre?");
String nombre = sc.nextLine();


System.out.println("¿Y cuantos años tienes?");
int edad = sc.nextInt();

System.out.println("Ah, ya veo. Eres " + nombre + " Y tienes " + edad + " años");

int edadFutura = edad + 1;
System.out.println("Tu edad el año que viene sera: " + edadFutura);
   


    }
}
