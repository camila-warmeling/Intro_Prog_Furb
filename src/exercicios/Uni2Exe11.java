package exercicios;

import java.util.Scanner;

public class Uni2Exe11 {
    public static void main(String[] args) {
        //Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
        //Em seguida, calcule e mostre:
        //a) a área do triângulo retângulo que tem A por base e C por altura.
        //b) a área do círculo de raio C. (pi = 3.14159).
        //c) a área do trapézio que tem A e B por bases e C por altura.
        //d) a área do quadrado que tem lado B.
        //e) a área do retângulo que tem lados A e B.

        double valorA, valorB, valorC;
        final double pi = 3.14159;

        Scanner input = new Scanner (System.in);

        System.out.println("Digite o primeiro valor:");
        valorA = input.nextDouble();
        valorA = Math.round(valorA * 100.0)/100.0; //vai deixar somente com dois números após a vírgula

        System.out.println("Digite o segundo valor:"); 
        valorB = input.nextDouble();
        valorB = Math.round(valorB * 100.0)/100.0; //tem que ser obrigatoriamente 100.0 por causa da vírgula

        System.out.println("Digite o terceiro valor:");
        valorC = input.nextDouble();
        valorC = Math.round(valorC * 100.0)/100.0; //caso coloque 100 vai tirar a vŕgula fora e ficar inteiro

        double areaTriangulo = (valorA * valorC)/2;
        double areaCirculo = (Math.pow(valorC, 2)) * pi;
        double areaTrapezio = ((valorA + valorB)*valorC) / 2 ;
        double areaQuadrado = Math.pow(valorB, 2);
        double areaRetangulo = valorA * valorB;

        System.out.printf("A área do Triângulo é %.2f %n" + "A área do Circulo é %.2f %n" +  
        "A área do Trapézio é %.2f %n" +  "A área do Quadrado é %.2f %n" +  "A área do Retângulo é %.2f %n",
        areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);
        
        input.close();
    }
}
