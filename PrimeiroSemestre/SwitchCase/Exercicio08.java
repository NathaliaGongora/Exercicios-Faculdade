package PrimeiroSemestre.SwitchCase;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        System.out.println("Escolha uma estacao do ano:");
        System.out.println("1 - Verao");
        System.out.println("2 - Outono");
        System.out.println("3 - Inverno");
        System.out.println("4 - Primavera");

        opcao = sc.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("A estacao escolhida foi Verao.");
                break;

            case 2:
                System.out.println("A estacao escolhida foi Outono.");
                break;

            case 3:
                System.out.println("A estacao escolhida foi Inverno.");
                break;

            case 4:
                System.out.println("A estacao escolhida foi Primavera.");
                break;

            default:
                System.out.println("Opcao invalida.");
                break;
        }
    }
}
