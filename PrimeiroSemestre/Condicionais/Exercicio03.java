package PrimeiroSemestre.Condicionais;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;

        System.out.println("Digite um numero inteiro: ");
        num = sc.nextInt();

        if (num > 20) {

            System.out.println("Valor invalido. Nao podem ser inseridos valores maiores que 20.");

        } else {

            if (num % 2 == 0) {

                System.out.println("O numero e par.");

                if (num >= 10 && num <= 50) {
                    System.out.println("Dentro do range");
                } else {
                    System.out.println("Fora de range");
                }

            } else {

                System.out.println("O numero e impar.");

                if (num >= 11 && num <= 51) {
                    System.out.println("Dentro do range");
                } else {
                    System.out.println("Fora de range");
                }
            }
        }
    }
}
