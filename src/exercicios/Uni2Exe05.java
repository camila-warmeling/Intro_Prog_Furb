package exercicios;

import java.util.Scanner;

public class Uni2Exe05 {
    public static void main(String[] args) {
        //Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a 
        // diferença do produto de A e B pelo produto de C e D segundo a fórmula: 
        // DIFERENCA = (A * B - C * D).
        int valorA, valorB, valorC, valorD, diferenca;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        valorA = input.nextInt();

        System.out.println("Digite o valor de B:");
        valorB = input.nextInt();

        System.out.println("Digite o valor de C:");
        valorC = input.nextInt();

        System.out.println("Digite o valor de D:");
        valorD = input.nextInt();

        diferenca = (valorA * valorB) - (valorC * valorD);

        System.out.println("A diferença entre AxB e CxD é: " + diferenca);
        input.close();
    }
}
