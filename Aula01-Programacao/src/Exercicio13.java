import java.util.Scanner;

public class Exercicio13{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int resultadoFatorial = 1;
        StringBuilder multiplicador = new StringBuilder();

        System.out.println("Digite um número para saber seu Fatorial: ");
        int fatorialDoNumero = entrada.nextInt();

        while (fatorialDoNumero < 0) {
            System.out.println("Não é possível calcular o fatorial de números negativos!");
            System.out.println("Digite um número maior ou igual a zero: ");
            fatorialDoNumero = entrada.nextInt();

        }

        for (int i = fatorialDoNumero; i > 1; i--) {
            resultadoFatorial *= i;
            multiplicador.append(i).append(" X ");
        }

        if (fatorialDoNumero == 0) {
            System.out.println(fatorialDoNumero + "! = " + resultadoFatorial);
        }
        else if (fatorialDoNumero == 1) {
            System.out.println(fatorialDoNumero + "! = " + resultadoFatorial);
        }
        else {
            System.out.println(fatorialDoNumero + "! = " + multiplicador + "1 = " + resultadoFatorial);
        }

        entrada.close();

    }

}
