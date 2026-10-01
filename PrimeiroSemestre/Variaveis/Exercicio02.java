/* Elabore um algoritmo para calcular a área de um triângulo. */

package PrimeiroSemestre.Variaveis;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double altura = 0;
        double base = 0;

        System.out.println("Digite a altura do triangulo: ");
        altura = sc.nextDouble();

        System.out.println("Digite a base do triangulo: ");
        base = sc.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("A area do triangulo de base " + base + " e altura " + altura + " e: " + area);
    }
}
