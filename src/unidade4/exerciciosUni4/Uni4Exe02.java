package unidade4.exerciciosUni4;

import java.util.Scanner;

//Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar.

public class Uni4Exe02 {

    private int valorInteiro;
    private String resultado;

    public Uni4Exe02(int valorInteiro){
        this.valorInteiro = valorInteiro;
    }

    public String verificadorParImpar(){
        if (valorInteiro % 2 == 0){
            resultado = "Par";
        }
        else{
            resultado = "Ímpar";
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma valor inteiro:");
        int valorInt = input.nextInt();

        Uni4Exe02 classeExec = new Uni4Exe02(valorInt);
        String result = classeExec.verificadorParImpar();
        System.out.println("O valor digitado é " + result);

        input.close();
    }
}
