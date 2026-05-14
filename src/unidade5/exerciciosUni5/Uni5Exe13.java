package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantParadas;
        float kmParada, combGasto, kmPorLitro, kmTotal = 0, litrosTotal = 0, kmMediaPorLitro;

        System.out.println("Digite a quantidade de paradas:");
        quantParadas = input.nextInt();

        for(int i=1; i<=quantParadas; i++){
            System.out.println("Digite a quantidade de km percorridos da parada " + i);
            kmParada = input.nextFloat();
            System.out.println("Digite a quantidade de combustível em litros gastos da parada " + i);
            combGasto = input.nextFloat();

            kmPorLitro = kmParada / combGasto;
            System.out.println("Na parada " + i + " foi feito uma media de " + kmPorLitro + " km por litro.");

            kmTotal += kmParada;
            litrosTotal += combGasto;
        } 
        kmMediaPorLitro = kmTotal/litrosTotal;
        System.out.println("A media de km por litros feita na viagem foi: " + String.format("%.2f", kmMediaPorLitro));
    
        input.close();
    }  
}
