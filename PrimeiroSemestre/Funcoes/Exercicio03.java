package PrimeiroSemestre.Funcoes;

import java.util.Scanner;

public class Exercicio03 {

    public static double calcularMedia(double nota1, double nota2, double nota3) {

        double media = 0;

        media = (nota1 + nota2 + nota3) / 3;

        return media;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        double media = 0;

        System.out.println("Digite a primeira nota:");
        nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota:");
        nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota:");
        nota3 = sc.nextDouble();

        media = calcularMedia(nota1, nota2, nota3);

        System.out.println("A media e: " + media);
    }
}