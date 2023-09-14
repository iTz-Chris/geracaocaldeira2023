import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade;
        double salario;

        System.out.println("Exercicio 02");

        System.out.printf("Informe a sua idade:");
        idade = ler.nextInt();

        System.out.printf("Informe o seu salário:");
        salario = ler.nextDouble();

        if (idade >= 18 && salario >= 2000) {
            System.out.println("Voce pode comprar um carro!");
        } else
            System.out.println("Voce nao pode comprar um carro!");
    }

}