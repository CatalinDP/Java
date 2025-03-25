/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemycurso.Cadenas;

/**
 *
 * @author DPCat
 */
public class ConcatenaciónStr {
    public static void main(String[] args) {
        //Formas de concatenar cadenas en java
        String str1 = "hola";
        String str2 = "mundo";
        //El +, la forma clasica
        System.out.println(str1 + str2);
        
        //metodo concat
        String str3 = str1.concat(" ").concat(str2);
        System.out.println(str3);
        
        //StringBuilder
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(str1);
        strBuilder.append(" ");
        strBuilder.append(str2);
        //Tambien se podría hacer en una linea
        System.out.println("STR B " + strBuilder);
        
        //StringBuffer
        StringBuffer strBuff = new StringBuffer();
        strBuff.append(str1).append(" ").append(str2);
        System.out.println("strBuff " + strBuff);
        
        //Join -> El primer valor es el delimitador. Si pongo un espacio, entre cada cadena, habrá un espacio
        str1 = String.join("  ",str1, str2);
        System.out.println("Join: " + str1);
        
    }
}
