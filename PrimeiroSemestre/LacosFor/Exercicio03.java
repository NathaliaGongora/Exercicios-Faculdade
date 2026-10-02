package PrimeiroSemestre.LacosFor;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inicio = 0;
        int fim = 0;

        System.out.println("Digite o inicio do range: ");
        inicio = sc.nextInt();

        System.out.println("Digite o fim do range: ");
        fim = sc.nextInt();

        for (int i = inicio; i <= fim; i++) {

            if (i % 7 == 0) {

                System.out.println("Numero divisivel por 7 encontrado: " + i);
                break;

            } else {

                System.out.println(i + " nao e divisivel por 7.");
            }
        }
    }
}
