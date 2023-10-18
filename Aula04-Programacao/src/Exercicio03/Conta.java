package Exercicio03;

public abstract class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void saca(double valor) {
        saldo -= valor;
    }

    public void deposita(double valor) {
        saldo += valor;
    }

}
