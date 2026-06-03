package unidade6.exerciciosUni6;

import java.util.Scanner;

public class Uni6Exe05Vetor {
    private Scanner input = new Scanner(System.in);
    private String[] perguntas = new String[]{
        "Gosta de música sertaneja?",
        "Gosta de futebol?",
        "Gosta de seriados?",
        "Gosta de redes sociais?",
        "Gosta da Oktoberfest?"
    };

    //perguntas.length retorna o tamanho do vetor perguntas
    private String[] rapaz = new String[perguntas.length]; 
    private String[] moca = new String[perguntas.length]; 

    private void responderPerguntasRapaz(){
        for(int i=0; i<perguntas.length; i++){
            System.out.println(perguntas[i]);
            System.out.println("Digite SIM ou NAO ou IND");
            rapaz[i] = input.next();
        }
    }

    private void responderPerguntasMoca(){
        for(int i=0; i<perguntas.length; i++){
            System.out.println(perguntas[i]);
            System.out.println("Digite SIM ou NAO ou IND");
            moca[i] = input.next();
        }
    }


}
