package unidade6.exerciciosUni6;

import java.util.Scanner;

public class Uni6Exe01 {
//Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor de 10 posições do tipo 
//inteiro. Escreva na ordem inversa em que foram lidos. Faça um método para ler e outro para escrever.

    Scanner input = new Scanner(System.in);
    public int[] numeros = new int [10];

    public Uni6Exe01(){
        lerDados();
        mostrarNumerosInverso();
    }

    public void lerDados(){
        for(int i=0; i<10; i++){
            System.out.println("Digite o " + (i+1) + "º número");
            numeros[i] = input.nextInt();
        }
    }

    public void mostrarNumerosInverso(){
        for(int i=9; i>=0; i--){
            System.out.println(numeros[i]);
        }
    }

    public static void main(String[] args) {
        new Uni6Exe01();
    }
}
