package SegundoSemestre.ProgramacaoOrientadaObjetos.ClassesEObjetos;

public class Aluno {

    String nome;
    double nota1;
    double nota2;

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public void mostrarSituacao() {
        double media = calcularMedia();
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        aluno1.nome = "Maria";
        aluno1.nota1 = 8.5;
        aluno1.nota2 = 7.0;

        System.out.println("Aluno: " + aluno1.nome);
        System.out.println("Nota 1: " + aluno1.nota1);
        System.out.println("Nota 2: " + aluno1.nota2);
        System.out.println("Media: " + aluno1.calcularMedia());
        aluno1.mostrarSituacao();
    }

}
