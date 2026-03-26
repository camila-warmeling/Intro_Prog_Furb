package unidade4.exerciciosUni4;

import java.util.Scanner;

//Dada uma pergunta, “a cor é azul?”, faça um programa que leia uma variável lógica 
//com a resposta e responda “Sim”, caso a resposta seja true, ou “Não”, caso seja false.

public class Uni4Exe05 {

    private boolean respostaUsuario;
    private String respostaCorreta;

    public Uni4Exe05(boolean respostaUsuario){
        this.respostaUsuario = respostaUsuario;
    }

    public String verificarResposta(){
        if (this.respostaUsuario){
            respostaCorreta = "Sim";
        }
        else{
            respostaCorreta = "Não";
        }
        return respostaCorreta;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("A cor é azul?");
        boolean resposta = input.nextBoolean();

        Uni4Exe05 classeExec = new Uni4Exe05(resposta);
        System.out.println(classeExec.verificarResposta());

        input.close();
    }
}
