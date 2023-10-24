package Exercicio06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SistemaReservasPassagensAviao sistema = new SistemaReservasPassagensAviao();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Reserva de Passagens");
            System.out.println("2 - Cancelar Reserva");
            System.out.println("3 - Exibir Lista de Reservas");
            System.out.println("4 - Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Informe o nome: ");
                    String nome = scanner.next();
                    System.out.println("Informe o local: ");
                    String local = scanner.next();
                    System.out.println("Informe o CPF: ");
                    String CPF = scanner.next();
                    System.out.println("Informe a data de entrada: ");
                    String dataEntrada = scanner.next();
                    System.out.println("Informe a data de saída: ");
                    String dataSaida = scanner.next();

                    sistema.reservaPassagem(nome, local, CPF, dataEntrada, dataSaida);
                    break;

                case 2:
                    System.out.println("Informe o CPF: ");
                    String cpf = scanner.next();

                    sistema.cancelaReserva(cpf);
                    break;

                case 3:
                    sistema.mostraListaReservas();
                    break;

                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }


    }


}
