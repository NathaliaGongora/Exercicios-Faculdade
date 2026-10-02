package PrimeiroSemestre.Funcoes;

import java.util.Scanner;

public class Exercicio08 {

    public static boolean verificarPositivo(int numero) {

        if (numero > 0) {

            return true;

        } else {

            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        boolean resultado;

        System.out.println("Digite um numero:");
        numero = sc.nextInt();

        resultado = verificarPositivo(numero);

        System.out.println(resultado);
    }
}