package unidade2.exerciciosUni2;
import java.util.Scanner;

public class Uni2Exe07 {
    public static void main(String[] args) {

    
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
