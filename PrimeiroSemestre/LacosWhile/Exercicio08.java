package PrimeiroSemestre.LacosWhile;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int cont = 1;
        int soma = 0;

        System.out.println("Digite um numero:");
        numero = sc.nextInt();

        while (cont <= numero) {

            soma = soma + cont;

            cont++;
        }

        System.out.println("A soma e: " + soma);
    }
}