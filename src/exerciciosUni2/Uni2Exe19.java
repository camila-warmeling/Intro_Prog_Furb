package exerciciosUni2;

import java.util.Scanner;

public class Uni2Exe19 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor B:");
        double valorB = input.nextDouble();

        System.out.println("Digite o valor C:");
        double valorC = input.nextDouble();

        System.out.println("Digite o valor D:");
        double valorD = input.nextDouble();

        System.out.println("O valor de A é: " + valorB);

        input.close();
    }
}
