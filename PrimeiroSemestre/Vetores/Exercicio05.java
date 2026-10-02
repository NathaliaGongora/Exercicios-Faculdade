package PrimeiroSemestre.Vetores;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidade = 0;
        int somaPares = 0;
        int somaImpares = 0;

        System.out.println("Quantos numeros deseja informar?");
        quantidade = sc.nextInt();

        int[] numeros = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {

            System.out.println("Digite o " + (i + 1) + " numero:");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < quantidade; i++) {

            if (numeros[i] % 2 == 0) {

                somaPares = somaPares + numeros[i];

            } else {

                somaImpares = somaImpares + numeros[i];
            }
        }

        System.out.println("Soma dos numeros pares: " + somaPares);
        System.out.println("Soma dos numeros impares: " + somaImpares);
    }
}