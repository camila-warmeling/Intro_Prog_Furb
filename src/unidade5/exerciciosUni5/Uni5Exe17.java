package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe17 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int numInscricao, numAtletaBaixo = 0, numAtletaAlto = 0, quantAletas = 0;
        float alturaAtleta, somaAlturas = 0, mediaAlturas, altAtletaBaixo = 0, altAtletaAlto = 0;

        System.out.println("Digite o número de inscrição:");
        numInscricao = Integer.parseInt(input.nextLine());

        while(numInscricao != 0){
            System.out.println("Digite a altura do atleta:");
            alturaAtleta = Float.parseFloat(input.nextLine());
            quantAletas ++;
            somaAlturas += alturaAtleta;

            if(quantAletas == 1){
                numAtletaAlto = numInscricao;
                altAtletaAlto = alturaAtleta;

                numAtletaBaixo = numInscricao;
                altAtletaBaixo = alturaAtleta;
            }else{
                if(alturaAtleta > altAtletaAlto){
                    numAtletaAlto = numInscricao;
                    altAtletaAlto = alturaAtleta;
                }else if(alturaAtleta < altAtletaBaixo){
                    numAtletaBaixo = numInscricao;
                    altAtletaBaixo = alturaAtleta;
                }
            }

            System.out.println("Digite o número de inscrição:");
            numInscricao = Integer.parseInt(input.nextLine());
        }

        mediaAlturas = somaAlturas/quantAletas;
        System.out.printf("O atleta mais alto:\n Número de Inscrição: %d \n Altura: %.2f\n", numAtletaAlto, altAtletaAlto);
        System.out.printf("O atleta mais baixo:\n Número de Inscrição: %d \n Altura:%.2f\n", numAtletaBaixo, altAtletaBaixo);
        System.out.printf("A média de altura dos %d atletas é %.2f m", quantAletas, mediaAlturas);

        input.close();
    }
}
