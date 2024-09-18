import exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int primeiroParametro = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int segundoParametro = scanner.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro parâmetro tem de ser menor que o segundo!");
        }
    }

    private static void contar(int primeiroParametro, int segundoParametro) {
        int diferencaEntreParametros = segundoParametro - primeiroParametro;

        if (diferencaEntreParametros  < 0)
            throw new ParametrosInvalidosException();

        for(int i = 0; i < diferencaEntreParametros; i++) {
            System.out.printf("%nImprimindo o número %d%n", i + 1);
        }
    }
}