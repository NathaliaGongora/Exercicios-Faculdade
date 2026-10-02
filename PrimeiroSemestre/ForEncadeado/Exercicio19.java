package PrimeiroSemestre.ForEncadeado;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int linhas = 0;

        System.out.println("Digite a quantidade de linhas:");
        linhas = sc.nextInt();

        for (int i = 1; i <= linhas; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
