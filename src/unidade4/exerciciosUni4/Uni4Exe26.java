package unidade4.exerciciosUni4;

import java.util.Scanner;

public class Uni4Exe26 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Opção T - Calcular a área de um triângulo \nOpção Q - calcular a área de um quadrado \nOpção R - calcular a área de um retângulo \nOpção C - calcular a área de um círculo");
        System.out.println("Digite a opção que você deseja:");
        char opcao = input.next().toUpperCase().charAt(0);

        switch (opcao){
            case 'T': //calcular a área de um triângulo de base b e altura h
                System.out.println("Digite a base:");
                float base = input.nextFloat();
                System.out.println("Digite a altura:");
                float altura = input.nextFloat();
                System.out.println((base*altura)/2);
                break;

            case 'Q': //calcular a área de um quadrado de lado l
                System.out.println("Digite o lado:");
                float lado = input.nextFloat();
                System.out.println(Math.pow(lado, 2));
                break;

            case 'R': //calcular a área de um retângulo de base b e altura h
                System.out.println("Digite a base:");
                float b = input.nextFloat();
                System.out.println("Digite a altura:");
                float h = input.nextFloat();
                System.out.println(b*h);
                break;

            case 'C': //calcular a área de um círculo de raio r
                System.out.println("Digite o raio:");
                float raio = input.nextFloat();
                System.out.println(Math.PI * Math.pow(raio, 2));
                break;
           
            default:
                System.out.println("Opção Inválida!");
                break;
        }
        input.close();
    }
}
