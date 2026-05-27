package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe28 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int voto1NenhumDeNos = 0, voto2CPM22 = 0, voto3Skank = 0, voto4JotaQuest = 0;
        int novoVoto, totalVotos = 0, maisVotos;
        float voto1Porcentagem, voto2Porcentagem, voto3Porcentagem, voto4Porcentagem;
        String vencedor;
        char continuar = 'S';

        while(continuar == 'S'){
            novoVoto = 0;

            System.out.println("Conjuntos: \n 1 - Nenhum de nós\n 2 - CPM22\n 3 - Skank\n 4 - Jota Quest");
            System.out.println("Digite o voto:");
            novoVoto = input.nextInt();

            switch(novoVoto){
                case 1:
                    voto1NenhumDeNos ++;
                    totalVotos ++;
                    break;
                
                case 2:
                    voto2CPM22 ++;
                    totalVotos ++;
                    break;

                case 3:
                    voto3Skank ++;
                    totalVotos ++;
                    break;

                case 4:
                    voto4JotaQuest ++;
                    totalVotos ++;
                    break;

                default:
                    System.out.println("O voto digitado não existe!");
                    break;
            }

            System.out.println("mais um voto: s (SIM) / n (NÃO)?");
            continuar = input.next().toUpperCase().charAt(0);
        }

        voto1Porcentagem = (voto1NenhumDeNos * 100.0f) / totalVotos;
        voto2Porcentagem = (voto2CPM22 * 100.0f) / totalVotos;
        voto3Porcentagem = (voto3Skank * 100.0f) / totalVotos;
        voto4Porcentagem = (voto4JotaQuest * 100.0f) / totalVotos;

        maisVotos = voto1NenhumDeNos;
        vencedor = "Nenhum de Nós";

        if(voto2CPM22 > maisVotos){
            maisVotos = voto2CPM22;
            vencedor = "CPM22";
        }else if(voto3Skank > maisVotos){
            maisVotos = voto3Skank;
            vencedor = "Skank";
        }else if(voto4JotaQuest > maisVotos){
            maisVotos = voto4JotaQuest;
            vencedor = "Jota Quest";
        }

        System.out.printf("Quantidade de votos:\n Nenhum de Nós - %d\n CPM22  %d\n Skank - %d\n Jota Quest - %d \n", voto1NenhumDeNos, voto2CPM22, voto3Skank, voto4JotaQuest);
        System.out.printf("Porcentagem de votos:\n Nenhum de Nós - %.2f%%\n CPM22 - %.2f%%\n Skank - %.2f%%\n Jota Quest - %.2f%% \n", voto1Porcentagem, voto2Porcentagem, voto3Porcentagem, voto4Porcentagem);
        System.out.println("O vencedor é:" + vencedor);

        input.close();
    }
}
