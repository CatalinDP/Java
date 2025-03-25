/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author DPCat
 */
public class Aritmetica {
    public static int division(int num1, int num2){
        if (num2 == 0) {
            throw new RuntimeException("División entre cero");
        }
        return num1 / num2;
    }
}
