package PrimeiroSemestre.LacosDoWhile;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valorProduto = 0;
        double pagamento = 0;
        double totalPago = 0;
        double troco = 0;

        System.out.println("Digite o valor do produto:");
        valorProduto = sc.nextDouble();

        do {

            System.out.println("Digite um valor para pagamento:");
            pagamento = sc.nextDouble();

            totalPago = totalPago + pagamento;

        } while (totalPago < valorProduto);

        troco = totalPago - valorProduto;

        System.out.println("Pagamento suficiente!");
        System.out.println("Total pago: R$ " + totalPago);
        System.out.println("Troco: R$ " + troco);
    }
}