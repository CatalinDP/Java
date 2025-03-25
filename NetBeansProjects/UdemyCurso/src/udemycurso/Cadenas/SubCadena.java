/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemycurso.Cadenas;

/**
 *
 * @author DPCat
 */
public class SubCadena {
    public static void main(String[] args) {
        //Subcadenas, parte de una cadena.
        String str1 = "Hola Hola Hola mundo mundo mundo";
        String str2 = "Hola Mundo";
        String substr1 = str1.substring(0, 4);
        System.out.println(substr1);
        String substr2 = str1.substring(5, 10);
        System.out.println(substr2);
        
        //Buscar subcadenas
        //indexOf -> Devuelve el indice de la primera aparicion de la subcadena
        int indice1 = str1.indexOf("Hola");
        System.out.println(indice1);
        //lastIndexOf -> Devuelve el indice de la ultima aparición de la subcadena -> Traducido, devuelve el punto de inicio de la ultima palabra "mundo".
        //Si hay 3, devolvera el punto de la "m" de la 3. 
        int indice2 = str1.lastIndexOf("mundo");
        System.out.println(indice2);
        
        //Reemplazar subcadenas
        String reemplazar = str2.replace("Mundo", "geis");
        System.out.println(reemplazar);
        
        
    }
}
