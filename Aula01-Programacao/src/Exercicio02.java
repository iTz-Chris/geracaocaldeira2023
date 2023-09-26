import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1;
        int n2;

        System.out.printf("Digite um número: ");
        n1 = ler.nextInt();

        System.out.printf("Digite outro número: ");
        n2 = ler.nextInt();

        System.out.printf("Os números digitados foram: " + n1 +" e " + n2);
    }
}

