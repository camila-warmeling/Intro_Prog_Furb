package unidade2.exerciciosUni2;

import java.util.Scanner;

public class Uni2Exe17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário:");
        String nome = input.nextLine();

        System.out.println("Digite a quantidade de horas trabalhadas:");
        double horasTrabalhadas = input.nextDouble();

        System.out.println("Digite o número de dependentes:");
        double dependentes = input.nextInt();

        if (horasTrabalhadas < 0 || dependentes < 0){
            System.out.println("Valores inválidos!");
        }

        else{
            double salarioHoras = horasTrabalhadas * 10;
            double salarioDependentes = dependentes * 60;
            double salarioBruto = salarioHoras + salarioDependentes;

            double descontoINSS = salarioHoras * 0.085;
            double descontoIR = salarioHoras * 0.05;
            double salarioLiquido = salarioBruto - descontoINSS - descontoIR;

            System.out.printf("O funcionário %s teve:%nSalário bruto: R$%.2f %nSalário líquido: R$%.2f", nome, salarioBruto, salarioLiquido);
        }
        
        input.close();
    }
}
