package Exercicio06;

import java.util.LinkedList;

public class SistemaReservasPassagensAviao {
    private LinkedList<Reserva> reservas;

    public SistemaReservasPassagensAviao() {
        reservas = new LinkedList<>();
    }

    public void reservaPassagem(String nome, String local, String CPF, String dataEntrada, String dataSaida) {
        Reserva reserva = new Reserva(nome, local, CPF, dataEntrada, dataSaida);
        reservas.add(reserva);
    }

    public void cancelaReserva(String CPF) {
        for (Reserva reserva : reservas) {
            if (reserva.CPF.equals(CPF)) {
                reservas.remove(reserva);
                return;
            }
        }
        System.out.println("Reserva não encontrada");
    }

    public void mostraListaReservas() {
        System.out.println("Lista de reservas:");
        for (Reserva reserva : reservas) {
            System.out.println("Nome: " + reserva.nome);
            System.out.println("Local: " + reserva.local);
            System.out.println("CPF: " + reserva.CPF);
            System.out.println("Data de Entrada: " + reserva.dataEntrada);
            System.out.println("Data de Saída: " + reserva.dataSaida);
            System.out.println();
        }

    }
}

