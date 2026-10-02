package PrimeiroSemestre.LacosWhile;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int cont = 1;
        int fatorial = 1;

        System.out.println("Digite um numero:");
        numero = sc.nextInt();

        while (cont <= numero) {

            fatorial = fatorial * cont;

            cont++;
        }

        System.out.println("O fatorial de " + numero + " e: " + fatorial);
    }
}