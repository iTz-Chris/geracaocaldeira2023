import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador;
        String palavra;

        System.out.printf("Digite uma palavra ou frase:\n");
        palavra = entrada.nextLine();

        int conta_a = 0;
        int conta_e = 0;
        int conta_i = 0;
        int conta_o = 0;
        int conta_u = 0;
        int n = palavra.length();

        for (contador=0; contador<n; contador++) {
            if ((palavra.charAt(contador) == 'a') || (palavra.charAt(contador) == 'A'))
                conta_a = conta_a + 1;

            if ((palavra.charAt(contador) == 'e') || (palavra.charAt(contador) == 'E'))
                conta_e = conta_e + 1;

            if ((palavra.charAt(contador) == 'i') || (palavra.charAt(contador) == 'I'))
                conta_i = conta_i + 1;

            if ((palavra.charAt(contador) == 'o') || (palavra.charAt(contador) == 'O'))
            conta_o = conta_o + 1;

            if ((palavra.charAt(contador) == 'u') || (palavra.charAt(contador) == 'U'))
                conta_u = conta_u + 1;
        }

        System.out.printf("\nExistem %d vogais \"A\"" , conta_a);
        System.out.printf("\nExistem %d vogais \"E\"" , conta_e);
        System.out.printf("\nExistem %d vogais \"I\"" , conta_i);
        System.out.printf("\nExistem %d vogais \"O\"" , conta_o);
        System.out.printf("\nExistem %d vogais \"U\"\n" , conta_u);

    }

}
