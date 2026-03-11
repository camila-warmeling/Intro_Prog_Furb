package exerciciosUni2;

import java.util.Scanner;

public class Uni2Exe20 {
    public static void main(String[] args) {
    //Considere que você tenha um papel quadrado e o dobre varias vezes sempre em um número par de dobra no meio do quadrado. 
    //Ao abrir a folha de papel é possível verificar a marcação de novos quadrados. Baseado nisso leia o número de dobras 
    //(lembre que sempre é um número par) feitas no papel e escreva quantos quadrados podem ser vistos após desdobrá-lo.  

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de vezes (tem que ser par) que o papel será dobrado:");
        int quantDobraduras = input.nextInt();
        int resto = quantDobraduras%2;

        if (resto == 0 & quantDobraduras >= 0){
            int quantQuadrados = (int) Math.pow(2, quantDobraduras);
            System.out.printf("A quantidade de quadrados que podem ser vistos após dobra-lo %d vezes é %d quadradinhos", quantDobraduras, quantQuadrados);
        }
        
        else{
            System.out.println("Valor inválido!");
        }

        input.close();
    }
}

 
