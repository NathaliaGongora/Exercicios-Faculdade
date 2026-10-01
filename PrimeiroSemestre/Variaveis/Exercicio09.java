// Escreva um algoritmo que leia uma temperatura em graus Celsius e converta para Fahrenheit.

package PrimeiroSemestre.Variaveis;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double celsius = 0;
        double fahrenheit = 0;

        System.out.println("Digite a temperatura em graus Celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " graus Celsius e igual a " + fahrenheit + " graus Fahrenheit.");
    }
}
