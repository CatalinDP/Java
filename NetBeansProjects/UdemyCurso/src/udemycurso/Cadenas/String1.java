/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemycurso.Cadenas;

/**
 *
 * @author DPCat
 */
public class String1 {

    public static void main(String[] args) {
        String str = "hola patata";
        String str2 = "HOla patata";

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        char chr = str.charAt(2);
        System.out.println(chr);
        //Comparación de cadenas
        boolean sonIgu = str == str2;
        System.out.println(sonIgu);
        //Para comparar se usará el método equals
        System.out.println("Son iguales las cadenas: " + str.equals(str2.toLowerCase()));
        
        
        // Métodos de cadenas
        //Obterner largo de una cadena
        int longi = str.length();
        
        //Reemplazar acracteres
        String strNueva = str.replace('o', 'a'); //Reemplaza el primer caracter introducido por el segundo
        System.out.println(strNueva);
        
        //Elminar espacios al inicio y al final de la cadena
        String strSinEspacio = " hola a ";
        System.out.println(strSinEspacio.trim());
    }
}
