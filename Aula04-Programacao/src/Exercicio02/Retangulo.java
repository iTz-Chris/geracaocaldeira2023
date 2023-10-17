package Exercicio02;

import Exercicio02.FormaGeometrica;

public class Retangulo extends FormaGeometrica {
    private final int base;
    private final int altura;
    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calculaArea() {
        return (base * altura );
    }
}


