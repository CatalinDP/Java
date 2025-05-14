package practicaTema10.ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {
        int contLinea = 1, contCar = 1; 

        try(BufferedReader entr1 = new BufferedReader(new FileReader("src\\PracticaTema10\\Ejercicio3\\texto1.txt"));
            BufferedReader entr2 = new BufferedReader(new FileReader("src\\PracticaTema10\\Ejercicio3\\texto2.txt"))) {

            int c1 = entr1.read(); 
            int c2 = entr2.read();

            while (c1 != -1 && c2 != -1 && c1 == c2) { 
                contCar++; 
                if ((char) c1 == '\n') {
                    contLinea++;
                    contCar = 1;  
                }
                c1 = entr1.read();
                c2 = entr2.read();
            }


            if (c1 != c2) { 
                System.out.println("Distinto: ");
                System.out.println("Línea: " + contLinea);
                System.out.println("Caracter: " + contCar);
            } else {
                System.out.println("Los ficheros son iguales.");
            }
        } catch (IOException eof) {
           System.out.println("Error de fichero");
        } 
    }
}
