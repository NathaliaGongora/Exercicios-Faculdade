package PrimeiroSemestre.LacosWhile;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int cont = 1;

        System.out.println("Digite um numero:");
        numero = sc.nextInt();

        while (cont <= numero) {

            System.out.println(cont);

            cont++;
        }
    }
}