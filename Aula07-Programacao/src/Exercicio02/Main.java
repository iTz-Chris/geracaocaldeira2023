package Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o dia da semana: ");
        String dia = scanner.nextLine();

        DiaDaSemana diaSemana = DiaDaSemana.valueOf(dia);

        switch (diaSemana) {
            case SEGUNDA:
                System.out.println("Ânimo! Boa Segunda!");
                break;
            case TERÇA:
                System.out.println("Tenha uma boa semana!");
                break;
            case QUARTA:
                System.out.println("Boa Quarta-Feira!");
                break;
            case QUINTA:
                System.out.println("TBT!");
                break;
            case SEXTA:
                System.out.println("Sextou!");
                break;
            case SÁBADO:
                System.out.println("Aproveite o findi!");
                break;
            case DOMINGO:
                System.out.println("Descanse e aproveite!");
                break;
            default:
                System.out.println("Dia inválido. Informe somente o dia.");
                break;
        }
    }
}
