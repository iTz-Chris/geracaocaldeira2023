package Exercicio05;

import Exercicio05.IdadeInvalidaException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe a sua idade: ");
            int idade = scanner.nextInt();

            if (idade < 0 || idade > 150) {
                throw new IdadeInvalidaException("Idade inválida!");
            }
        } catch (IdadeInvalidaException e) {
            System.err.println("Erro: " + e);
        } catch (InputMismatchException e){
            System.err.println("Erro! informe um número inteiro." + e);
        }


    }
}
