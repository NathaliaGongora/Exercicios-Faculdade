package SegundoSemestre.ProgramacaoOrientadaObjetos.RevisaoAlgoritmos;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero e PAR.");
        } else {
            System.out.println("O numero e IMPAR.");
        }

    }
}
