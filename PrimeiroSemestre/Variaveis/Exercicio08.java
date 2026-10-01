/* Escreva um algoritmo que leia o salário de uma pessoa,
calcule um aumento de 10% e mostre o novo salário. */

package PrimeiroSemestre.Variaveis;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario = 0;
        double aumento = 0;
        double novoSalario = 0;

        System.out.println("Digite o salario da pessoa: ");
        salario = sc.nextDouble();

        aumento = salario * 0.10;
        novoSalario = salario + aumento;

        System.out.println("O novo salario com aumento de 10% e: " + novoSalario);
    }
}
