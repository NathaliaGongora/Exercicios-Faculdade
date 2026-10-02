package SegundoSemestre.ProgramacaoOrientadaObjetos.ClassesEObjetos;

public class Pessoa {

    String nome;
    int idade;
    double altura;
    double peso;

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Joao";
        pessoa1.idade = 25;
        pessoa1.altura = 1.75;
        pessoa1.peso = 70.0;

        pessoa1.mostrarInformacoes();
    }
    
}
