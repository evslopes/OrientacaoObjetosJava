package Calculadora;

public class Main {
    public static void main(String[] args) {


        Calculadora calc2 = new Calculadora();
        Calculadora calc = new Calculadora(10,5);

        calc2.setOperador(10);
        calc2.setOperando(5);

        calc.soma();
        System.out.println("Soma: " + calc.getResultado());
        System.out.println("Soma com sobrecarga: " + calc.soma(1,3));

        calc.subtracao();
        System.out.println("Subtração: " + calc.getResultado());
        System.out.println("Subtração com sobrecarga: " + calc.subtracao(1,3));

        calc.multiplicacao();
        System.out.println("Multiplicação: " + calc.getResultado());
        System.out.println("Multiplicação com sobrecarga: " + calc.multiplicacao(1,3));

        calc.divisao();
        System.out.println("Divisão: " + calc.getResultado());
        System.out.println("Divisão com sobrecarga: " + calc.divisao(1,3));

        System.out.println(calc);

    }
}
