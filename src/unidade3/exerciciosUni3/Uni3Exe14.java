package unidade3.exerciciosUni3;

import java.util.Scanner;

//distância percorrida e o do tempo gasto durante uma viagem calcule a velocidade média e a 
//quantidade de combustível gasto na viagem, sabendo que o automóvel faz 12 km por litro.

public class Uni3Exe14 {

    private float tempoHorasViagem;
    private float distanciaKmViagem;

    public Uni3Exe14 (float tempoHorasViagem, float distanciaKmViagem){
        this.tempoHorasViagem = tempoHorasViagem;
        this.distanciaKmViagem = distanciaKmViagem;
    }

    public float velocidadeMediaDaViagem(){
        float velocidadeMedia = (this.distanciaKmViagem)/(this.tempoHorasViagem);
        return velocidadeMedia;
    }

    public float quantidadeCombustivelGastoNaViagem(){
        float quantCombustivelGasto = this.distanciaKmViagem/12;
        return quantCombustivelGasto;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tempo de viagem(horas):");
        float tempoMinutos = input.nextFloat();

        System.out.println("Digite a distância percorrida:");
        float distanciaPercorrida = input.nextFloat();

        Uni3Exe14 classeExec = new Uni3Exe14(tempoMinutos, distanciaPercorrida);
        float tempo = classeExec.velocidadeMediaDaViagem();
        float distancia = classeExec.quantidadeCombustivelGastoNaViagem();
        System.out.printf("A velocidade média da viagem foi %.2fKm/h e a quantidade de combustível gasto foi %.2f", tempo, distancia);
    
        input.close();
    }
}
