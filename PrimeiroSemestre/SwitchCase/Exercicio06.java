package PrimeiroSemestre.SwitchCase;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mes = 0;

        System.out.println("Digite o numero do mes:");
        System.out.println("1 - Janeiro");
        System.out.println("2 - Fevereiro");
        System.out.println("3 - Marco");
        System.out.println("4 - Abril");
        System.out.println("5 - Maio");
        System.out.println("6 - Junho");
        System.out.println("7 - Julho");
        System.out.println("8 - Agosto");
        System.out.println("9 - Setembro");
        System.out.println("10 - Outubro");
        System.out.println("11 - Novembro");
        System.out.println("12 - Dezembro");

        mes = sc.nextInt();

        switch (mes) {

            case 1:
                System.out.println("Janeiro - Ano Novo.");
                break;

            case 2:
                System.out.println("Fevereiro - Carnaval.");
                break;

            case 3:
                System.out.println("Marco - Dia Internacional da Mulher.");
                break;

            case 4:
                System.out.println("Abril - Pascoa.");
                break;

            case 5:
                System.out.println("Maio - Dia das Maes.");
                break;

            case 6:
                System.out.println("Junho - Festas Juninas.");
                break;

            case 7:
                System.out.println("Julho - Ferias escolares.");
                break;

            case 8:
                System.out.println("Agosto - Dia dos Pais.");
                break;

            case 9:
                System.out.println("Setembro - Independencia do Brasil.");
                break;

            case 10:
                System.out.println("Outubro - Dia das Criancas.");
                break;

            case 11:
                System.out.println("Novembro - Proclamacao da Republica.");
                break;

            case 12:
                System.out.println("Dezembro - Natal.");
                break;

            default:
                System.out.println("Mes invalido.");
                break;
        }
    }
}
