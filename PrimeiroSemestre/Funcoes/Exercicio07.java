package PrimeiroSemestre.Funcoes;

import java.util.Scanner;

public class Exercicio07 {

    public static double calcularArea(double base, double altura) {

        return base * altura;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base = 0;
        double altura = 0;
        double area = 0;

        System.out.println("Digite a base:");
        base = sc.nextDouble();

        System.out.println("Digite a altura:");
        altura = sc.nextDouble();

        area = calcularArea(base, altura);

        System.out.println("A area e: " + area);
    }
}