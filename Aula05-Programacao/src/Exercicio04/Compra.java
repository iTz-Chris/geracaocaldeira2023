package Exercicio04;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Compra {

    private String nome;
    private String dataValidade;

    public Compra(String nome, String dataValidade) {
        this.nome = nome;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }


}
