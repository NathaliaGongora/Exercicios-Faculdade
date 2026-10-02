package PrimeiroSemestre.ForEncadeado;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int linhas = 0;
        int colunas = 0;

        System.out.println("Digite a quantidade de linhas:");
        linhas = sc.nextInt();

        System.out.println("Digite a quantidade de colunas:");
        colunas = sc.nextInt();

        for (int i = 1; i <= linhas; i++) {

            for (int j = 1; j <= colunas; j++) {

                System.out.print((i * j) + " ");
            }

            System.out.println();
        }
    }
}
