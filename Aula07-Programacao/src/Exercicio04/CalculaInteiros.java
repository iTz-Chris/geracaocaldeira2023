package Exercicio04;
import java.util.InputMismatchException;

public class CalculaInteiros implements Calculavel {

    @Override
    public int adiciona(int a, int b) {
        return a + b;
    }

    @Override
    public int subtrai(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplica(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        return a / b;
    }

    public int calcular(int a, int b, Operacao op) throws ArithmeticException {
        switch (op) {
            case ADICIONA:
                return adiciona(a, b);
            case SUBTRAI:
                return subtrai(a, b);
            case MULTIPLICA:
                return multiplica(a, b);
            case DIVIDE:
                return divide(a, b);
            default:
                throw new ArithmeticException ("Operação inválida: " + op);
        }
    }
}
