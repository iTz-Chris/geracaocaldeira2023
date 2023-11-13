package Exercicio04;

public class Main {
    public static void main(String[] args) {

        CalculaInteiros calculaInteiros = new CalculaInteiros();

        int resultado = calculaInteiros.calcular(10, 5, Operacao.ADICIONA);
        System.out.println("10 + 5 = " + resultado);

        resultado = calculaInteiros.calcular(10, 5, Operacao.SUBTRAI);
        System.out.println("10 - 5 = " + resultado);

        resultado = calculaInteiros.calcular(10, 5, Operacao.MULTIPLICA);
        System.out.println("10 * 5 = " + resultado);

        try {
            resultado = calculaInteiros.calcular(10, 5, Operacao.DIVIDE);
            System.out.println("10 / 5 = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro! Divisão por zero: " + e.getMessage());
        }
    }
}
