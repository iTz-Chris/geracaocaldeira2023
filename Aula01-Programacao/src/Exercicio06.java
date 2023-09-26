import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        if (idade < 16) {
            System.out.println("Você ainda não pode votar. ");
        } else if (idade == 16 || idade == 17 || idade > 65) {
            System.out.println("Seu voto é facultativo");
        } else {
            System.out.println("Seu voto é obrigatório.");
        }
    }
}







