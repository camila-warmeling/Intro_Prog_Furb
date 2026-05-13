package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe14 {
    
    Scanner input = new Scanner(System.in);
    private float precoCompra, precoVenda, lucroPercentual, valorTotalCompra, valorTotalVenda, valorTotalLucro;
    private String nomeProduto;
    private int lucroMenor10, lucroMenor20, lucroMaior20;

    public Uni5Exe14(){
        realizarCalculos();
        mostrarResultados();
    }

    private void realizarCalculos(){
        for(int i=1; i<=5; i++){
            System.out.println("Digite o nome do produto:");
            nomeProduto = input.nextLine();
            System.out.println("Digite o preço de compra:");
            precoCompra = Integer.parseInt(input.nextLine());
            System.out.println("Digite o preço de venda:");
            precoVenda = Integer.parseInt(input.nextLine());

            lucroPercentual = (precoVenda - precoCompra) / precoCompra * 100;

            if(lucroPercentual<10){
                lucroMenor10 ++;
            }else if(lucroPercentual<=20){
                lucroMenor20 ++;
            }else{
                lucroMaior20 ++;
            }

            valorTotalCompra += precoCompra; 
            valorTotalVenda += precoVenda;
            valorTotalLucro += (precoVenda - precoCompra);
        }
    }

    private void mostrarResultados(){
        System.out.printf("A quantidade de itens que tem o lucro de:\n menor que 10%% - %d\n menor que 21%% - %d\n maior que 20%% - %d \n", lucroMenor10, lucroMenor20, lucroMaior20);
        System.out.printf("O total dos 20 itens:\n compras - R$%.2f\n vendas - R$%.2f\n lucro - R$%.2f", valorTotalCompra, valorTotalVenda, valorTotalLucro);
    }

    public static void main(String[] args) {
        new Uni5Exe14();
    }
}
