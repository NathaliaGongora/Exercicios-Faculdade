package PrimeiroSemestre.Condicionais;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;

        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextDouble();

        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextDouble();

        if (num1 > num2) {

            System.out.println("O maior numero e: " + num1);

        } else if (num2 > num1) {

            System.out.println("O maior numero e: " + num2);

        } else {

            System.out.println("Os dois numeros sao iguais.");
        }
    }
}
