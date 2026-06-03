package unidade6.exerciciosUni6;

import java.util.ArrayList;
import java.util.Scanner;

public class Uni6Exe02ArrayList {
//Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. 
//Imprima quais valores desses informados são maiores que a média dos valores. Faça um método para ler os
//valores, outro para calcular a média e outro para informar os valores maiores que a média.

    public Scanner input = new Scanner(System.in);
    public int tamanho = 12;
    public ArrayList<Double> numeros = new ArrayList<>();
    public double soma = 0, media;

    public Uni6Exe02ArrayList(){
        lerValores();
        calcularMedia();
        mostrarValoresMaioresMedia();
    }

    public void lerValores(){
        for(int i=0; i<tamanho; i++){
            System.out.println("Digite o primeiro valor:");
            double valor = input.nextDouble();
            numeros.add(valor);
        }
    }

    public void calcularMedia(){
        for(int i=0; i<tamanho; i++){
            soma += numeros.get(i);
        }
        media = soma/tamanho;
    }

    public void mostrarValoresMaioresMedia(){
        System.out.println("A média é:" + String.format("%.2f",media));
        for(int i=0; i<tamanho; i++){
            if(numeros.get(i) > media){
                System.out.println("O número "+numeros.get(i)+" é mais alto que a média.");
            }
        }
    }

    public static void main(String[] args) {
        new Uni6Exe02Vetor();
    }
}
