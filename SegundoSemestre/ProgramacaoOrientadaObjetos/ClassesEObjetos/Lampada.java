package SegundoSemestre.ProgramacaoOrientadaObjetos.ClassesEObjetos;

public class Lampada {

    boolean status;

    public void ligar() {

        status = true;
    }

    public void desligar() {

        status = false;
    }

    public void mostrarStatus() {

        if (status == true) {

            System.out.println("A lampada esta ligada.");

        } else {

            System.out.println("A lampada esta desligada.");
        }
    }

    public static void main(String[] args) {

        Lampada lampada1 = new Lampada();

        lampada1.mostrarStatus();

        lampada1.ligar();
        lampada1.mostrarStatus();

        lampada1.desligar();
        lampada1.mostrarStatus();
    }
}