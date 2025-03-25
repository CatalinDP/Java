/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author DPCat
 */
public class Excepciones {
    
    public static void main(String[] args) {
        int val1 = 10, val2 = 0;
        int result;
        try {
            result = val1 / val2;
        }catch(Exception e) {
            System.out.println("Ha ocurrido un error: " + e);
            result = 0;
        }
        System.out.println("Resultado: " + result);

    }
}
