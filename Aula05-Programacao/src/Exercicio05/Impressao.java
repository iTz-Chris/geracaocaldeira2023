package Exercicio05;
public class Impressao {

    private String nome;
    private int numeroPaginas;

    public Impressao(String nome, int numeroPaginas) {
        this.nome = nome;
        this.numeroPaginas = numeroPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Impressão{" +
                "nome='" + nome + '\'' +
                ", número de páginas= " + numeroPaginas +
                '}';

    }

}
