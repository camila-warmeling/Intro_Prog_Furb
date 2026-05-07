package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe07 {

    Scanner input = new Scanner(System.in);
    private int quantRepet;
    private double numero, maiorNum, menorNum;

    public Uni5Exe07(){
        entradaDados();
        mostrarMaiorMenor();
    }

    public void entradaDados(){
        System.out.println("Quantos números vão ser analisados?:");
        quantRepet = input.nextInt();
        System.out.println("Digite um número inteiro:");
        numero = input.nextInt();

        maiorNum = numero;
        menorNum = numero;

        for(int i=2; i<=quantRepet; i++){
            System.out.println("Digite um número inteiro:");
            numero = input.nextInt();
            if(numero < menorNum){
                menorNum = numero;                
            }else if(numero > maiorNum){
                maiorNum = numero;
            }
        }
    }

    public void mostrarMaiorMenor(){
        System.out.println("O maior número é:" + maiorNum);
        System.err.println("O menor número é:" + menorNum);
    }   

    public static void main(String[] args) {
        new Uni5Exe07();
    }
}
