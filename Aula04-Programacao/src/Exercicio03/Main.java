package Exercicio03;

public class Main {
    public static void main(String[] args) {

        ContaPoupanca contaPoupanca = new ContaPoupanca(1000.0);
        ContaCorrente contaCorrente = new ContaCorrente(2000.0);
        SeguroVida seguro = new SeguroVida(3000.0);

        GerenciadorDeImposto gerenciador = new GerenciadorDeImposto();
        gerenciador.adiciona(contaPoupanca);
        gerenciador.adiciona(contaCorrente);
        gerenciador.adiciona(seguro);

        System.out.println("Total de tributos: " + gerenciador.getTotal());

    }

}




