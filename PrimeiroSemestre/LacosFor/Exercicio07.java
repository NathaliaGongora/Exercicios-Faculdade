package PrimeiroSemestre.LacosFor;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int fatorial = 1;

        System.out.println("Digite um numero:");
        numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {

            fatorial = fatorial * i;
        }

        System.out.println("O fatorial de " + numero + " e: " + fatorial);
    }
}
