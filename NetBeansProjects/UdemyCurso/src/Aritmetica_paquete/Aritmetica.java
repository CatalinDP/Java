/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aritmetica_paquete;

/**
 *
 * @author DPCat
 */
public class Aritmetica {
    private int operando1;
    private int operando2; 
    
    //Un constructor solo tiene un modificador, por ejemplo, public
        public Aritmetica(int operando1, int operando2) {
            System.out.println("Ejecutando constructor");
            this.operando1 = operando1;
            this.operando2 = operando2;
        }
    //Los constructores se ejecutan cuando se crea un objeto
    
    //Constructor vacio
    public Aritmetica() {
        
    }
        
    
    public void sumar() {
        int result = this.operando1 + this.operando2;
        System.out.println(result);
    }
    
    public void restar() {
        int result = operando1 - operando2;
        System.out.println(result);
    }
    
    static void hola() {
        System.out.println("Hola bebes");
    }
    
    public int getOperando1() {
        return this.operando1;
    }
    
    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }
    
    public int getOperando2() {
        return this.operando2;
    }
    
    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }
    
    public static void main(String[] args) {
        Aritmetica mate = new Aritmetica();
        mate.operando1 = 10;
        mate.operando2 = 6;
        mate.restar();
        mate.sumar();
        
        //Para añadir los valores entre los parentesis, hay que mandarle los parametros al constructor de arriba
        Aritmetica mate2 = new Aritmetica(5, 7);
        System.out.println("Suma :");
        mate2.sumar();
        
        //Constructor vacio
        Aritmetica mate3 = new Aritmetica(3, 5); //Hay que inicializar los valores como en el primer ejemplo
        mate3.sumar();
        mate3.restar();
        //Operador this: Es buena práctica usarlo en las variables de clase
        System.out.println("Dirección de memoria de objeto 1 " + mate3);
        //El operador this apunta al objeto que se esta ejecuntando en ese momento
        
        
    }
}
