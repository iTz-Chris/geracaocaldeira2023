import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double cotacaoDolar;
        double valorDolar;
        double valorReal;

        System.out.println("Informe a cotação atual do Dólar Americano: ");
        cotacaoDolar = entrada.nextDouble();

        System.out.println("Informe o valor em Dólar Americano: ");
        valorDolar = entrada.nextDouble();

        valorReal = cotacaoDolar * valorDolar;

        System.out.println("O valor em reais é: " + valorReal);

    }

}
