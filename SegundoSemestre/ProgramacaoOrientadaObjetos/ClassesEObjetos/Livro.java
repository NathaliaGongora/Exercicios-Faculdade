package SegundoSemestre.ProgramacaoOrientadaObjetos.ClassesEObjetos;

public class Livro {
    
    String titulo;
    String autor;
    int numeroPaginas;
    boolean disponivel;

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("O livro foi emprestado com sucesso.");
        } else {
            System.out.println("O livro nao esta disponivel para emprestimo.");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("O livro foi devolvido com sucesso.");
        } else {
            System.out.println("O livro ja esta disponivel na biblioteca.");
        }
    }
    
    public void mostrarInformacoes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de Paginas: " + numeroPaginas);
        System.out.println("Disponivel: " + disponivel);
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro();

        livro1.titulo = "O Pequeno Principe";
        livro1.autor = "Antoine de Saint-Exupery";
        livro1.numeroPaginas = 96;
        livro1.disponivel = true;

        livro1.mostrarInformacoes();

        livro1.emprestar();
        livro1.mostrarInformacoes();
        livro1.emprestar();
        livro1.mostrarInformacoes();
        livro1.devolver();
        livro1.mostrarInformacoes();
    }
}
