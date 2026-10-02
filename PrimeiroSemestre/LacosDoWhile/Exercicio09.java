package PrimeiroSemestre.LacosDoWhile;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int soma = 0;

        do {

            System.out.println("Digite um numero:");
            numero = sc.nextInt();

            soma = soma + numero;

            System.out.println("Soma atual: " + soma);

        } while (soma <= 50);

        System.out.println("A soma ultrapassou 50.");
    }
}