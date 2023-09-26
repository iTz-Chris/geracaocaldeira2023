import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int celsius;

        System.out.println("Informe a temperatura em graus Celsius: ");
        celsius = entrada.nextInt();
        int conversao = (celsius * 9/5) + 32;
        System.out.println("A temperatura em graus Fahrenheit é: " + conversao);


    }

}


