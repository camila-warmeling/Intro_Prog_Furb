package exercicios;

import java.util.Scanner;

public class Uni2Exe02 {
    public static void main(String[] args) {
        int numero1, numero2, multiplicacao;

        Scanner usuario = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        numero1 = usuario.nextInt();
        System.out.println("Digite o segundo número:");
        numero2 = usuario.nextInt();
        multiplicacao = numero1*numero2;
        System.out.println("A multiplicação dos dois números é: " + multiplicacao);
        usuario.close();
    }
}
