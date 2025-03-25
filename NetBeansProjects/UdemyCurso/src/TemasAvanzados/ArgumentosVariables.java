/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemasAvanzados;

/**
 *
 * @author DPCat
 */
public class ArgumentosVariables {
    //Sirve para no tener que escribir tantos parametros.   
    //Los tres puntos crean un array del tamaño ed la cantidad de parametros introducidos
    static void imprimirNumeros(int... numeros) { 
        for(int num : numeros){
            System.out.println(num);
        }
    }
    
    public static void main(String[] args) {
        imprimirNumeros(1, 2, 3, 4, 5);
    }
}
