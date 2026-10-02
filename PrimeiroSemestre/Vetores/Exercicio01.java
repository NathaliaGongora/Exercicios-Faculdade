package PrimeiroSemestre.Vetores;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;
        double media = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite o " + (i + 1) + " numero:");
            numeros[i] = sc.nextInt();

            soma = soma + numeros[i];
        }

        media = (double) soma / 5;

        System.out.println("A media dos numeros e: " + media);
    }
}