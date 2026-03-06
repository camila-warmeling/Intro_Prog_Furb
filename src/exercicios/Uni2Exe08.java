package exercicios;

import java.util.Scanner;

public class Uni2Exe08 {
    public static void main(String[] args) {
        //Deve-se ler o código de uma peça 1, o número de peças 1, 
        //o valor unitário de cada peça 1, o código de uma peça 2, 
        //o número de peças 2 e o valor unitário de cada peça 2. 
        //Após, calcule e mostre o valor a ser pago.
        
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
