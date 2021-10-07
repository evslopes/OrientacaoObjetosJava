package Calculadora;

public class Calculadora {

    private int operando, operador;
    private double resultado;

    public Calculadora() {
    }

    public Calculadora(int operando, int operador) {
        this.operando = operando;
        this.operador = operador;
    }

    public int getOperando() {
        return operando;
    }

    public void setOperando(int operando) {
        this.operando = operando;
    }

    public int getOperador() {
        return operador;
    }

    public void setOperador(int operador) {
        this.operador = operador;
    }

    public double getResultado() {
        return resultado;
    }

    public void soma(){
        resultado = operador + operando;
    }

    public double soma(int opr, int ope){
        return opr + ope;
    }

    public void subtracao(){
        resultado = operador - operando;
    }

    public double subtracao(int opr, int ope){
        return opr - ope;
    }

    public void multiplicacao(){
        resultado = operador * operando;
    }

    public double multiplicacao(int opr, int ope){
        return opr * ope;
    }

    public void divisao(){
        resultado = operador / operando;
    }

    public double divisao(int opr, int ope){
        return opr / ope;
    }

    @Override
    public String toString() {
        return "Calculadora {" +
                "operando=" + operando +
                ", operador=" + operador +
                ", resultado=" + resultado +
                '}';
    }
}
