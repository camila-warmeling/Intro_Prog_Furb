package unidade6.exerciciosUni6;

import java.util.Scanner;

public class Uni6Exe05Vetor {
    public Scanner input = new Scanner(System.in);
    public String[] perguntas = new String[]{
        "Gosta de música sertaneja?",
        "Gosta de futebol?",
        "Gosta de seriados?",
        "Gosta de redes sociais?",
        "Gosta da Oktoberfest?"
    };
    //perguntas.length retorna o tamanho do vetor perguntas
    public String[] rapaz = new String[perguntas.length]; 
    public String[] moca = new String[perguntas.length]; 

    private Uni6Exe05Vetor(){
        executarRespostas();
        mostrarResultadoAfinidade();
    }

    private void responderPerguntas(String[] vetorRespostas){
        for(int i=0; i<perguntas.length; i++){
            System.out.println(perguntas[i]);
            System.out.println("Digite a resposta(SIM, NÃO ou IND):");
            vetorRespostas[i] = input.next().toUpperCase();
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
        for(int i=0; i<perguntas.length; i++){
            if(rapaz[i].equals(moca[i])){
                afinidade += 3;
            }else if(rapaz[i].equals("IND") || moca[i].equals("IND")){
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
        new Uni6Exe05Vetor();
    }
}
