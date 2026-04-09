package unidade4.exerciciosUni4;

import java.util.Scanner;

public class Uni4Exe22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1 – Ciência da Computação, \n2 – Licenciatura da Computação \n3 – Sistemas de Informação");
        System.out.println("Digite o numero da opção que você deseja:");
        int opcaoAluno = input.nextInt();

        switch (opcaoAluno){
            case 1:
                System.out.println("Bacharel em Ciência da Computação!");
                break;
            
            case 2:
                System.out.println("Licenciado em Computação!");
                break;
            
            case 3:
                System.out.println("Bacharel em Sistemas de Informação!");
                break;

            default:
                System.out.println("Dados inválidos!");
                break;
        }
        input.close();
    }
}
