package exercicios;

import java.util.Scanner;

public class Uni2Exe06 {
    public static void main(String[] args) {
        //Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
        // o valor que recebe por hora e calcula o salário desse funcionário. 
        // A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
    
        float horasTrabalhadas, valorHora, salario;
        int numeroFuncionario;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número do funcionário:");
        numeroFuncionario = input.nextInt();

        System.out.print("Digite a quantidade de horas trabalhadas:");
        horasTrabalhadas = input.nextFloat();

        System.out.print("Digite o valor da hora trabalhada:");
        valorHora = input.nextFloat();

        salario = horasTrabalhadas * valorHora;

        System.out.printf("O funcionário de número %03d" + " recebeu o salário no valor de R$ %.2f" + " pelas quantidade de horas trabalhadas %.1f", numeroFuncionario, salario, horasTrabalhadas);
        //printf para utilizar várias variáveis no meio das strings
        input.close();
    }
}
