package Ejercicios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ejercicio8 {
    public static void main(String[] args) {
        Socio socio1 = new Socio(1, "Maria");
        Socio socio2 = new Socio(2, "Manolo");
        Socio socio3 = new Socio(3, "Luis");
        Socio socio4 = new Socio(4, "Jose");
        Socio[] socios = {socio1, socio2, socio3, socio4};
        try (FileOutputStream archivoSal = new FileOutputStream("src\\Ejercicios\\Archivos\\socios.dat");
                ObjectOutputStream salida = new ObjectOutputStream(archivoSal);
                FileInputStream archivoEnt = new FileInputStream("src\\Ejercicios\\Archivos\\socios.dat");
                ObjectInputStream entrada = new ObjectInputStream(archivoEnt)) {
            salida.writeObject(socios);

            Socio[] nuevoArr = (Socio[]) entrada.readObject();
            for (Socio soc : nuevoArr) {
                System.out.println(soc);
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Ha habido un error: " + ex);
        }
    }
}
