import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int raio;
        double diametro;
        double circunferencia;
        double area;

        System.out.print("Digite o valor do raio: ");
        raio = leitura.nextInt();

        System.out.printf("Diâmetro: %d\n" , (2 * raio));
        System.out.printf("Circunferência: %.2f\n" , (2 * Math.PI));
        System.out.printf("Área: %f\n" , Math.pow(Math.PI, 2));



    }
}
