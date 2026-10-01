// Nathalia Gongora Lopes - Construcao de Algoritmos - AC1

package PrimeiroSemestre.Avaliacoes.AC1;

import java.util.Scanner;

public class Ac1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double ac1 = 0.0;
        double ac2 = 0.0;
        double ag = 0.0;
        double af = 0.0;
        double mediaMinima = 0.0;

        // Informar ao usuario como sera realizado o calculo da media
        System.out.println("Calculadora");
        System.out.println("Calculo da Media Semestral");
        System.out.println("Para o calculo da media serao usadas as notas do usuario nas seguintes provas: AC1, AC2, AG e AF.");
        System.out.println("A sua nota deve estar entre 0 e 10, onde a media minima para aprovacao sera indicada pelo usuario.");

        // Informando as notas
        System.out.println("Vamos comecar?");

        System.out.println("Digite a sua nota na AC1");
        ac1 = sc.nextDouble();

        System.out.println("Digite a sua nota na AC2");
        ac2 = sc.nextDouble();

        System.out.println("Digite a sua nota na AG");
        ag = sc.nextDouble();

        System.out.println("Digite a sua nota na AF");
        af = sc.nextDouble();

        // Informando a nota minima para aprovacao
        System.out.println("Agora, indique qual a media minima necessaria para que voce seja aprovado(a)");
        mediaMinima = sc.nextDouble();

        // Calculo da media
        double mediaFinal = (ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45);

        System.out.println("O calculo da media e: (ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45)");
        System.out.println("Sendo assim, a sua media final e:");
        System.out.println(mediaFinal);

        // Informar se foi APROVADO ou REPROVADO
        if (mediaFinal >= mediaMinima) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }

        // Resumo das notas
        System.out.println("Sua nota na AC1 foi = ");
        System.out.println(ac1);

        System.out.println("Sua nota na AC2 foi = ");
        System.out.println(ac2);

        System.out.println("Sua nota na AG foi = ");
        System.out.println(ag);

        System.out.println("Sua nota na AF foi = ");
        System.out.println(af);

        System.out.println("A nota minima tem que ser");
        System.out.println(mediaMinima);

        // Revisar AC1, AC2 e AG
        if ((af >= 6) && (mediaFinal < mediaMinima)) {
            System.out.println("Voce precisa revisar AC1, AC2 e AG");
        } else {
            System.out.println("Boas ferias!!");
        }
    }
}
