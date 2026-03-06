package exercicios;
import java.util.Scanner;

public class Uni2Exe07 {
    public static void main(String[] args) {
        //Faça um programa que leia o nome de um vendedor, 
        //o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
        //Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
        //informar o total a receber no final do mês, com duas casas decimais.
    
    String nomeVendedor;
    float salarioFixo, totalVendas, salarioTotal;
    float comissao = 0.15f;

    Scanner input = new Scanner(System.in);
    System.out.print("Digite o nome do vendedor:");
    nomeVendedor = input.next();

    System.out.print("Digite o salário fixo:");
    salarioFixo = input.nextFloat();

    System.out.print("Digite o total de vendas do vendedor " + nomeVendedor + ":");
    totalVendas = input.nextFloat();

    salarioTotal = salarioFixo + (totalVendas * comissao);
    
    System.out.println("O salário total ao final do mês é R$" + String.format("%.2f", salarioTotal));

    input.close();
    }
}
