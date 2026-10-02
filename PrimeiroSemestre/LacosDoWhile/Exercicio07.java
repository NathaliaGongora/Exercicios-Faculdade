package PrimeiroSemestre.LacosDoWhile;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        do {

            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Excluir");
            System.out.println("0 - Sair");

            System.out.println("Digite uma opcao:");
            opcao = sc.nextInt();

            if (opcao == 1) {

                System.out.println("Opcao Cadastrar escolhida.");

            } else if (opcao == 2) {

                System.out.println("Opcao Consultar escolhida.");

            } else if (opcao == 3) {

                System.out.println("Opcao Excluir escolhida.");

            } else if (opcao != 0) {

                System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);

        System.out.println("Programa encerrado.");
    }
}