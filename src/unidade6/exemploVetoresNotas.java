package unidade6;

import java.util.Scanner;

public class exemploVetoresNotas {
    public static void main(String[] args){
        //Ler 10 nomes
        //Ler 10 notas
        //Calcular a média de notas
    
        String nomes[] = new String[10];
        double notas[] = new double[10];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<10; i++){
            System.out.println("Digite o nome " + (i+1));
            nomes[i] = sc.nextLine();
            System.out.println("Digite a nota " + (i+1));
            notas[i] = Double.parseDouble(sc.nextLine());
            System.out.println(); //vai separar um aluno do outro visualmente no terminal
        
        }

        //calcular média
        double soma = 0;
        for(int i=0; i<10; i++){
            soma += notas[i];
        }
        double media = soma/10;
        System.out.println("A média é:" + media);

        sc.close();
    }
}
