package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe26 {
//Faça um programa que leia inicialmente o valor do pedágio ao qual Astolfo se nega a pagar. A seguir 
//leia várias duplas de valores representando respectivamente o custo do pedágio e a distância (em Km) 
//do trecho. Calcular e escrever: quantos trechos da viagem possuem um valor de pedágio acima do qual 
//Astolfo nega­se a pagar;
//quantos trechos foram informados;
//quantos trechos acima de 150Km de distância possuem um valor de pedágio que Astolfo concorda em pagar.
//OBS: O programa será encerrado ao ser fornecido um valor de pedágio negativo. Neste caso a leitura da 
//distância não deve ser executada. Os resultados devem ser impressos no final do programa.
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
