package Exercicio04;

import java.util.LinkedHashMap;

public class ProdutosEPrecos {
    public static void main(String[] args) {

        LinkedHashMap<String, Double> produtosEprecos = new LinkedHashMap<>();


        produtosEprecos.put("Alface", 4.99);
        produtosEprecos.put("Tomate", 1.99);
        produtosEprecos.put("Pepino", 3.99);


        System.out.println("Lista de Produtos e seus preços:");
        for (String produto : produtosEprecos.keySet()) {
            System.out.println(produto + ": R$" + produtosEprecos.get(produto));
        }
    }
}
