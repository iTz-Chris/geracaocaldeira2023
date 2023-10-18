package Exercicio03;

public class GerenciadorDeImposto {

    private double totalTributos;

    public GerenciadorDeImposto() {
        this.totalTributos = 0.0;
    }

    public void adiciona(Tributavel tributavel) {
        this.totalTributos += tributavel.calculaTributos();
    }

    public double getTotal() {
        return this.totalTributos;

    }


}
