package unidade2.exerciciosUni2;

import java.util.Scanner;

public class Uni2Exe08 {
    public static void main(String[] args) {

        int peca1, peca2, quant1, quant2;
        float preco1, preco2, valorTotal;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o código da peça 1:");
        peca1 = input.nextInt();
        
        System.out.print("Digite a quantidade de peças 1:");
        quant1 = input.nextInt();

        System.out.print("Digite o valor de cada peça 1:");
        preco1 = input.nextInt();

        System.out.print("Digite o código da peça 2:");
        peca2 = input.nextInt();

        System.out.print("Digite a quantidade de peças 2:");
        quant2 = input.nextInt();

        System.out.print("Digite o valor de cada peça 2:");
        preco2 = input.nextInt();

        valorTotal = (quant1 * preco1) + (quant2 * preco2);
        System.out.printf("Foi vendido %d" + " de código %d" + " no valor de R$ %.2f cada %n", quant1, peca1, preco1);
        System.out.printf("Foi vendido %d" + " de código %d" + " no valor de R$ %.2f cada %n", quant2, peca2, preco2);
        System.out.println("O valor final da compra foi R$" + valorTotal);

        input.close();
    }
}
