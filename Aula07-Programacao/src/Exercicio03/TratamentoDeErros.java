package Exercicio03;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoDeErros {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        try {
            System.out.print("Informe um número inteiro: ");
            num1 = scanner.nextInt();

            System.out.print("Informe outro número inteiro: ");
            num2 = scanner.nextInt();

            System.out.println("Os números informados são: " + num1 + " e " + num2);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor informe um número inteiro.");
        } finally {
            scanner.close();

        }


    }

}
