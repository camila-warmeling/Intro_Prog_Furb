package exercicios;

import java.util.Scanner;

public class Uni2Exe14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor total");
        int valor = input.nextInt();

        int nota100 = valor/100;
        int resto = valor%100;

        int nota50 = resto/50;
        resto = resto%50;

        int nota20 = resto/20;
        resto = resto%20;

        int nota10 = resto/10;
        resto = resto%10;

        int nota5 = resto/5;
        resto = resto%5;

        int nota2 = resto/2;
        resto = resto%2;

        int nota1 = resto/1;

        System.out.printf("O valor %d pode ser decomposto em: %n" + 
        " %d notas de 100 %n %d notas de 50 %n %d notas de 20 %n %d notas de 10 %n %d notas de 5%n %d notas de 2 %n %d notas de 1", 
        valor, nota100, nota50, nota20, nota10, nota5, nota2, nota1);

        input.close();
    }
}
