import java.util.Scanner;

public class Exercicio03 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int num1 = Integer.parseInt(entrada.nextLine());

        System.out.print("Informe o segundo número: ");
        int num2 = Integer.parseInt(entrada.nextLine());

        System.out.print("Informe o terceiro número: ");
        int num3 = Integer.parseInt(entrada.nextLine());

        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("O primeiro número é o maior!");
        }

        else if ((num2 > num1) && (num2 > num3)) {
            System.out.println("O segundo número é o maior!");
        }

        else if ((num3 > num1) && (num3 > num2)) {
            System.out.println("O terceiro número é o maior!");
        }

        else {
            System.out.println("Os números não são diferentes");
        }

        int soma = (num1 + num2 + num3);
        float media = soma/3;

        System.out.println("A média é: " + media);








    }
}
