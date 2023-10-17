package Exercicio02;

import Exercicio02.FormaGeometrica;

public class Quadrado extends FormaGeometrica {
    private final int lado;
    public Quadrado(int lado) {
        this.lado = lado;
    }
        @Override
                public double calculaArea() {
            return Math.pow(lado, 2);
        }
    }
