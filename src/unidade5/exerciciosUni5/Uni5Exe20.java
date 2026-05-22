package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe20 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double massaInicial, massaFinal;
        int segundos = 00, minutos = 00, horas = 00;

        System.out.println("Digite a massa inicial:");
        massaInicial = input.nextDouble();

        massaFinal = massaInicial;
        
        while (massaFinal > 0.0005){
            massaFinal /= 2;
            segundos += 50;    
        }

        horas = segundos/3600;
        minutos = (segundos%3600)/60;
        segundos = segundos%60;

        System.out.printf("Massa Inicial: %.3fkg\nMassa Final: %.3fkg\nTempo: %d:%d:%d", massaInicial, massaFinal, horas, minutos, segundos);

        input.close();
    }
}
