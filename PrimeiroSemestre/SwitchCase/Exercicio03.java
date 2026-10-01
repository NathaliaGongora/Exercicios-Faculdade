package PrimeiroSemestre.SwitchCase;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valor = 0;
        double resultado = 0;
        int opcao = 0;

        System.out.println("Digite um valor em metros: ");
        valor = sc.nextDouble();

        System.out.println("Escolha a unidade para converter:");
        System.out.println("1 - Metros");
        System.out.println("2 - Quilometros");
        System.out.println("3 - Centimetros");

        opcao = sc.nextInt();

        switch (opcao) {

            case 1:
                resultado = valor;
                System.out.println("Resultado: " + resultado + " metros");
                break;

            case 2:
                resultado = valor / 1000;
                System.out.println("Resultado: " + resultado + " quilometros");
                break;

            case 3:
                resultado = valor * 100;
                System.out.println("Resultado: " + resultado + " centimetros");
                break;

            default:
                System.out.println("Opcao invalida.");
                break;
        }
    }
}
