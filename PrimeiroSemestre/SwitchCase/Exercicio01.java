package PrimeiroSemestre.SwitchCase;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo = 0;

        System.out.println("Digite o codigo da bebida:");
        System.out.println("1 - Coca-Cola");
        System.out.println("2 - Agua");
        System.out.println("3 - Cafe");
        System.out.println("4 - Suco de laranja");

        codigo = sc.nextInt();

        switch (codigo) {

            case 1:
                System.out.println("A bebida escolhida foi Coca-Cola.");
                break;

            case 2:
                System.out.println("A bebida escolhida foi Agua.");
                break;

            case 3:
                System.out.println("A bebida escolhida foi Cafe.");
                break;

            case 4:
                System.out.println("A bebida escolhida foi Suco de laranja.");
                break;

            default:
                System.out.println("Opcao invalida.");
                break;
        }
    }
}
