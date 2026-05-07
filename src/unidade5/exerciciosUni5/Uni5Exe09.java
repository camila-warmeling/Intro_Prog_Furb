package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe09 {

    Scanner input = new Scanner(System.in);
    private int quantAlunos, idade, alunos20anos;
    private String nome, alunos18anos = "\n";

    public Uni5Exe09(){
        receberNomeIdade();
        mostrarResultados();
    }

    public void receberNomeIdade(){
        System.out.println("Digite a quantidade de alunos:");
        quantAlunos = Integer.parseInt(input.nextLine());
        
        for(int i=1; i<=quantAlunos; i++){
            System.out.println("Digite o nome do aluno(a):");
            nome = input.nextLine();
            System.out.println("Digite a idade do aluno(a):");
            idade = Integer.parseInt(input.nextLine());
            
            if(idade == 18){
                alunos18anos += nome + "\n";//"nome, (espaço " ")nome, nome, "
            }else if(idade >= 20){
                alunos20anos ++;
            }
        }
    }

    public void mostrarResultados(){
        System.out.println("O nome dos alunos com 18 anos é: " + alunos18anos + "\nTem " + alunos20anos + " alunos com mais de 20 anos" );
    }

    public static void main(String[] args) {
        new Uni5Exe09();
    }
}
