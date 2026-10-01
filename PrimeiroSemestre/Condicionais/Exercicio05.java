package PrimeiroSemestre.Condicionais;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade = 0;

        System.out.println("Digite a idade da pessoa: ");
        idade = sc.nextInt();

        if (idade < 0) {

            System.out.println("Idade invalida.");

        } else if (idade <= 11) {

            System.out.println("A pessoa e crianca.");

        } else if (idade <= 17) {

            System.out.println("A pessoa e adolescente.");

        } else if (idade <= 59) {

            System.out.println("A pessoa e adulta.");

        } else {

            System.out.println("A pessoa e idosa.");
        }
    }
}
