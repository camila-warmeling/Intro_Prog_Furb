package unidade6.exerciciosUni6;

import java.util.ArrayList;
import java.util.Scanner;

public class Uni6Exe04ArrayList {

    Scanner input = new Scanner(System.in);
    public int tamanho = 10;
    public ArrayList<Integer> primeiro = new ArrayList<>(); 
    public ArrayList<Integer> segundo = new ArrayList<>(); 
    public ArrayList<Integer> soma = new ArrayList<>(); 

    private Uni6Exe04ArrayList(){
        receberNumeros();
        somarValores();
        mostrarValores();
    }

    private void receberNumeros(){
        for(int i=0; i<tamanho; i++){
            System.out.println("Digite o valor do primeiro vetor:");
            int valor = input.nextInt();
            primeiro.add(valor);
        }

        System.out.println("Agora vai começar o segundo vetor!");

        for(int i=0; i<tamanho; i++){
            System.out.println("Digite o valor do segundo vetor:");
            int valor = input.nextInt();
            segundo.add(valor);
        }
    }

    private void somarValores(){
        for(int i=0; i<tamanho; i++){
            soma.add(primeiro.get(i) + segundo.get(i));
        }
    }

    private void mostrarValores(){
        System.out.print("Primeiro vetor: [");
        for(int i=0; i<tamanho-1; i++){
            System.out.print(primeiro.get(i)+",");
        }
        System.out.print(primeiro.get(9));
        System.out.println("]");

        System.out.print("Segundo vetor: [");
        for(int i=0; i<tamanho-1; i++){
            System.out.print(segundo.get(i)+",");
        }
        System.out.print(segundo.get(9));
        System.out.println("]");

        System.out.print("Terceiro vetor (soma): [");
        for(int i=0; i<tamanho-1; i++){
            System.out.print(soma.get(i)+",");
        }
        System.out.print(soma.get(9));
        System.out.println("]");
    }

    public static void main(String[] args) {
        new Uni6Exe04ArrayList();
    }
}