package PrimeiroSemestre.Funcoes;

import java.util.Scanner;

public class Exercicio09 {

    public static double calcularDesconto(double valor) {

        double desconto = 0;

        desconto = valor * 0.10;

        return valor - desconto;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valor = 0;
        double valorFinal = 0;

        System.out.println("Digite o valor do produto:");
        valor = sc.nextDouble();

        valorFinal = calcularDesconto(valor);

        System.out.println("Valor com desconto: " + valorFinal);
    }
}