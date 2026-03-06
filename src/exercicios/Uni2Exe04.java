package exercicios;

import java.util.Scanner;

public class Uni2Exe04 {
    public static void main(String[] args) {
        //Leia dois valores de ponto flutuante e calcule a média ponderada sabendo que:
        // a nota A tem peso 3.5 e nota B 7.5 (a soma dos pesos é 11)
        // sendo que a nota vai de 0.0 a 10.0.
        double nota1, nota2, mediaPonderada;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        nota1 = input.nextFloat();
        System.out.println("Digite a segunda nota:");
        nota2 = input.nextFloat();

        mediaPonderada = (nota1 * 3.5 + nota2 * 7.5)/11;
        System.out.println("A média ponderada final é: " + mediaPonderada);
        input.close();
    }
}
