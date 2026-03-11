package exerciciosUni2;

import java.util.Scanner;

public class Uni2Exe04 {
    public static void main(String[] args) {

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
