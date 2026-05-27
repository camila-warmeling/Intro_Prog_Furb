package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe25 {

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        int pontoD = 0, pontoE = 0, diferencaPontos = 0;
        char pontoJogada;
        String ganhador = "";

        while(diferencaPontos < 2){
            pontoJogada = ' ';
            System.out.println("Digite quem ganhou o ponto:");
            pontoJogada = input.next().toUpperCase().charAt(0);

            switch (pontoJogada){
                case 'D':
                    pontoD ++;
                    break;
            
                case 'E':
                    pontoE ++;
                    break;

                default:
                    System.out.println("Letra digitada incorreta!");
                    break;
            }

            if(pontoD >= 21 || pontoE >= 21){
                if(pontoD > pontoE){
                    diferencaPontos = pontoD - pontoE;
                    ganhador = "Direito";
                }
                else{
                    diferencaPontos = pontoE - pontoD;
                    ganhador = "Esquerdo";
                }
            }
            
        }

        System.out.println("O ganhador é o jogador do lado "+ganhador);

        input.close();
    }
}
