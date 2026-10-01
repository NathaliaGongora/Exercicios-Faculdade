package PrimeiroSemestre.SwitchCase;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String tamanho;

        System.out.println("Digite o tamanho da roupa:");
        System.out.println("P - Pequeno");
        System.out.println("M - Medio");
        System.out.println("G - Grande");

        tamanho = sc.nextLine().toUpperCase();

        switch (tamanho) {

            case "P":
                System.out.println("Tamanho Pequeno.");
                break;

            case "M":
                System.out.println("Tamanho Medio.");
                break;

            case "G":
                System.out.println("Tamanho Grande.");
                break;

            default:
                System.out.println("Tamanho invalido.");
                break;
        }
    }
}
