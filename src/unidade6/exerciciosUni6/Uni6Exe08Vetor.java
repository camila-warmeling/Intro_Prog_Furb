package unidade6.exerciciosUni6;

import java.util.Scanner;

public class Uni6Exe08Vetor {
    public Scanner input = new Scanner(System.in);
    public int tamanho = 0;
    public double[] vetorNumeros;

    private Uni6Exe08Vetor() {
        solicitarTamanhoLista();
        vetorNumeros = new double[tamanho]; 
        solicitarDados();
        mostrarTabelaFrequencia();
    }

    private void solicitarTamanhoLista() {
        do {
            System.out.println("Digite o tamanho da lista (máximo 20):");
            tamanho = input.nextInt();
            if (tamanho <= 0 || tamanho > 20) {
                System.out.println("Tamanho inválido! Valor máximo: 20");
            }
        } while (tamanho <= 0 || tamanho > 20);
    }

    private void solicitarDados() {
        System.out.println("Digite os " + tamanho + " valores reais:");
        for(int i=0; i<tamanho; i++){
            System.out.print("Valor [" + i + "]: ");
            vetorNumeros[i] = input.nextDouble();
        }
    }

    private void mostrarTabelaFrequencia() {
        System.out.println("\nVALOR     | FREQUÊNCIA");
        System.out.println("---------------------");

        for (int i = 0; i < tamanho; i++) {
            double valorAtual = vetorNumeros[i];
            boolean numerosContados = false;

            for(int k = 0; k < i; k++){
                if (vetorNumeros[k] == valorAtual) {
                    numerosContados = true;
                    break;
                }
            }

            if(!numerosContados){
                int frequencia = 0;
                for (int j = 0; j < tamanho; j++) {
                    if (vetorNumeros[j] == valorAtual) {
                        frequencia++;
                    }
                }
                System.out.printf("%9.2f | %9d\n", valorAtual, frequencia);
            }
        }
    }

    public static void main(String[] args) {
        new Uni6Exe08Vetor();
    }
}
