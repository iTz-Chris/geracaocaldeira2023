import javax.swing.*;

public class Exercicio04 {
    public static void main (String [] args ) {
        String num1 = JOptionPane.showInputDialog(null, "Digite o primeiro número: ");
        String num2 = JOptionPane.showInputDialog(null, "Digite o segundo número: ");

        double a = Double.parseDouble(num1);
        double b = Double.parseDouble(num2);

        double soma = a + b;
        double sub = a - b;
        double mult = a * b;
        double div = a / b;

        JOptionPane.showMessageDialog(null,
                "Soma: " + soma + "\n" +
                "Subtracao:  " + sub + "\n"  +
                        "Multiplicacao: " + mult + "\n" +
                        "Divisao: " + div
        );


    }
}