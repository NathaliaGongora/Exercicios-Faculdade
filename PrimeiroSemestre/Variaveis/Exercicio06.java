/* Escreva um algoritmo que leia um número inteiro e mostre seu antecessor e seu sucessor. */

package PrimeiroSemestre.Variaveis;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;
        int antecessor = 0;
        int sucessor = 0;

        System.out.println("Digite um numero inteiro: ");
        num = sc.nextInt();

        antecessor = num - 1;
        sucessor = num + 1;

        System.out.println("O antecessor do numero " + num + " e: " + antecessor);
        System.out.println("O sucessor do numero " + num + " e: " + sucessor);
    }
}
