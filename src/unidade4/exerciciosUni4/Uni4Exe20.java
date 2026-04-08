package unidade4.exerciciosUni4;

import java.util.Scanner;

public class Uni4Exe20 {

    Scanner input = new Scanner(System.in);
    private float notaProva1, notaProva2, notaProva3, notaMediaExercicios, mediaAproveitamento;
    private String conceitoAluno, aprovacaoAluno;
    private boolean notaInvalida;

    public Uni4Exe20(){
        obterNotas();
        calcularMediaDasNotas();
        if(notaInvalida){
            mostrarResultados();
            return;
        }
        verificarConceitoAluno();
        verificarAlunoAprovadoReprovado();
        mostrarResultados();
    } 

    public void obterNotas(){
        System.out.println("Digite a nota da prova 1:");
        notaProva1 = input.nextFloat();

        System.out.println("Digite a nota da prova 2:");
        notaProva2 = input.nextFloat();

        System.out.println("Digite a nota da prova 3:");
        notaProva3 = input.nextFloat();

        System.out.println("Digite a nota da Media de Exercícios:");
        notaMediaExercicios = input.nextFloat();
    }

    public void calcularMediaDasNotas(){
        if(notaProva1 >=0 && notaProva2 >=0 && notaProva3 >=0 && notaMediaExercicios >=0 )
            mediaAproveitamento = (notaProva1 + notaProva2*2 + notaProva3*3 + notaMediaExercicios)/7;
        else{
            notaInvalida = true;
        }
    }

    public void verificarConceitoAluno(){
        if(mediaAproveitamento >= 9){
            conceitoAluno = "A";
        }
        else if(mediaAproveitamento >= 7.5f){
            conceitoAluno = "B";
        }
        else if(mediaAproveitamento >= 6){
            conceitoAluno = "C";
        }
        else if(mediaAproveitamento >= 4){
            conceitoAluno = "D";
        }
        else{
            conceitoAluno = "E";
        }
    }

    public void verificarAlunoAprovadoReprovado(){
        if(conceitoAluno == "A" || conceitoAluno == "B" || conceitoAluno == "C"){
            aprovacaoAluno = "Aprovado";
        }
        else{
            aprovacaoAluno = "Reprovado";
        }
    }

    public void mostrarResultados(){
        if(notaInvalida){
            System.out.println("Dados Inválidos!");  
        }
        else{
            System.out.printf("Média de Aproveitamento: %.2f \nConceito: %s \nAprovação: %s", mediaAproveitamento, conceitoAluno, aprovacaoAluno);
        }
    }

    public static void main(String[] args) {
        new Uni4Exe20();
    }
}
