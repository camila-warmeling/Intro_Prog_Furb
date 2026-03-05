package exercicios;

import java.util.Scanner;

public class Uni2Exe05 {
    public static void main(String[] args) {
        //Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a 
        // diferença do produto de A e B pelo produto de C e D segundo a fórmula: 
        // DIFERENCA = (A * B - C * D).
        int valorA, valorB, valorC, valorD, diferenca;

        Scanner usuario = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        valorA = usuario.nextInt();

        System.out.println("Digite o valor de B:");
        valorB = usuario.nextInt();

        System.out.println("Digite o valor de C:");
        valorC = usuario.nextInt();

        System.out.println("Digite o valor de D:");
        valorD = usuario.nextInt();

        diferenca = (valorA * valorB) - (valorC * valorD);

        System.out.println("A diferença entre AxB e CxD é: " + diferenca);
        usuario.close();
    }
}
