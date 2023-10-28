package Exercicio02;

import java.util.HashMap;

public class Associa {

    public static void main(String[] args) {

        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Gabriel", 20);
        mapa.put("Lucas", 15);
        mapa.put("Ana", 40);
        mapa.put("Pedro", 76);
        mapa.put("Ivo", 90);

        System.out.println("A idade de Ana é: " + mapa.get("Ana"));

        // mostrando nomes das pessoas que estão na terceira idade
        mostraTerceiraIdade(mapa);
    }

    // método
    public static void mostraTerceiraIdade(HashMap<String, Integer> mapa) {
        System.out.println("Pessoas na terceira idade:");
        for (String nome : mapa.keySet()) {
            int idade = mapa.get(nome);
            if (idade >= 60) {
                System.out.println(nome);
            }
        }
    }
}
