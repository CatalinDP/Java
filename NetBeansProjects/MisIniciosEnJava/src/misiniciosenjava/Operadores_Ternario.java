package misiniciosenjava;

public class Operadores_Ternario {
    public static void main(String[] args) {
        /*
        Expresión condicional ? valor1 : valor 2;
        Java evalua la expresión - Si la expresión es true, devuelve el valor1 - Si es false devuelve valor2   
        */
        int a, b;
        a = 3 < 5 ? 1 : -1;
        b = a == 7 ? 10 : 20;
        System.out.println(a);
        System.out.println(b);
    }
}
