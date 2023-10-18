package Exercicio04;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
public static void main(String [] args) {
        ListaDeCompras listaCompras = new ListaDeCompras();

        Scanner scanner = new Scanner(System.in);

        while (true) {

        System.out.println("O que você gostaria de fazer?");
        System.out.println("1 - Adicionar item à Lista de compras");
        System.out.println("2 - Remover item da Lista de compras");
        System.out.println("3 - Mostrar a Lista de compras");
        System.out.println("4 - Sair");

        int escolha = scanner.nextInt();

        switch (escolha) {

        case 1:
        System.out.println("Informe o item: ");
        String itemNome = scanner.next();

        System.out.println("Informe a data de validade: ");
        String dataValidade = scanner.next();

        Compra compra = new Compra(itemNome,dataValidade);

        listaCompras.addCompra(compra);
        break;

        case 2:

        System.out.println("Informe o nome do item para removê-lo: ");
        String itemRemove = scanner.next();

        Compra compraParaRemover = listaCompras.procuraNomeCompra(itemRemove);

        if (compraParaRemover != null) {
        listaCompras.removeCompra(compraParaRemover);
        } else {
        System.out.println("Item não encontrado");
        }
        break;

        case 3:
        listaCompras.mostraListaCompras();
        break;

        case 4:
        System.out.println("Obrigado por usar o programa!");

        System.exit(0);
        break;

default:
        System.out.println("Opção Inválida");

        }

        }

        }


        }



