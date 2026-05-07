package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe08 {

    private Scanner input = new Scanner(System.in);
    private int numero, quantRepet, menorNegativo = 0, somaPositivos;

    public Uni5Exe08(){
        entradaDados();
        mostrarResultados();
    }

    public void entradaDados(){
        System.out.println("Quantos números vão ser analisados?:");
        quantRepet = input.nextInt();
        
        for(int i=1; i<=quantRepet; i++){
            System.out.println("Digite um número inteiro:");
            numero = input.nextInt();
            if(numero < 0){
                if(menorNegativo > numero){
                menorNegativo = numero;}
            }else{
                somaPositivos+= numero;
            }
        }
    }

    public void mostrarResultados(){
        if(menorNegativo == 0){
            System.out.println("Não foi digitado números negativos");
        }else{
            System.out.println("O menor número negativo é "+menorNegativo);
        }
        System.out.println("A soma dos números positivos foi "+somaPositivos);
    }

    public static void main(String[] args) {
        new Uni5Exe08();
    }
}

