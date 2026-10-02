package PrimeiroSemestre.Funcoes;

import java.util.Scanner;

public class Exercicio05 {

    public static void menu() {

        System.out.println("1 - Somar dois numeros");
        System.out.println("2 - Verificar se um numero e par");
        System.out.println("3 - Calcular o dobro de um numero");
        System.out.println("0 - Sair");
    }

    public static void somar() {

        Scanner sc = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;
        int soma = 0;

        System.out.println("Digite o primeiro numero:");
        numero1 = sc.nextInt();

        System.out.println("Digite o segundo numero:");
        numero2 = sc.nextInt();

        soma = numero1 + numero2;

        System.out.println("Resultado: " + soma);
    }

    public static void verificarPar() {

        Scanner sc = new Scanner(System.in);

        int numero = 0;

        System.out.println("Digite um numero:");
        numero = sc.nextInt();

        if (numero % 2 == 0) {

            System.out.println("O numero e par.");

        } else {

            System.out.println("O numero e impar.");
        }
    }

    public static void calcularDobro() {

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int dobro = 0;

        System.out.println("Digite um numero:");
        numero = sc.nextInt();

        dobro = numero * 2;

        System.out.println("O dobro e: " + dobro);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        do {

            menu();

            System.out.println("Escolha uma opcao:");
            opcao = sc.nextInt();

            if (opcao == 1) {

                somar();

            } else if (opcao == 2) {

                verificarPar();

            } else if (opcao == 3) {

                calcularDobro();

            } else if (opcao == 0) {

                System.out.println("Programa encerrado.");

            } else {

                System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);
    }
}