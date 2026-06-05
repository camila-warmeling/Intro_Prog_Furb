package unidade6.exerciciosUni6;

import java.util.Scanner;

public class Uni6Exe06Vetor {

    public Scanner input = new Scanner(System.in);
    public double[] vetorNumeros;
    public int tamanho;
    public double numProcurar;

    private Uni6Exe06Vetor(){
        solicitarDados();
        mostrarResultado();
    }


    public void solicitarDados(){
        System.out.println("Digite a quantidade de números que deseja:");
        tamanho = input.nextInt();
        vetorNumeros = new double[tamanho];

        for(int i=0; i<tamanho; i++){
            System.out.println("Digite um número:");
            vetorNumeros[i] = input.nextDouble();
        }
    }

    private boolean procurarNumeroLista(){
        System.out.println("Qual valor deseja procurar?");
        numProcurar = input.nextDouble();
        boolean numEncontrado = false;

        for(int i=0; i<tamanho; i++){
            double valor = vetorNumeros[i];
            if(valor == numProcurar){
                numEncontrado = true;
            }
        }
        return numEncontrado;
    }

    private void mostrarResultado(){
        boolean num = procurarNumeroLista();
        if(num == true){
            System.out.println("O número " + numProcurar + " foi encontrado no vetor");
        }else{
            System.out.println("O número " + numProcurar + " não foi encontrado no vetor");
        }
    }

    public static void main(String[] args) {
        new Uni6Exe06Vetor();
    }
}
