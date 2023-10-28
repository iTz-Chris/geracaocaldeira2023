package Exercicio03;

import java.util.TreeMap;

public class AgendaTelefonica {

    private TreeMap<String, Agenda> contatos = new TreeMap<>();

    public void adicionaContato(String nome, String numeroTelefone, String endereco, String local) {
        Agenda agenda = new Agenda(nome, numeroTelefone, endereco, local);
        contatos.put(nome, agenda);
    }

    public void mostraContatosOrdemAlfabetica() {
        for (Agenda agenda : contatos.values()) {
            System.out.println(agenda);
        }
    }

    public void mostraContatosLocalidade(String local) {
        for (Agenda agenda : contatos.values()) {
            if (agenda.getLocal().equals(local)) {
                System.out.println(agenda);
            }
        }
    }

    public static void main(String[] args) {
        AgendaTelefonica agendaTelefonica = new AgendaTelefonica();

        // Adicionando contatos
        agendaTelefonica.adicionaContato("Diego", "99887766", "Rua Orquídea", "Norte");
        agendaTelefonica.adicionaContato("Jonas", "87901230", "Rua Tulipa", "Sul");
        agendaTelefonica.adicionaContato("Paulo", "89764531", "Rua Margarida", "Leste");
        agendaTelefonica.adicionaContato("Maria", "91231090", "Rua Girasol", "Oeste");
        agendaTelefonica.adicionaContato("Júlia", "82344500", "Rua Dália", "Centro");

        // mostrando os contatos em ordem alfabética
        System.out.println("Contatos:");
        agendaTelefonica.mostraContatosOrdemAlfabetica();

        // mostrando contatos de uma determinada localidade
        System.out.println("Contato(s) da localidade Sul:");
        agendaTelefonica.mostraContatosLocalidade("Sul");
    }
}

