package unidade6.exerciciosUni6;

import java.util.Scanner;

public class Uni6Exe04Vetor {

//Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos. Crie 
//um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições respectivas dos vetores 
//originais. Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. Exiba, ao final, os três 
//vetores na tela. Faça três métodos: um método para ler valores dos vetores, outro para somar e outro para 
//escrever os vetores.

    Scanner input = new Scanner(System.in);
    public int tamanho = 10;
    public int[] primeiro = new int [tamanho]; 
    public int[] segundo = new int [tamanho]; 
    public int[] soma = new int [tamanho]; 

    private Uni6Exe04Vetor(){
        receberNumeros();
        somarValores();
        mostrarValores();
    }

    private void receberNumeros(){
        for(int i=0; i<tamanho; i++){
            System.out.println("Digite o valor do primeiro vetor:");
            primeiro[i] = input.nextInt();
        }

        System.out.println("Agora vai começar o segundo vetor!");

        for(int i=0; i<tamanho; i++){
            System.out.println("Digite o valor do segundo vetor:");
            segundo[i] = input.nextInt();
        }
    }

    private void somarValores(){
        for(int i=0; i<tamanho; i++){
            soma[i] = primeiro[i] + segundo[i];
        }
    }

    private void mostrarValores(){
        System.out.print("Primeiro vetor: [");
        for(int i=0; i<tamanho-1; i++){
            System.out.print(primeiro[i]+",");
        }
        System.out.print(primeiro[9]);
        System.out.println("]");

        System.out.print("Segundo vetor: [");
        for(int i=0; i<tamanho-1; i++){
            System.out.print(segundo[i]+",");
        }
        System.out.print(segundo[9]);
        System.out.println("]");

        System.out.print("Terceiro vetor (soma): [");
        for(int i=0; i<tamanho-1; i++){
            System.out.print(soma[i]+",");
        }
        System.out.print(soma[9]);
        System.out.println("]");
    }

    public static void main(String[] args) {
        new Uni6Exe04Vetor();
    }
}