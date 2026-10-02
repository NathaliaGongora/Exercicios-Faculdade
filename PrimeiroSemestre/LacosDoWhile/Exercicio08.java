package PrimeiroSemestre.LacosDoWhile;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;

        do {

            System.out.println("Digite um numero entre 1 e 10:");
            numero = sc.nextInt();

            if (numero < 1 || numero > 10) {

                System.out.println("Numero invalido.");
            }

        } while (numero < 1 || numero > 10);

        System.out.println("Numero valido: " + numero);
    }
}