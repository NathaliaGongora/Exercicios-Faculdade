package PrimeiroSemestre.Vetores;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int[] invertido = new int[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite o " + (i + 1) + " numero:");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {

            invertido[i] = numeros[4 - i];
        }

        System.out.println("Vetor em ordem inversa:");

        for (int i = 0; i < 5; i++) {

            System.out.println(invertido[i]);
        }
    }
}