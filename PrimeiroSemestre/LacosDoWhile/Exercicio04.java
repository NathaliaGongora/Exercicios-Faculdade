package PrimeiroSemestre.LacosDoWhile;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String senha = "";
        String senhaCorreta = "1234";

        do {

            System.out.println("Digite a senha:");
            senha = sc.next();

            if (!senha.equals(senhaCorreta)) {

                System.out.println("Senha incorreta.");
            }

        } while (!senha.equals(senhaCorreta));

        System.out.println("Senha correta!");
    }
}