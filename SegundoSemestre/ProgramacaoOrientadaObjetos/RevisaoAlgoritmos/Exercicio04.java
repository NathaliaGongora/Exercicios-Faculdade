
package SegundoSemestre.ProgramacaoOrientadaObjetos.RevisaoAlgoritmos;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("O primeiro numero e maior.");
        } else if (num2 > num1) {
            System.out.println("O segundo numero e maior.");
        } else {
            System.out.println("Os dois numeros sao iguais.");
        }
    }
}
