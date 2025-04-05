package Excepciones;

//Excepciones comprobadas--> Aquellas que necesitan ser tratadas obligatoriamente.
        //Excepciones no comprabas--> Devuelven RunTime Exception y no tenemos que capturarlas, sino arreglar el c�digo,
        //excepto con ArithmeticException.
        //ArrayStoreException--> Guardar un tipo diferente en el array
        //IllegalArgumentException--> Si no cumplo los parametros de un m�todo
        //ArithmeticException--> Dividir / 0
        //IndexOutBoundsException--> Pasarse del tama�o del array
        //NullPointerException--> Cuando intentas acceder a algo de un objeto null
        //NegativeArraySzeException--> El nombre lo dice

public class Excepciones {
    //trhows indica que puede lanzar la excepci�n y que si no se ha hecho el tryCatch en el m�todo, 
    //habr� que hacerlo donde se llame
    public static void excep() throws ArithmeticException{ 
        //En el bloque try ponemos todas las instrucciones que puede generar una instrucci�n
        try {
            int result = 5 / 0;
            String cadena = null;
            cadena.charAt(3);
            System.out.println(result);
        //En el caso de que ocurra la excepci�n indiada en el try, se ejecutar� el catch
        } catch (ArithmeticException | IndexOutOfBoundsException e) { //Si uso solo "Exception e" recojo todas las excepciones.
            //Esto lo puedo hacer gracias a que todas ellas heredan de la clase exception
            //Con un "|" puedo guardar m�s de una excepci�n en el mismo bloque catch
            System.err.println("ERROR-> " + e);
        } catch(NullPointerException e) {//Los catch se van comprobando de arriba hacia abajo
            System.err.println("NullP--> " + e);
        } finally { //Las instrucciones del finally siempre se ejecutan, independientemente de que haya una excepci�n no controlada
            System.out.println("Finalmente");
        }
    }
    public static void main(String[] args) {
        
        excep();
        
    }
}
