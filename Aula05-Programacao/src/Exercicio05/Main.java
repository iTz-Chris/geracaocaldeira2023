package Exercicio05;

public class Main {
    public static void main(String [] args) {

        FilaImpressao filaImpressao = new FilaImpressao();

        //Adicionando docs para a fila de impressão:
        filaImpressao.addDocumento(new Impressao("Documento 1 - Trabalho Programação", 30));
        filaImpressao.addDocumento(new Impressao("Documento 2 - Trabalho Faculdade", 50));
        filaImpressao.addDocumento(new Impressao("Documento 3 - Livro", 120));

        filaImpressao.imprimeTodosDocumentos();

    }

}
