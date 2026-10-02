package PrimeiroSemestre.Funcoes;

import java.util.Scanner;

public class Exercicio06 {

    public static int maiorNumero(int numero1, int numero2) {

        if (numero1 > numero2) {

            return numero1;

        } else {

            return numero2;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;
        int maior = 0;

        System.out.println("Digite o primeiro numero:");
        numero1 = sc.nextInt();

        System.out.println("Digite o segundo numero:");
        numero2 = sc.nextInt();

        maior = maiorNumero(numero1, numero2);

        System.out.println("O maior numero e: " + maior);
    }
}