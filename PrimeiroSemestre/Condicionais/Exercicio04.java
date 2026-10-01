package PrimeiroSemestre.Condicionais;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;

        System.out.println("Digite um numero inteiro: ");
        num = sc.nextInt();

        if (num > 20) {

            System.out.println("Valor invalido");

        } else {

            if (num % 2 == 0) {
                System.out.println("O numero e par");
            } else {
                System.out.println("O numero e impar");
            }

            if ((num % 2 == 0 && num >= 10 && num <= 50) ||
                (num % 2 != 0 && num >= 11 && num <= 51)) {

                System.out.println("Dentro do range");

            } else {

                System.out.println("Fora de range");
            }
        }
    }
}
