package PrimeiroSemestre.LacosFor;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0;
        int soma = 0;

        System.out.println("Digite um numero:");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {

                soma = soma + i;
            }
        }

        System.out.println("A soma dos numeros pares de 1 ate " + n + " e: " + soma);
    }
}
