package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe33 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int novoVoto = 7, candidato1=0, candidato2=0, candidato3=0, candidato4=0, votoNulo=0, votoBranco=0;
        float porcentualVotoBrancoNulo=0;

        while(novoVoto != 0){
            System.out.println("1,2,3,4 - voto para o respectivo candidato \n5 - voto nulo \n6 - voto em branco \nDigite 0 para encerrar a votação.");
            System.out.println("Digite o voto:");
            novoVoto = input.nextInt();

            switch(novoVoto){
                case 1:
                    candidato1 ++;
                    break;
            
                case 2:
                    candidato2 ++;
                    break;

                case 3:
                    candidato3 ++;
                    break;

                case 4:
                    candidato4 ++;
                    break;

                case 5:
                    votoNulo ++;
                    break;

                case 6:
                    votoBranco ++;
                    break;

                case 0:
                    System.out.println("Fim da Votação!");
                    break;

                default:
                    System.out.println("Opção Incorreta!");
                    break;
            }
        }
        porcentualVotoBrancoNulo = ((votoBranco+votoNulo) * 100.0f)/(candidato1 + candidato2 + candidato3 + candidato4 + votoBranco + votoNulo);

        System.out.printf("Quantidade de votos:\n Candidato 1 - %d\n Candidato 2 - %d\n Candidato 3 - %d\n Candidato 4 - %d\n Votos Nulos - %d\n Votos Em Branco - %d \n", candidato1, candidato2, candidato3, candidato4,votoNulo, votoBranco);
        System.out.println("Os votos Nulo e em Branco são " + String.format("%.2f",porcentualVotoBrancoNulo) + "%");

        input.close();
    }
}
