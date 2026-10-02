package PrimeiroSemestre.Funcoes;

import java.util.Scanner;

public class Exercicio02 {

    public static void mostrarMensagem(String nome, int idade) {

        System.out.println("Ola, " + nome + ", voce tem " + idade + " anos.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = "";
        int idade = 0;

        System.out.println("Digite o nome:");
        nome = sc.nextLine();

        System.out.println("Digite a idade:");
        idade = sc.nextInt();

        mostrarMensagem(nome, idade);
    }
}