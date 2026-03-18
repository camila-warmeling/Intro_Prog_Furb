package unidade3.exerciciosUni3;

import java.util.Scanner;

//No pé direito do frango há um anel com um chip de identificação; 
//no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. 
//Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50, 
//faça um programa para calcular o gasto total da granja para marcar todos os seus frangos.

public class Uni3Exe05 {

    private int quantGalinhas;

    public Uni3Exe05(int quantGalinhas){
        this.quantGalinhas = quantGalinhas;
    }

    public float calcularCustoTotalGranjaorGalinha(){
        float custoTotalGalinha = 4 + (2 * 3.5f);
        float custoTotalGranja = custoTotalGalinha * quantGalinhas;
        return custoTotalGranja;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de galinhas:");
        int quantGal = input.nextInt();

        Uni3Exe05 classeExec = new Uni3Exe05(quantGal);
        float custoGranja = classeExec.calcularCustoTotalGranjaorGalinha();
        System.out.println("O gasto total para a granja é de:" + custoGranja);;

        input.close();
    }

    

}
