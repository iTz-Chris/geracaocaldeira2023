import java.util.Scanner;

public class Exercicio01 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner(System.in);

        int [] numeros = new int[5];

        System.out.println("Digite seus 5 números: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextInt();
        }

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        double media = soma / numeros.length;

        System.out.println("A soma dos 5 números é: " + soma);
        System.out.println("A média dos 5 números é: " + media);

    }

}
