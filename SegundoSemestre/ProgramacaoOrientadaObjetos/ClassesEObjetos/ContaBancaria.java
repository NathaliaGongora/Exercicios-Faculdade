package SegundoSemestre.ProgramacaoOrientadaObjetos.ClassesEObjetos;

public class ContaBancaria {

    String titular;
    String numeroConta;
    double saldo;

    public void depositar(double valor) {

        saldo += valor;
    }

    public void sacar(double valor) {

        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void mostrarSaldo() {

        System.out.println("Titular: " + titular);
        System.out.println("Numero da conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
    }

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();

        conta1.titular = "João";
        conta1.numeroConta = "12345-6";
        conta1.saldo = 1000.00;

        conta1.mostrarSaldo();

        conta1.depositar(500.00);
        conta1.mostrarSaldo();

        conta1.sacar(200.00);
        conta1.mostrarSaldo();

        conta1.sacar(2000.00);
    }
    
}
