package Excepciones;

/**
 *
 * @author DPCat
 */
public class MainEdadNegativa {
    public static void main(String[] args) {
        
        try {
            
           int edad = -5;
           if (edad < 0) {
                throw new ExcepcionEdadNegativa("EdadNegativa");
           }
            System.out.println("La edad es: " + edad);
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}
