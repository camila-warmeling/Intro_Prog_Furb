package unidade6.exerciciosUni6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uni6Exe05ArrayList {
    public Scanner input = new Scanner(System.in);
    public ArrayList<String> perguntas  = new ArrayList<>(List.of( 
        "Gosta de música sertaneja?",
        "Gosta de futebol?",
        "Gosta de seriados?",
        "Gosta de redes sociais?",
        "Gosta da Oktoberfest?"
    ));
    public ArrayList<String> rapaz = new ArrayList<>(); 
    public ArrayList<String> moca = new ArrayList<>(); 

    private Uni6Exe05ArrayList(){
        executarRespostas();
        mostrarResultadoAfinidade();
    }

    private void responderPerguntas(ArrayList<String> listaRespostas){
        for(int i=0; i<perguntas.size(); i++){
            System.out.println(perguntas.get(i));
            System.out.println("Digite a resposta(SIM, NÃO ou IND):");
            String resposta = input.next().toUpperCase();
            listaRespostas.add(resposta);
        }
    }

    private void executarRespostas(){
        System.out.println("RESPOSTAS RAPAZ");
        responderPerguntas(rapaz);

        System.out.println("REPOSTAS MOÇA");
        responderPerguntas(moca);
    }

    private int calcularAfinidade(){
        int afinidade = 0;
        for(int i=0; i<perguntas.size(); i++){
            if(rapaz.get(i).equals(moca.get(i))){
                afinidade += 3;
            }else if(rapaz.get(i).equals("IND") || moca.get(i).equals("IND")){
                afinidade ++;
            }else{
                afinidade -= 2;
            }
        }
        return afinidade;
    }

    private void mostrarResultadoAfinidade(){
        int numAfinidade = calcularAfinidade();
        if(numAfinidade == 15){
            System.out.println("Casem!");
        }else if(numAfinidade >= 10){
            System.out.println("Vocês têm muita coisa em comum!");
        }else if(numAfinidade >= 5){
            System.out.println("Talvez não dê certo :(");
        }else if(numAfinidade >= 0){
            System.out.println("Vale um encontro.");
        }else if(numAfinidade >= -9){
            System.out.println("Melhor não perder tempo");
        }else{
            System.out.println("Vocês se odeiam!");
        }
    }

    public static void main(String[] args) {
        new Uni6Exe05ArrayList();
    }
}
