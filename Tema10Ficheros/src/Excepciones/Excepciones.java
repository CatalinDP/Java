package Excepciones;

//Excepciones comprobadas--> Aquellas que necesitan ser tratadas obligatoriamente.
        //Excepciones no comprabas--> Devuelven RunTime Exception y no tenemos que capturarlas, sino arreglar el código,
        //excepto con ArithmeticException.
        //ArrayStoreException--> Guardar un tipo diferente en el array
        //IllegalArgumentException--> Si no cumplo los parametros de un método
        //ArithmeticException--> Dividir / 0
        //IndexOutBoundsException--> Pasarse del tamaño del array
        //NullPointerException--> Cuando intentas acceder a algo de un objeto null
        //NegativeArraySzeException--> El nombre lo dice

public class Excepciones {
    //trhows indica que puede lanzar la excepción y que si no se ha hecho el tryCatch en el método, 
    //habrá que hacerlo donde se llame
    public static void excep() throws ArithmeticException{ 
        //En el bloque try ponemos todas las instrucciones que puede generar una instrucción
        try {
            int result = 5 / 0;
            String cadena = null;
            cadena.charAt(3);
            System.out.println(result);
        //En el caso de que ocurra la excepción indiada en el try, se ejecutará el catch
        } catch (ArithmeticException | IndexOutOfBoundsException e) { //Si uso solo "Exception e" recojo todas las excepciones.
            //Esto lo puedo hacer gracias a que todas ellas heredan de la clase exception
            //Con un "|" puedo guardar más de una excepción en el mismo bloque catch
            System.err.println("ERROR-> " + e);
        } catch(NullPointerException e) {//Los catch se van comprobando de arriba hacia abajo
            System.err.println("NullP--> " + e);
        } finally { //Las instrucciones del finally siempre se ejecutan, independientemente de que haya una excepción no controlada
            System.out.println("Finalmente");
        }
    }
    public static void main(String[] args) {
        
        excep();
        
    }
}
