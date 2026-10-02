package SegundoSemestre.ProgramacaoOrientadaObjetos.ClassesEObjetos;

public class Produto {

    String nome;
    String marca;
    double precoCusto;
    double precoVenda;

    public double calcularLucro() {

        return precoVenda - precoCusto;
    }

    public static void main(String[] args) {

        Produto produto1 = new Produto();

        produto1.nome = "Mouse";
        produto1.marca = "Logitech";
        produto1.precoCusto = 80.00;
        produto1.precoVenda = 120.00;

        Produto produto2 = new Produto();

        produto2.nome = "Teclado";
        produto2.marca = "Redragon";
        produto2.precoCusto = 150.00;
        produto2.precoVenda = 220.00;

        System.out.println("Produto 1");
        System.out.println("Nome: " + produto1.nome);
        System.out.println("Marca: " + produto1.marca);
        System.out.println("Preco de custo: R$ " + produto1.precoCusto);
        System.out.println("Preco de venda: R$ " + produto1.precoVenda);
        System.out.println("Lucro: R$ " + produto1.calcularLucro());

        System.out.println();

        System.out.println("Produto 2");
        System.out.println("Nome: " + produto2.nome);
        System.out.println("Marca: " + produto2.marca);
        System.out.println("Preco de custo: R$ " + produto2.precoCusto);
        System.out.println("Preco de venda: R$ " + produto2.precoVenda);
        System.out.println("Lucro: R$ " + produto2.calcularLucro());
    }
}