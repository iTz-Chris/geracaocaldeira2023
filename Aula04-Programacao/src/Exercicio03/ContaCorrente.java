package Exercicio03;

public class ContaCorrente implements Tributavel {
    private double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double calculaTributos() {
        return saldo * 0.01;
    }

}
