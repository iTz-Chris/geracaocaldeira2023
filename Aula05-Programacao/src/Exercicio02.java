import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String [] args){

        int[] numeros = new int[10];
        Random aleatorio = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(100) + 1;
        }

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();

        boolean presente = false;
        for (int numeroArray : numeros) {
            if (numeroArray == numero) {
                presente = true;
                break;
            }
        }

        if (presente) {
            System.out.println("O número está presente no Array! ");
        } else {
            System.out.println("O número não está presente no Array");

        }

    }

}
