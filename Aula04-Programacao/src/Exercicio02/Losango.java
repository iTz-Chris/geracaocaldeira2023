package Exercicio02;

import Exercicio02.FormaGeometrica;

public class Losango extends FormaGeometrica {
    private final int diagonal1;
    private final int diagonal2;
    public Losango(int diagonal1, int diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }
    @Override
    public double calculaArea() {
        return (diagonal1 * diagonal2 ) / 2;
    }
}

