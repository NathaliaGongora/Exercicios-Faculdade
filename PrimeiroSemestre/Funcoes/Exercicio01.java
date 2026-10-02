package PrimeiroSemestre.Funcoes;

import java.util.Scanner;

public class Exercicio01 {

    public static int dobro(int numero) {

        return numero * 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int resultado = 0;

        System.out.println("Digite um numero:");
        numero = sc.nextInt();

        resultado = dobro(numero);

        System.out.println("O dobro do numero e: " + resultado);
    }
}