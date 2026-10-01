package PrimeiroSemestre.Condicionais;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;
        double resultado = 0;
        char operacao;

        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextDouble();

        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextDouble();

        System.out.println("Digite a operacao (+, -, * ou /): ");
        operacao = sc.next().charAt(0);

        if (operacao == '+') {

            resultado = num1 + num2;
            System.out.println("Resultado: " + resultado);

        } else if (operacao == '-') {

            resultado = num1 - num2;
            System.out.println("Resultado: " + resultado);

        } else if (operacao == '*') {

            resultado = num1 * num2;
            System.out.println("Resultado: " + resultado);

        } else if (operacao == '/' && num2 != 0) {

            resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);

        } else if (operacao == '/') {

            System.out.println("Nao e possivel dividir por zero.");

        } else {

            System.out.println("Operacao invalida.");
        }
    }
}
