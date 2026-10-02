package PrimeiroSemestre.ForEncadeado;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tamanho = 0;

        System.out.println("Digite o tamanho do quadrado:");
        tamanho = sc.nextInt();

        for (int i = 1; i <= tamanho; i++) {

            for (int j = 1; j <= tamanho; j++) {

                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
