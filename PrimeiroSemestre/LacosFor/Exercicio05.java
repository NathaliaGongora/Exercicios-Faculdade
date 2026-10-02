package PrimeiroSemestre.LacosFor;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;

        System.out.println("Digite um numero:");
        numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
