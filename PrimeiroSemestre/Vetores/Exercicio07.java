package PrimeiroSemestre.Vetores;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int aux = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Digite o " + (i + 1) + " numero:");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {

            for (int j = i + 1; j < 10; j++) {

                if (numeros[i] > numeros[j]) {

                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }

        System.out.println("Vetor em ordem crescente:");

        for (int i = 0; i < 10; i++) {

            System.out.println(numeros[i]);
        }
    }
}