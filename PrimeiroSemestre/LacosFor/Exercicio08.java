package PrimeiroSemestre.LacosFor;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0;
        int primeiro = 0;
        int segundo = 1;
        int proximo = 0;

        System.out.println("Digite a quantidade de termos:");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Termo " + i + ":");
            System.out.println(primeiro);

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
    }
}
