package exerciciosUni2;

import java.util.Scanner;

public class Uni2Exe10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de segundos:");
        int tempoSegundos = input.nextInt();

        int horas = tempoSegundos/3600;
        int resto = tempoSegundos%3600;

        int minutos = resto/60;
        int segundos = resto%60;
        
        System.out.printf("A quantidade de horas, minutos e segundos é %d : %d : %d", horas, minutos, segundos);
        input.close();
    }
}
