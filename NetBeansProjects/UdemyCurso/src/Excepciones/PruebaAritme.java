/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author DPCat
 */
public class PruebaAritme {
    public static void main(String[] args) {
        try {
            int result = Aritmetica.division(10, 2);
            System.out.println("Resultado: " + result);
        }catch(Exception e) {
            System.out.println("Ocurrio un error " + e);        
        } finally {
            System.out.println("Se reviso la división entre cero");
        }
    }
}    
