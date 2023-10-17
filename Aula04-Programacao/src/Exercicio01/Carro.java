package Exercicio01;

import Exercicio01.Veiculo;

public class Carro extends Veiculo {
    private double distancia;

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    public void setDistancia(double distancia) { distancia = distancia;}

    @Override
    public double CalculaCustoViagem() {
        return distancia * 0.20;
    }
}
