package Exercicio02;

import Exercicio02.*;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
        FormaGeometrica circulo = new Circulo(5);
        FormaGeometrica losango = new Losango(5,6);
        FormaGeometrica quadrado = new Quadrado(2);
        FormaGeometrica retangulo = new Retangulo(3, 4);
        FormaGeometrica triangulo = new Triangulo(9, 9);


        System.out.println("Área do Círculo: " + circulo.calculaArea());
        System.out.println("Área do Losango: " + losango.calculaArea());
        System.out.println("Área do Quadrado: " + quadrado.calculaArea());
        System.out.println("Área do Retângulo: " + retangulo.calculaArea());
        System.out.println("Área do Triângulo: " + triangulo.calculaArea());


    }
}
