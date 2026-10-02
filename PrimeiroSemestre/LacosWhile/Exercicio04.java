package PrimeiroSemestre.LacosWhile;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String senha = "";
        String senhaCorreta = "1234";

        System.out.println("Digite a senha:");
        senha = sc.next();

        while (!senha.equals(senhaCorreta)) {

            System.out.println("Senha incorreta. Tente novamente:");
            senha = sc.next();
        }

        System.out.println("Senha correta!");
    }
}