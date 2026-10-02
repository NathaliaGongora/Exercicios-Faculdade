package PrimeiroSemestre.Funcoes;

import java.util.Scanner;

public class Exercicio10 {

    public static void mostrarTabuada(int numero) {

        for (int i = 1; i <= 10; i++) {

            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;

        System.out.println("Digite um numero:");
        numero = sc.nextInt();

        mostrarTabuada(numero);
    }
}