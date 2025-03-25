
package misiniciosenjava;

/* Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen aspectos que influiran en esta decision: 
Si esta lloviendo y si hemos terminado nuestras tareas. 
Solo podremos salir a la cale si no esta lloviendo y hemos finalizado nuestras tareas.
Existe una opcion en la que, indistintamente de lo anterior, podremos salir a la calle:
El hecho de que tengamos que ir a la biblioteca (para realizar algún trabajo, entregar un libro, etc).
Solicitar al usuario (mediante un booleano) si llueve, si ha finalizado las tareas y si necesita ir a la biblioteca. 
El algoritmo debe mostrar mediante un booleano si es posible que se le otorgue el permiso apra ir a la calle
*/

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        boolean lloviendo;
        boolean tarea;
        boolean biblio;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Está lloviendo?");
        lloviendo = sc.nextBoolean();
        
        System.out.println("¿Tienes que ir a la biblioteca?");
        biblio = sc.nextBoolean();
        
        System.out.println("¿Has hecho tu tarea?");
        tarea = sc.nextBoolean();
        
        boolean salir = !lloviendo && tarea || biblio;
        
        System.out.println("¿Puedes salir? \n" + salir);
       
        
    }
}
