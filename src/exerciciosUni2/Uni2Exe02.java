package exerciciosUni2;

import java.util.Scanner;

public class Uni2Exe02 {
    public static void main(String[] args) {
        int numero1, numero2, multiplicacao;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        numero1 = input.nextInt();
        System.out.println("Digite o segundo número:");
        numero2 = input.nextInt();
        multiplicacao = numero1*numero2;
        System.out.println("A multiplicação dos dois números é: " + multiplicacao);
        input.close();
    }
}
