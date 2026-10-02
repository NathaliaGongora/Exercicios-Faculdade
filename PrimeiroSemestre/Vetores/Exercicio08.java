package PrimeiroSemestre.Vetores;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int procurar = 0;
        boolean encontrado = false;

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite o " + (i + 1) + " numero:");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Digite o numero que deseja procurar:");
        procurar = sc.nextInt();

        for (int i = 0; i < 5; i++) {

            if (numeros[i] == procurar) {

                System.out.println("Numero encontrado na posicao " + i);
                encontrado = true;
            }
        }

        if (encontrado == false) {

            System.out.println("Numero nao encontrado no vetor.");
        }
    }
}