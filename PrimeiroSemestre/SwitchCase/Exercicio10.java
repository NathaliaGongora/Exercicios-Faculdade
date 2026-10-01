package PrimeiroSemestre.SwitchCase;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo = 0;

        System.out.println("Escolha um meio de transporte:");
        System.out.println("1 - Carro");
        System.out.println("2 - Moto");
        System.out.println("3 - Onibus");
        System.out.println("4 - Bicicleta");

        codigo = sc.nextInt();

        switch (codigo) {

            case 1:
                System.out.println("Voce escolheu Carro.");
                break;

            case 2:
                System.out.println("Voce escolheu Moto.");
                break;

            case 3:
                System.out.println("Voce escolheu Onibus.");
                break;

            case 4:
                System.out.println("Voce escolheu Bicicleta.");
                break;

            default:
                System.out.println("Opcao invalida.");
                break;
        }
    }
}
