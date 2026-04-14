package unidade4.exerciciosUni4;

import java.util.Scanner;

public class Uni4Exe25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        float valor1 = input.nextFloat();

        System.out.println("Digite o segundo valor:");
        float valor2 = input.nextFloat();

        System.out.println("Opção 1 - Somar os números \nOpção 2 - Subtrair os números \nOpção 3 - Multiplicar os números \nOpção 4 - Dividir os números");
        System.out.println("Digite a opção que você deseja:");
        int opcao = input.nextInt();

        switch (opcao){
            case 1: //somar
                System.out.println(valor1 + valor2);
                break;

            case 2: //subtrair
                System.out.println(valor1 - valor2);
                break;

            case 3: //multiplicar
                System.out.println(valor1 * valor2);
                break;

            case 4: //dividir se o denominador não for zero
                if (valor2 != 0) {
                    System.out.println(valor1 / valor2);
                }
                else{
                    System.out.println("O denominador não poder ser zero");
                }
                break;
           
            default:
                System.out.println("Opção Inválida!");
                break;
        }
        input.close();
    }
}
