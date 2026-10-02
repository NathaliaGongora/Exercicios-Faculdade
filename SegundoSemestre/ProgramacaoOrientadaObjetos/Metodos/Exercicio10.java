// Crie uma classe utilizando método que receba um número inteiro positivo
// e calcule o seu fatorial. No método main, solicite o número ao usuário
// e exiba o resultado retornado pelo método.

package SegundoSemestre.ProgramacaoOrientadaObjetos.Metodos;

import java.util.Scanner;

public class Exercicio10 {

    public static int calcularFatorial(int numero) {

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {

            fatorial = fatorial * i;
        }

        return fatorial;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int resultado;

        System.out.println("Digite um numero inteiro positivo:");
        numero = sc.nextInt();

        resultado = calcularFatorial(numero);

        System.out.println("O fatorial de " + numero + " e: " + resultado);
    }
}
