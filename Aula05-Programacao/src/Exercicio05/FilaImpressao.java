package Exercicio05;
import java.util.LinkedList;
public class FilaImpressao {
    private LinkedList<Impressao> fila;

    public FilaImpressao() {
        fila = new LinkedList<>();
    }

    public void addDocumento(Impressao impressao) {
        fila.add(impressao);
    }

    public void imprimeDocumento() {
        if (fila.isEmpty()) {
            System.out.println("A fila de impressão está vazia.");
        } else {
            Impressao impressao = fila.removeFirst();
            System.out.println("Imprimindo documento: " + impressao);
        }
    }

    public void imprimeTodosDocumentos() {
        while (!fila.isEmpty()) {
            imprimeDocumento();

        }

    }

}
