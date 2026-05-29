package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe32 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int diaSemana, quantDias, colunaAtual = 1;

        System.out.println("Qual dia da semana cai o primeiro dia do mês?");
        System.out.println("1 - Domingo \n2 - Segunda \n3 - Terça \n4 - Quarta \n5 - Quinta \n6 - Sexta \n7 - Sábado");
        diaSemana = input.nextInt();
        System.out.println("Quantos dias tem o mês?");
        quantDias = input.nextInt();

        System.out.println(" --- --- --- --- --- --- ---  ");
        System.out.println("| D | S | T | Q | Q | S | S |");
        System.out.println(" --- --- --- --- --- --- ---  ");

        if (diaSemana > 1) {
            System.out.print("|");
            while (colunaAtual < diaSemana) {
                System.out.print("   |"); 
                colunaAtual++;
            }
        }
        
        for (int dia = 1; dia <= quantDias; dia++) {

            if (colunaAtual == 1) {
                System.out.print("|");
            }

            System.out.printf("%2d |", dia); 

            if (colunaAtual == 7) {
                System.out.println();
                colunaAtual = 1;    
            } else {
                colunaAtual++;        
            }
        }

        if (colunaAtual != 1) {
            while (colunaAtual <= 7) {
                System.out.print("   |");
                colunaAtual++;
            }
            System.out.println();
        }

        System.out.println(" --- --- --- --- --- --- ---  ");

        input.close();
    }
}