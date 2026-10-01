/* Escreva um algoritmo que leia dois números, calcule a soma entre eles e imprima o resultado. */

package PrimeiroSemestre.Variaveis;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;
        double soma = 0;

        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextDouble();

        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextDouble();

        soma = num1 + num2;
        System.out.println("A soma dos numeros " + num1 + " e " + num2 + " e igual a: " + soma);
    }
}
