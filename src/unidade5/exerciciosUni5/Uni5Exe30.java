package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe30 {
//Implemente o problema da mochila. Tendo-se uma sequência decrescente de números inteiros positivos 
//que inicia em N, com decremento inteiro positivo K, deseja-se empacotá-los em uma mochila com tamanho 
//M, de forma que se coloque dentro dela preferencialmente os maiores valores, até que ela esteja cheia. 
//N e K são inteiros e devem ser definidos pelo usuário. Faça um algoritmo que imprima:
//os elementos a serem colocados na mochila;
//os elementos que entraram na mochila;
//os que ficaram fora da mochila;
//qual é a soma dos elementos que entraram na mochila;
//qual a soma dos elementos que não entraram na mochila.

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int numero, decremento, tamanhoMochila, somaElementosDentro, somaElementosFora;
        String elementosSeremColocados = "", elementosDentro = "", elementosFora = "";

        System.out.println("Digite o número que vai iniciar:");
        numero = input.nextInt();
        System.out.println("Digite o decremento:");
        decremento = input.nextInt();
        System.out.println("Digite o tamanho da mochila:");
        tamanhoMochila = input.nextInt();

        while(numero > 0){
            if(tamanhoMochila > 0){
                tamanhoMochila --;
                elementosDentro += numero + " ";
            }else{
                elementosFora += numero + " ";
            }
            elementosSeremColocados += numero + " ";
        }

        input.close();
    }
}
