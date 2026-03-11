package exerciciosUni2;

import java.util.Scanner;

public class Uni2Exe19 {
    public static void main(String[] args) {
        //Num sistema de equações o valor de A equivale ao valor de B e o valor de C equivale ao valor de D. 
        //Leia os valores de B, C e D e calcule o valor de A.

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
