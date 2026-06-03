package unidade6.exerciciosUni6;

import java.util.Scanner;

public class Uni6Exe02Vetor {

    public Scanner input = new Scanner(System.in);
    public int tamanho = 12;
    public double numeros[] = new double[tamanho];
    public double soma = 0, media;

    private Uni6Exe02Vetor(){
        lerValores();
        calcularMedia();
        mostrarValoresMaioresMedia();
    }

    private void lerValores(){
        for(int i=0; i<tamanho; i++){
            System.out.println("Digite o primeiro valor:");
            numeros[i] = input.nextDouble();
        }
    }

    private void calcularMedia(){
        for(int i=0; i<tamanho; i++){
            soma += numeros[i];
        }
        media = soma/tamanho;
    }

    private void mostrarValoresMaioresMedia(){
        System.out.println("A média é:" + String.format("%.2f",media));
        for(int i=0; i<tamanho; i++){
            if(numeros[i] > media){
                System.out.println("O número "+numeros[i]+" é mais alto que a média.");
            }
        }
    }

    public static void main(String[] args) {
        new Uni6Exe02Vetor();
    }
}
