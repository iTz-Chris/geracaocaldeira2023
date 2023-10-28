package Exercicio03;

import java.util.TreeMap;

public class Agenda {

    private String nome;
    private String numeroTelefone;
    private String endereco;
    private String local;

    public Agenda(String nome, String numeroTelefone, String endereco, String local) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
        this.endereco = endereco;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getLocal() {
        return local;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Número de telefone: " + numeroTelefone +
                ", Endereço: " + endereco + ", Local: " + local;
    }
}
