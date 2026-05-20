package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe15 {

//nome e nota de duas provas descreva um algoritmo para informar a média de cada aluno. Considere que a 
//leitura dos dados deve ser finalizada quando o nome do aluno for “fim”.

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String nome = "";
        float nota1, nota2, media;

        //recebe o primeiro nome de aluno
        System.out.println("Digite o nome do primeiro aluno:"); 
        nome = input.nextLine();
    
        while (!nome.equalsIgnoreCase("fim")) {
            System.out.println("Digite a primeira nota:");
            nota1 = Float.parseFloat(input.nextLine());
            System.out.println("Digite a segunda nota:");
            nota2 = Float.parseFloat(input.nextLine());

            media = (nota1+nota2)/2;
            System.out.println("O aluno " + nome + " ficou com media " + media);

            System.out.println("Digite fim para finalizar");

            //pedindo o nome no final, quando digitar fim o looping vai acabar sem pedir as notas daquele aluno
            System.out.println("Digite o nome do próximo aluno:"); 
            nome = input.nextLine();
        }

        input.close();
    }

}
