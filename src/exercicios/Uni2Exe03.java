package exercicios;

import java.util.Scanner;

public class Uni2Exe03 {
    public static void main(String[] args) {
        //Calcule a área da circunferência elevando o
        // valor de raio ao quadrado e multiplicando por π (π = 3.14159).

        double raio, area;
        final double pi = 3.14159;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o raio da circunferência:");
        raio = input.nextDouble();
        area = Math.pow(raio, 2) * pi;
        System.out.println("A área da circunferência é: " + String.format("%.2f", area));
        input.close();

    }
}
