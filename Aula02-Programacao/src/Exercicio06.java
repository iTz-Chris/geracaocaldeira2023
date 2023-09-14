import java.util.Scanner;

public class Exercicio06 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        String texto;

        System.out.printf("Digite um texto: ");
        texto = ler.nextLine();

        System.out.println(new StringBuilder(texto).reverse().toString());

    }
}
