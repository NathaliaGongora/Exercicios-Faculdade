package PrimeiroSemestre.LacosDoWhile;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroCorreto = 7;
        int tentativa = 0;

        do {

            System.out.println("Tente adivinhar o numero:");
            tentativa = sc.nextInt();

            if (tentativa != numeroCorreto) {

                System.out.println("Numero incorreto. Tente novamente.");
            }

        } while (tentativa != numeroCorreto);

        System.out.println("Parabens! Voce acertou.");
    }
}