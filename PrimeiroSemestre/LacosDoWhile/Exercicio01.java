package PrimeiroSemestre.LacosDoWhile;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int cont = 1;

        System.out.println("Digite um numero:");
        numero = sc.nextInt();

        do {

            System.out.println(numero + " x " + cont + " = " + (numero * cont));

            cont++;

        } while (cont <= 10);
    }
}