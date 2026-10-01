package PrimeiroSemestre.Condicionais;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num = 0;

        System.out.println("Digite um numero: ");
        num = sc.nextDouble();

        if (num > 0) {

            System.out.println("O numero e positivo.");

        } else if (num < 0) {

            System.out.println("O numero e negativo.");

        } else {

            System.out.println("O numero e zero.");
        }
    }
}
