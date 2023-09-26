import java.util.Scanner;

    public class Exercicio01 {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            String nome;

            System.out.printf("Digite seu nome: ");
            nome = ler.next();

            System.out.printf("Olá " + nome + "!");
        }
    }

