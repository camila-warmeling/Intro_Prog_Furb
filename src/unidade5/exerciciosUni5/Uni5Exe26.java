package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe26 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float valorMax, valorPedagio, distanciaKm;
        int trechosPedagioNegado = 0, trechosInformados = 0, trechos150KmAceitos = 0;

        System.out.println("Digite o valor máximo permitido por Astolfo:");
        valorMax = input.nextFloat();
    
        System.out.println("Digite o valor do pedágio");
        valorPedagio = input.nextFloat();

        while(valorPedagio >= 0){
            System.out.println("Digite a distância(Km) do trecho:");
            distanciaKm = input.nextFloat();

            trechosInformados ++;

            if(valorPedagio > valorMax){
                trechosPedagioNegado ++;
            }else if(valorPedagio <= valorMax && distanciaKm > 150){
                trechos150KmAceitos ++;
            }

            System.out.println("Digite o valor do pedágio");
            valorPedagio = input.nextFloat();
        }

        System.out.printf("Astolfo se nega a pagar %d pedágios \nForam informados %d trechos \nTem %d trechos acima de 150Km que Astolfo aceita pagar.", trechosPedagioNegado, trechosInformados, trechos150KmAceitos);

        input.close();
    }
}
