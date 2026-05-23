package unidade5.exerciciosUni5;

import java.util.Locale;
import java.util.Scanner;

public class Uni5Exe20 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useLocale(Locale.US);;
        double massaInicial, massaFinal;
        int tempo = 0, segundos = 00, minutos = 00, horas = 00;

        System.out.println("Digite a massa inicial:");
        massaInicial = input.nextDouble();

        massaFinal = massaInicial;
        
        while (massaFinal >= 0.0005){
            massaFinal /= 2;
            tempo += 50;    
        }

        horas = tempo/3600;
        minutos = (tempo%3600)/60;
        segundos = tempo%60;

        System.out.printf("Massa Inicial: %fkg\nMassa Final: %fkg\nTempo: %d:%d:%d", massaInicial, massaFinal, horas, minutos, segundos);

        input.close();
    }
}
