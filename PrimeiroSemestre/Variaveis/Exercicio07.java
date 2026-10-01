/* Escreva um algoritmo que leia um valor em metros,
converta esse valor para centímetros e mostre o resultado. */

package PrimeiroSemestre.Variaveis;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double metros = 0;
        double centimetros = 0;

        System.out.println("Digite o valor em metros: ");
        metros = sc.nextDouble();

        centimetros = metros * 100;

        System.out.println(metros + " metros e igual a " + centimetros + " centimetros.");
    }
}
