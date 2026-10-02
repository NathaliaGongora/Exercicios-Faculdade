package SegundoSemestre.ProgramacaoOrientadaObjetos.ClassesEObjetos;

public class Televisao {

    boolean status;
    int canal;
    int volume;

    public void ligar() {
        status = true;
    }

    public void desligar() {
        status = false;
    }

    public void aumentarVolume() {
        if (status) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (status) {
            volume--;
        }
    }

    public void mudarCanal(int novoCanal) {
        if (status) {
            canal = novoCanal;
        }
    }

    public void mostrarStatus() {
        if (status) {
            System.out.println("A televisao esta ligada.");
            System.out.println("Canal: " + canal);
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("A televisao esta desligada.");
        }
    }

    public static void main(String[] args) {
        Televisao tv1 = new Televisao();

        tv1.mostrarStatus();

        tv1.ligar();
        tv1.mudarCanal(5);
        tv1.aumentarVolume();
        tv1.aumentarVolume();
        tv1.mostrarStatus();

        tv1.diminuirVolume();
        tv1.mostrarStatus();

        tv1.desligar();
        tv1.mostrarStatus();
    }
        
}
