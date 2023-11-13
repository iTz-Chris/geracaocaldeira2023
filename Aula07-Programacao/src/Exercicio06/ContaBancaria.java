package Exercicio06;

import Exercicio06.SaldoInsuficienteException;

public class ContaBancaria {
    private double saldo = 500;

    public void saca(double valor) {
        try {
            if (this.saldo > valor) {
                this.saldo -= valor;
                System.out.println("Saque realizado!");

            } else {
                throw new SaldoInsuficienteException("Saldo insuficiente!");
            }
        } catch (SaldoInsuficienteException e) {
            System.err.println("ERRO!\n " + e);
        }
    }
}
