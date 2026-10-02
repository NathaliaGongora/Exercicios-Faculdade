package SegundoSemestre.ProgramacaoOrientadaObjetos.ClassesEObjetos;

public class Funcionario {
    
    String nome;
    String cargo;
    double salario;

    public void aumentarSalario(double percentual) {
        salario += salario * (percentual / 100);
    }
    
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
    }

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.nome = "Carlos";
        funcionario1.cargo = "Analista de Sistemas";
        funcionario1.salario = 3000.0;

        funcionario1.mostrarInformacoes();
        funcionario1.aumentarSalario(10);
        System.out.println("Após o aumento de salário:");
        funcionario1.mostrarInformacoes();
    }
}
