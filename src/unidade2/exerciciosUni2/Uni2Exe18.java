package unidade2.exerciciosUni2;

import java.util.Scanner;

public class Uni2Exe18 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o comprimento da parede em metros:");
        double comprimento = (input.nextDouble());
        
        System.out.println("Digite a altura da parede em metros:");
        double altura = input.nextDouble();

        if (comprimento < 0 || altura < 0){
            System.out.println("Valores inválidos!");
        }

        else{
            double metrosQuadrados = comprimento * altura; //Math.ceil arredonda o número 
            double quantAzulejos = Math.ceil(metrosQuadrados * 9);
            double valorGasto = quantAzulejos * 12.50;

            System.out.println("O valor gasto para comprar os azulejos é de R$" + String.format("%.2f", valorGasto));
        }

        input.close();
    }
}
