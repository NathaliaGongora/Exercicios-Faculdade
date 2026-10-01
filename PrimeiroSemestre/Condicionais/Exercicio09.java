package PrimeiroSemestre.Condicionais;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double lado1 = 0;
        double lado2 = 0;
        double lado3 = 0;

        System.out.println("Digite o comprimento do primeiro lado: ");
        lado1 = sc.nextDouble();

        System.out.println("Digite o comprimento do segundo lado: ");
        lado2 = sc.nextDouble();

        System.out.println("Digite o comprimento do terceiro lado: ");
        lado3 = sc.nextDouble();

        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0 ||
            lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 ||
            lado2 + lado3 <= lado1) {

            System.out.println("Os valores informados nao formam um triangulo.");

        } else if (lado1 == lado2 && lado2 == lado3) {

            System.out.println("O triangulo e equilatero.");

        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {

            System.out.println("O triangulo e isosceles.");

        } else {

            System.out.println("O triangulo e escaleno.");
        }
    }
}
