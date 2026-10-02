package PrimeiroSemestre.LacosDoWhile;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int soma = 0;
        int cont = 0;
        double media = 0;

        do {

            System.out.println("Digite um numero:");
            numero = sc.nextInt();

            if (numero != 0) {

                soma = soma + numero;
                cont++;
            }

        } while (numero != 0);

        if (cont > 0) {

            media = (double) soma / cont;

            System.out.println("A media dos numeros e: " + media);

        } else {

            System.out.println("Nenhum numero foi digitado.");
        }
    }
}