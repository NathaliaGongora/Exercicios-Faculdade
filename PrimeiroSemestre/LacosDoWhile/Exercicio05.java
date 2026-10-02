package PrimeiroSemestre.LacosDoWhile;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numero1 = 0;
        double numero2 = 0;
        double resultado = 0;
        char operacao;
        char continuar;

        do {

            System.out.println("Digite o primeiro numero:");
            numero1 = sc.nextDouble();

            System.out.println("Digite o segundo numero:");
            numero2 = sc.nextDouble();

            System.out.println("Digite a operacao (+, -, *, /):");
            operacao = sc.next().charAt(0);

            if (operacao == '+') {

                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);

            } else if (operacao == '-') {

                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);

            } else if (operacao == '*') {

                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);

            } else if (operacao == '/') {

                if (numero2 != 0) {

                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);

                } else {

                    System.out.println("Nao e possivel dividir por zero.");
                }

            } else {

                System.out.println("Operacao invalida.");
            }

            System.out.println("Deseja continuar? (S/N)");
            continuar = sc.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        System.out.println("Calculadora encerrada.");
    }
}