package unidade2.exerciciosUni2;

import java.util.Scanner;

public class Uni2Exe03 {
    public static void main(String[] args) {

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
