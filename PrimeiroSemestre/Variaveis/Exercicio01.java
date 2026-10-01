// Elabore um algoritmo para calcular a média de 3 valores, porém utilizando apenas duas variáveis.

package PrimeiroSemestre.Variaveis;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valor;
        double media;

        System.out.print("Digite o primeiro valor: ");
        valor = sc.nextDouble();

        media = valor;

        System.out.println("Digite o segundo valor: ");
        valor = sc.nextDouble();

        media = media + valor;

        System.out.print("Digite o terceiro valor: ");
        valor = sc.nextDouble();

        media = media + valor;
        media = media / 3;

        System.out.println("A media é: " + media);
    }
}
