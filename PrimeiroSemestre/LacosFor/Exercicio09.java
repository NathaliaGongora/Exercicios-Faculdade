package PrimeiroSemestre.LacosFor;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int positivos = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Digite um numero:");
            numero = sc.nextInt();

            if (numero > 0) {
                positivos++;
            }
        }

        System.out.println("Quantidade de numeros positivos: " + positivos);
    }
}
