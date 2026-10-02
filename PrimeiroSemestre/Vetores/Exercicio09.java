package PrimeiroSemestre.Vetores;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[6];
        int cont = 0;

        for (int i = 0; i < 6; i++) {

            System.out.println("Digite o " + (i + 1) + " numero:");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {

            if (numeros[i] > 10) {

                cont++;
            }
        }

        System.out.println("Quantidade de numeros maiores que 10: " + cont);
    }
}