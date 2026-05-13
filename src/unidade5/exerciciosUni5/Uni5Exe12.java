package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 0;
        int contador = 0;

        System.out.println("Quantas linhas vai ter o trinângulo de Floyd:");
        int n = input.nextInt();

        for(int i = 1; i <= n; i++){
            contador++;

            for(int linha = 1; linha <= contador; linha++){
                numero++;
                System.out.print(numero + " ");
            }
            
            System.out.println();
        }
        
        input.close();
    }
}
