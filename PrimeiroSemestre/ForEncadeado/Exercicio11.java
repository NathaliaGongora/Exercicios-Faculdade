package PrimeiroSemestre.ForEncadeado;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int linhas = 0;
        int colunas = 0;
        int numero = 1;

        System.out.println("Digite a quantidade de linhas:");
        linhas = sc.nextInt();

        System.out.println("Digite a quantidade de colunas:");
        colunas = sc.nextInt();

        for (int i = 1; i <= linhas; i++) {

            for (int j = 1; j <= colunas; j++) {

                System.out.print(numero + " ");
                numero++;
            }

            System.out.println();
        }
    }
}
