package Excepciones;

/**
 *
 * @author DPCat
 */
public class ExcepcionEdadNegativa extends Exception{
    public ExcepcionEdadNegativa(){
        super();
    }  

    public ExcepcionEdadNegativa(String message) {
        super(message);
    }
    
}
