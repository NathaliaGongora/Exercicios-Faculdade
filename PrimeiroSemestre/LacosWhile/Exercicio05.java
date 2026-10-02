package PrimeiroSemestre.LacosWhile;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valorProduto = 0;
        double pagamento = 0;
        double totalPago = 0;
        double troco = 0;

        System.out.println("Digite o valor do produto:");
        valorProduto = sc.nextDouble();

        while (totalPago < valorProduto) {

            System.out.println("Digite um valor para pagamento:");
            pagamento = sc.nextDouble();

            totalPago = totalPago + pagamento;
        }

        System.out.println("Pagamento suficiente!");

        troco = totalPago - valorProduto;

        System.out.println("Total pago: R$ " + totalPago);
        System.out.println("Troco: R$ " + troco);
    }
}