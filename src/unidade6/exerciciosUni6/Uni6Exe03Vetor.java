package unidade6.exerciciosUni6;

import java.util.Scanner;

public class Uni6Exe03Vetor {

    public int tamanho = 12;
    public double[] valores = new double[tamanho];
    public Scanner input = new Scanner(System.in);

    private Uni6Exe03Vetor(){

    }

    private void lerValores(){
        for(int i=0; i<tamanho; i++){
            System.out.println("Digite o valor:");
            valores[i] = input.nextDouble();
        }
    }

    private void alterarValores(){
        for(int i=0; i<tamanho; i++){
            if(i % 2 == 0){
                //par aumenta o valor em 2%
                valores[i] *= 1.02;
            }else{
                //impar aumenta o valor em 5%
                valores[i] *= 1.05;
            }
        }
    }

    private void imprimir(){
        for(int i=0; i<tamanho; i++){
            System.out.println("Posição "+i+" valor: " + String.format("%.2f",valores[i]));
        }
    }

    public static void main(String[] args) {
        Uni6Exe03Vetor exec03 = new Uni6Exe03Vetor();
        exec03.lerValores();
        exec03.alterarValores();
        exec03.imprimir();
    }
}
