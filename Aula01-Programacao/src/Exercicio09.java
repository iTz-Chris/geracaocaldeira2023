import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Calendar calendario = GregorianCalendar.getInstance();
        int anoAtual = calendario.get(Calendar.YEAR);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu ano de nascimento: ");
        int anoNascimento = entrada.nextInt();

        System.out.println("Você tem ou fará " + (anoAtual - anoNascimento) + " anos. ");

    }

}
