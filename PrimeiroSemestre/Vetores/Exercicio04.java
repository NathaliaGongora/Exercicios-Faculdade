package PrimeiroSemestre.Vetores;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] alturas = new double[5];
        double soma = 0;
        double media = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite a altura da " + (i + 1) + " pessoa:");
            alturas[i] = sc.nextDouble();

            soma = soma + alturas[i];
        }

        media = soma / 5;

        System.out.println("A altura media e: " + media);
    }
}