package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe30 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int numero, decremento, tamanhoMochila, somaElementosDentro = 0, somaElementosFora = 0;
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
                somaElementosDentro += numero;
            }else{
                elementosFora += numero + " ";
                somaElementosFora += numero;
            }
            elementosSeremColocados += numero + " ";
            numero -= decremento;
        }

        System.out.println("Elementos a serem colocados na mochila: " + elementosSeremColocados);
        System.out.println("Elementos que entraram na mochila: " + elementosDentro);
        System.out.println("Elementos que não entraram na mochila: " + elementosFora);
        System.out.println("Soma dos elementos que entraram na mochila: " + somaElementosDentro);
        System.out.println("Soma dos elementos que não entraram na mochila: " + somaElementosFora);

        input.close();
    }
}
