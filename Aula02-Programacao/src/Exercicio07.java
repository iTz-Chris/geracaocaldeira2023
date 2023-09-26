import java.util.Random;
import java.util.Scanner;

public class Exercicio07 {
    public static void dica(int palpite, int numero, int tentativas) {
        if (palpite > numero) {
            System.out.println("Um pouco menos! ");

        } else {
            if (palpite < numero) {
                System.out.println("Um pouco mais! ");
            } else {
                System.out.println("Parabéns, você acertou! O número era " + numero);
                System.out.println("Você tentou " + tentativas + " vezes antes de acertar!");
            }
        }
    }

    public static void main(String[] args) {
        int palpite = 0,
                sorteado,
                tentativas = 0;

        Scanner entrada = new Scanner(System.in);

        sorteado = 300000;
        System.out.println("Tente adivinhar quantos inimigos irão combater.");

        do {
            System.out.printf("\n\n-----------------------\n");
            System.out.println("Número de tentativas: " + tentativas);

            System.out.print("Qual seu palpite? ");
            palpite = entrada.nextInt();

            tentativas++;

            dica(palpite, sorteado, tentativas);
        } while (palpite != sorteado);
    }
}
