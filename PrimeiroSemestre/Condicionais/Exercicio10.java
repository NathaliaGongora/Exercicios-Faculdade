package PrimeiroSemestre.Condicionais;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ano = 0;

        System.out.println("Digite um ano: ");
        ano = sc.nextInt();

        if (ano % 400 == 0) {

            System.out.println("O ano e bissexto.");

        } else if (ano % 4 == 0 && ano % 100 != 0) {

            System.out.println("O ano e bissexto.");

        } else {

            System.out.println("O ano nao e bissexto.");
        }
    }
}
