package PrimeiroSemestre.SwitchCase;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;
        double resultado = 0;
        int opcao = 0;

        System.out.println("Digite o primeiro numero:");
        num1 = sc.nextDouble();

        System.out.println("Digite o segundo numero:");
        num2 = sc.nextDouble();

        System.out.println("Escolha uma operacao:");
        System.out.println("1 - Adicao");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");

        opcao = sc.nextInt();

        switch (opcao) {

            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 4:

                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Nao e possivel dividir por zero.");
                }

                break;

            default:
                System.out.println("Opcao invalida.");
                break;
        }
    }
}
