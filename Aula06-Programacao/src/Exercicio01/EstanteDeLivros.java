package Exercicio01;
import java.util.Stack;

public class EstanteDeLivros {

    private static class Livro {
        private String titulo;
        private String categoria;

        public Livro(String titulo, String categoria) {
            this.titulo = titulo;
            this.categoria = categoria;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getCategoria() {
            return categoria;
        }

        @Override
        public String toString() {
            return titulo + " (" + categoria + ")";
        }
    }

    public static void main(String[] args) {
        Stack<Livro> estanteLivros = new Stack<>();

        // adicionando livros
        estanteLivros.push(new Livro("Livro 1", "Ficção"));
        estanteLivros.push(new Livro("Livro 2", "Suspense"));
        estanteLivros.push(new Livro("Livro 3", "Drama"));

        // mostrando os elementos
        System.out.println("Estante de livros atual:");
        mostraEstante(estanteLivros);

        // mostrando o livro pela categoria
        System.out.println("Livro por categoria:");
        mostraEstantePorCategoria(estanteLivros, "Drama");

        // Removendo todos livros
        while (!estanteLivros.isEmpty()) {
            estanteLivros.pop();
        }

        System.out.println("Livros removidos. Sua estante está vazia:");
        mostraEstante(estanteLivros);
    }

    private static void mostraEstante(Stack<Livro> estanteLivros) {
        while (!estanteLivros.isEmpty()) {
            System.out.println(estanteLivros.pop());
        }
    }

    private static void mostraEstantePorCategoria(Stack<Livro> estanteLivros, String categoria) {
        Stack<Livro> tempEstante = new Stack<>();

        while (!estanteLivros.isEmpty()) {
            Livro livro = estanteLivros.pop();
            if (livro.getCategoria().equals(categoria)) {
                System.out.println(livro);
            }
            tempEstante.push(livro);
        }

        // Copia os livros para a estante original
        while (!tempEstante.isEmpty()) {
            estanteLivros.push(tempEstante.pop());
        }
    }
}
