package unidade6.exerciciosUni6;

import java.util.Scanner;

public class Uni6Exe07Vetor {
    public Scanner input = new Scanner(System.in);
    public int[] vetorNumeros;
    public int[] vetorOrdenado;
    int tamanho = 0;

    private Uni6Exe07Vetor(){
        criarVetor();
        solicitarNumerosParaVetor();
        criarCopiaVetor();
        ordenarVetor();
        mostrarVetores();
    }

    private int solicitarTamanhoVetor(){
        do{
            System.out.println("Digite o tamanho do vetor:");
            tamanho = input.nextInt();
            if(tamanho > 20){
                System.out.println("Tamanho inválido! Valor máximo: 20");
            }
        }while(tamanho > 20);

        return tamanho;
    }

    public void criarVetor(){
        int tamanho = solicitarTamanhoVetor();
        vetorNumeros = new int[tamanho];
    }

    private void solicitarNumerosParaVetor(){
        for(int i=0; i<tamanho; i++){
            System.out.println("Digite um número:");
            int numero = input.nextInt();
            boolean numeroEncontrado = procurarNumeroVetor(numero);
            if(numeroEncontrado == false){
                vetorNumeros[i] = numero;
                System.out.println("O número " + numero + " foi adicionado com sucesso!");
            }else{
                System.out.println("O número " + numero + " já existe no vetor, tente novamente!");
                i--;
            }
        }
    }

    private boolean procurarNumeroVetor(int numProcurar){
        boolean numEncontrado = false;

        for(int i=0; i<vetorNumeros.length; i++){
            if(vetorNumeros[i] == numProcurar){
                numEncontrado = true;
                break;
            }
        }
        return numEncontrado;
    }

    private void criarCopiaVetor(){
        vetorOrdenado = new int[tamanho];
        for(int i=0; i<tamanho; i++){
            int numero = vetorNumeros[i];
            vetorOrdenado[i] = numero;
        }
    }

    private void ordenarVetor(){
        int variavelTemporaria;
        for(int i=0; i<tamanho-1; i++){
            if(vetorOrdenado[i]>vetorOrdenado[i+1]){
                variavelTemporaria = vetorOrdenado[i];
                vetorOrdenado[i] = vetorOrdenado[i+1];
                vetorOrdenado[i+1] = variavelTemporaria;

                i = -1;
            }
        }
    }

    private void mostrarVetores(){
        System.out.print("Vetor inicial: [");
        for(int i=0; i<tamanho-1; i++){
            System.out.print(vetorNumeros[i]+",");
        }
        System.out.print(vetorNumeros[tamanho-1]);
        System.out.println("]");

        System.out.print("Vetor ordenado: [");
        for(int i=0; i<tamanho-1; i++){
            System.out.print(vetorOrdenado[i]+",");
        }
        System.out.print(vetorOrdenado[tamanho-1]);
        System.out.println("]");
    }

    public static void main(String[] args) {
        new Uni6Exe07Vetor();
    }
}
