package PrimeiroSemestre.SwitchCase;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cor;

        System.out.println("Digite o nome de uma cor:");
        cor = sc.nextLine().toLowerCase();

        switch (cor) {

            case "vermelho":
                System.out.println("Vermelho e uma cor associada ao fogo e ao amor.");
                break;

            case "azul":
                System.out.println("Azul e a cor do ceu e dos mares.");
                break;

            case "verde":
                System.out.println("Verde e uma cor associada a natureza.");
                break;

            case "amarelo":
                System.out.println("Amarelo e uma cor associada ao sol.");
                break;

            case "branco":
                System.out.println("Branco e uma cor associada a paz.");
                break;

            default:
                System.out.println("Cor nao cadastrada.");
                break;
        }
    }
}
