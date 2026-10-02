package SegundoSemestre.ProgramacaoOrientadaObjetos.ClassesEObjetos;

public class Retangulo {
    int base;
    int altura;

    public int calcularArea() {
        return base * altura;
    }

    public int calcularPerimetro() {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo();

        retangulo1.base = 5;
        retangulo1.altura = 10;

        int area = retangulo1.calcularArea();
        System.out.println("A area do retangulo e: " + area);
        int perimetro = retangulo1.calcularPerimetro();
        System.out.println("O perimetro do retangulo e: " + perimetro);
    }
}
