package calculadora;
import java.math.*;

public class Calculadora {
    private long valor1;
    private long valor2;
    private char operador;
    private long result;

    public Calculadora() {
    }

    public long getValor1() { return valor1; }
    public void setValor1(long valor1) { this.valor1 = valor1; }
    public long getValor2() { return valor2; }
    public void setValor2(long valor2) { this.valor2 = valor2; }
    public char getOperador() {return operador; }
    public void setOperador(char operador) { this.operador = operador; }
    public long getResult() { return result; }
    public void setResult(long result) { this.result = result; }
    
    public void funcional(long valor1, long valor2, char op) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.operador = op;
    
        switch(this.operador) {
            case '-': this.result = this.valor1 - this.valor2; break;
            case '+': this.result = this.valor1 + this.valor2; break;
            case '/': try {
                this.result = this.valor1 / this.valor2;
            } catch(Exception e) {
                System.out.println("Syntax error " + e);
            }   
                break;
            case '*': this.result = this.valor1 * this.valor2; break;
            default: System.out.println("Operador no coincidente"); break;
        }
    }
    
    public void resultado() {
        System.out.println(this.result);
    }
}
