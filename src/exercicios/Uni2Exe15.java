package exercicios;

import java.util.Scanner;

public class Uni2Exe15 {
    public static void main(String[] args) {
        //Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. 
        //A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. 
        //As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. 
        //A seguir mostre a relação de notas necessárias.

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor total");
        double valorTotal = input.nextDouble();

        int valorInteiro = (int)valorTotal;
        double valorDouble = valorTotal - valorInteiro;
        int valorCentavos = (int) (valorDouble * 100);

        int nota100 = valorInteiro/100;
        int restoNota = valorInteiro%100;

        int nota50 = restoNota/50;
        restoNota = restoNota%50;

        int nota20 = restoNota/20;
        restoNota = restoNota%20;

        int nota10 = restoNota/10;
        restoNota = restoNota%10;

        int nota5 = restoNota/5;
        restoNota = restoNota%5;

        int nota2 = restoNota/2;
        restoNota = restoNota%2;

        int moeda1 = restoNota/1;

        int moeda50 = valorCentavos/50;
        int restoMoeda = valorCentavos%50;

        int moeda25 = restoMoeda/25;
        restoMoeda = restoMoeda%25;

        int moeda10 = restoMoeda/10;
        restoMoeda = restoMoeda%10;

        int moeda5 = restoMoeda/5;
        restoMoeda = restoMoeda%5;

        int moeda01 = restoMoeda/1;

        System.out.printf("O valor %.2f pode ser decomposto em: %n" + 
        " %d notas de 100 %n %d notas de 50 %n %d notas de 20 %n %d notas de 10 %n %d notas de 5 %n %d notas de 2 %n" +
        " %d moedas de 1 %n %d moedas de 0,50 %n %d moedas de 0,25 %n %d moedas de 0,10 %n %d moedas de 0,05%n %d moedas de 0,01",
        valorTotal, nota100, nota50, nota20, nota10, nota5, nota2, moeda1, moeda50, moeda25, moeda10, moeda5, moeda01);

        input.close();
    }
}
