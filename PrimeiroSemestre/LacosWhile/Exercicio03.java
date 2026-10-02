package PrimeiroSemestre.LacosWhile;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int soma = 0;

        while (soma <= 100) {

            System.out.println("Digite um numero:");
            numero = sc.nextInt();

            soma = soma + numero;
        }

        System.out.println("A soma ultrapassou 100.");
        System.out.println("Soma final: " + soma);
    }
}