package Exercicio03;
import java.util.ArrayList;
import java.util.Date;

public class ListaTarefas {

    private String titulo;
    private Date data;
    private String descricao;

    public ListaTarefas(String titulo, Date data, String descricao) {
        this.titulo = titulo;
        this.data = data;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Data: " + data + ", Descricão: " + descricao;
    }

}
