package Exercicio01;

import Exercicio01.Veiculo;

public class Moto extends Veiculo {
    private double distancia;

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    public void setDistancia(double distancia) { distancia = distancia;}

    @Override
    public double CalculaCustoViagem() {
        return distancia * 0.15;
    }
}

