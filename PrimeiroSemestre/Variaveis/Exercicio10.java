/* Escreva um algoritmo que leia três notas, calcule a média e mostre o resultado. */

package PrimeiroSemestre.Variaveis;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        double media = 0;

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A media das notas e: " + media);
    }
}
