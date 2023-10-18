package Exercicio04;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {

    private List<Compra> listaCompras;

    public Compra procuraNomeCompra(String itemNome) {
        for (Compra compra : listaCompras) {
            if (compra.getNome().equals(itemNome)) {
                return compra;

            }

        }

        return null;

    }


    public ListaDeCompras() {
        listaCompras = new ArrayList<>();
    }

    public void addCompra(Compra compra) {
        listaCompras.add(compra);
    }

    public void removeCompra(Compra compra) {
        listaCompras.remove(compra);
    }

    public void mostraListaCompras() {
        System.out.println("Lista de compras: ");
        for (Compra compra : listaCompras) {
            System.out.println(compra.getNome() + " - " + compra.getDataValidade());
        }


    } }




