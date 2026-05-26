package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe24 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        //        kg        gramas        kg
        float pesoLimite, pesoPeixe, pesoTotalPesca = 0;
        char prosseguir = 's';

        System.out.println("Qual o peso(Kg) do limite diário de pesca?");
        pesoLimite = input.nextFloat();

        while ((prosseguir == 's' || prosseguir =='S') && pesoLimite >= pesoTotalPesca) {
            System.out.println("Digite o peso do peixe em gramas:");
            pesoPeixe = input.nextFloat();
            pesoPeixe /= 1000;

            pesoTotalPesca += pesoPeixe;
            System.out.println("O peso total obtido no momento é: "+String.format("%.3f",pesoTotalPesca)+"Kg");

            System.out.println("deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
            prosseguir = input.next().charAt(0);
        }
        System.out.println("O limite de peso diáio foi excedido!\nPeso atual:"+pesoTotalPesca+"kg\nPeso Limite:"+pesoLimite +"Kg");

        input.close();
    }
}
