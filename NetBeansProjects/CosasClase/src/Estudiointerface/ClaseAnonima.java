/*

 */
package Estudiointerface;

/**
 *
 * @author DPCat
 */
public class ClaseAnonima {
    public static void main(String[] args) {
        String prueba = "asdsadas";
        Cola cola = new Cola() {
            @Override
            public void contar() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            } 
            @Override
            public void cuantoMide(String a) {               
                System.out.println("A mide. " + a.length());    
            } 
        };
        cola.cuantoMide(prueba);
        cola.contar();
    }
}
