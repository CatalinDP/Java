
package misiniciosenjava;
/*



*/
public class Conversión_tipos {
    public static void main(String[] args) {
        int a = 3; //int = 32 bis
        double x = a; // double = 64 bits
        //x = 3.0;  un tipo pequeño se puede meter en uno grande.
        
        int c = 'a'; //c -> 97 Nos devuelve el UNICODE.
        
        double z = 3.0;
        int v = a; //No se puede debido a que int es menor que double y se pierde información. Solo se guarda la parte entera.
        
        double bc = (double) 3.0;
        int bb = (int) 2.16; //Solo se queda el dos al no almacenar decimales con "int".
        
    }
  
}
