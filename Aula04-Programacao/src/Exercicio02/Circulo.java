package Exercicio02;

import Exercicio02.FormaGeometrica;

public class Circulo extends FormaGeometrica {
    private final int raio;
    public Circulo(int raio) {
        this.raio = raio;
    }
    @Override
    public double calculaArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
