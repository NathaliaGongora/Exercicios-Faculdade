package SegundoSemestre.ProgramacaoOrientadaObjetos.ClassesEObjetos;

public class Carro {
    
    String marca;
    String modelo;
    int ano; 
    int velocidadeAtual;
    
    public void acelerar(int incremento) {
        velocidadeAtual += incremento;
    }

    public void frear(int decremento) {
        velocidadeAtual -= decremento;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }

    public void mostrarVelocidade() {
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2020;
        carro1.velocidadeAtual = 0;
        
        carro1.mostrarVelocidade();
        
        carro1.acelerar(50);
        carro1.mostrarVelocidade();
        
        carro1.frear(20);
        carro1.mostrarVelocidade();
        
        carro1.frear(40);
        carro1.mostrarVelocidade();
    }

}
