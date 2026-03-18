package unidade3.exerciciosUni3;

import java.util.Scanner;

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
