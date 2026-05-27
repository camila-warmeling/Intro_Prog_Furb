package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe31 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int numero, decomposicao = 2;

        System.out.println("Digite o número a ser decomposto:");
        numero = input.nextInt();

        System.out.println("Número Decomposição");

        while(numero > 1){
            while(numero % decomposicao == 0){ 
                //%-5d faz com que os numeros se alinhem na direita e tenham sempre 5 espaços. Se um número ocupa 3 espaços o restante ficara em branco.
                System.out.printf("%-5d | %d\n", numero, decomposicao);
                numero /= decomposicao;
            }
            decomposicao ++;
        }

        //linha final quando o número se torna 1
        System.out.printf("%-5d |\n", numero);
        input.close();
    }
}
