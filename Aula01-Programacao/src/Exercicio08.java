import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

            System.out.println("Você é Idoso(a), Gestante ou PCD? ");
            System.out.println(" Digite 1 para SIM ou 2 para NÃO: ");

            int opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.println("Você tem direito a fila prioritária! ");
            } else {
                System.out.println("Você não tem direito a fila prioritária! ");
            }

        }

    }
