/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udemycurso;

/**
 *
 * @author DPCat
 */
public class matrices1 {

    public static void main(String[] args) {
        int[][] matriz = {
            {100, 200, 300, 300},
            {400, 500, 600, 500},
            {700, 800, 900, 100},
            {300, 100, 100, 500}
        };
        int sumaMatrizDere = 0;
        int sumaMatrizIzqui = 0;
                
        
        for (int i = 0; i < matriz.length; i++) {
            sumaMatrizDere += matriz[i][i];    
        }
        System.out.println("La suma diagonal hacia la derecha de la matriz es de: " + sumaMatrizDere);
        int x = 0;
        for (int i = matriz.length-1; i >= 0; i--) { 
            for (int j = 0; j < 1; j++) {
                System.out.println(matriz[x][i]);
                sumaMatrizIzqui += matriz[x][i];
            }
        x++;
        }
        
        System.out.println("La suma de la matriz en diagonal hacia la izquierda desde el número máximo a la derecha es; "  + sumaMatrizIzqui);
    }
}
