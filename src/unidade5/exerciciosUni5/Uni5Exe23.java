package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe23 {

    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        float precoUnit = 0, salarioVendedor = 0;
        float quantVendidaReais = 0; 
        int quantVendida = 0, quantProdutos;
        String nomeVendedor = "";
        char dadosVendedor = 's';

        while(dadosVendedor == 's' || dadosVendedor =='S'){
            quantProdutos = 0;
            salarioVendedor = 0;
        
            System.out.println("Digite o nome do vendedor:");
            nomeVendedor = input.nextLine();

            System.out.println("Quantos produtos diferentes foram vendidos?");
            quantProdutos = input.nextInt();

            for(int i=0; i<quantProdutos; i++){
                System.out.println("Digite o preço do produto:");
                precoUnit = input.nextFloat();
                System.out.println("Digite a quantidade vendida do produto:");
                quantVendida = input.nextInt();

                //calcular a comissão
                salarioVendedor += ((precoUnit * 30)/100)* quantVendida;

                //total de vendas em R$
                quantVendidaReais += precoUnit * quantVendida;
            }

            System.out.printf("Relatório do Vendedor:\n Nome: %s\n Total de Vendas: R$%.2f\n Salário Vendedor: R$%.2f\n Quantidade de Produtos Vendidos: %d\n", nomeVendedor, quantVendidaReais, salarioVendedor, quantProdutos);
            System.out.println("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
            dadosVendedor = input.next().charAt(0);
            input.nextLine();
        }

        input.close();
    }

}

