package PrimeiroSemestre.Vetores;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[10];

        for (int i = 0; i < 10; i++) {

            System.out.println("Digite o " + (i + 1) + " nome:");
            nomes[i] = sc.nextLine();
        }

        System.out.println("Nomes em ordem inversa:");

        for (int i = 9; i >= 0; i--) {

            System.out.println(nomes[i]);
        }
    }
}