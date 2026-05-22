package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe19 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float valorCompra=0, totalCompra=0, valorTotalLoja=0;

        System.out.println("Digite o valor da compra:");
        valorCompra = input.nextFloat();

        while (valorCompra !=0){
            if(valorCompra > 500){
              totalCompra = valorCompra - ((valorCompra * 20)/100);  
            }else{
                totalCompra = valorCompra - ((valorCompra * 15)/100);
            }

            System.out.println("Valor total da Compra: R$" + String.format("%.2f",totalCompra));

            valorTotalLoja += totalCompra;

            System.out.println("Digite o valor da compra:");
            valorCompra = input.nextFloat();
        }

        System.out.println("Valor recebido ao final do dia:" + String.format("%.2f",valorTotalLoja));

        input.close();
    }
}
