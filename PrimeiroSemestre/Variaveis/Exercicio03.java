/* Elabore um algoritmo para calcular a área de um círculo. Considere pi = 3,14. */

package PrimeiroSemestre.Variaveis;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double pi = 3.14;
        double raio = 0;

        System.out.println("Digite o raio do circulo: ");
        raio = sc.nextDouble();

        double area = pi * (raio * raio);
        System.out.println("A area do circulo de raio " + raio + " e: " + area);
    }
}
