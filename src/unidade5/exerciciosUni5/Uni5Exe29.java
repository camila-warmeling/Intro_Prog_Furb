package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe29 {
//Cédulas de 1, 2, 5, 10 e 20. Faça um programa que leia um valor e informe a quantidade mínima de cédulas. 

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int valorRetirada, cedulas1 = 0, cedulas2 = 0, cedulas5 = 0, cedulas10 = 0, cedulas20 = 0;

        System.out.println("Digite o valor a ser retirado:");
        valorRetirada = input.nextInt();

        while(valorRetirada >= 20){
            cedulas20 ++;
            valorRetirada -= 20;
        }

        while(valorRetirada >= 10){
            cedulas10 ++;
            valorRetirada -= 10;
        }

        while(valorRetirada >= 5){
            cedulas5 ++;
            valorRetirada -= 5;
        }

        while(valorRetirada >= 2){
            cedulas2 ++;
            valorRetirada -= 2;
        }

        while(valorRetirada >= 1){
            cedulas1 ++;
            valorRetirada -= 1;
        }

        System.out.printf("Foi utilizado as seguintes cédulas:\n Cédulas de 1 - %d\n Cédulas de 2 - %d\n Cédulas de 5 - %d\n Cédulas de 10 - %d\n Cédulas de 20 - %d", cedulas1, cedulas2, cedulas5, cedulas10, cedulas20);

        input.close();
    }
}
