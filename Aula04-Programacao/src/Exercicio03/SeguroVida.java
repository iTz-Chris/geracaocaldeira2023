package Exercicio03;

public class SeguroVida implements Tributavel {

    private double valor;

    public SeguroVida(double valor) {
        this.valor = valor;
    }

    @Override
    public double calculaTributos() {
        return 42.0;
    }

}
