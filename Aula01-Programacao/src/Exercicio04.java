import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor do salário mínimo: ");
        double salarioMinimo = Double.parseDouble(entrada.nextLine());

        System.out.print("Informe o salário do funcionário: ");
        double salarioFuncionario = Double.parseDouble(entrada.nextLine());

        double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;
        System.out.println("O funcionario recebe " + quantidadeSalariosMinimos + " salários mínimos");
    }
}
