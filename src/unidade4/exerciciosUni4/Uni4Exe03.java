package unidade4.exerciciosUni4;

import java.util.Scanner;

public class Uni4Exe03 {

    private int valor1, valor2;
    private String resultado;

    public Uni4Exe03(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public String verificadorMaiorNumero(){
        if (this.valor1 > this.valor2) {
            int maior = this.valor1;
            int menor = this.valor2;
            resultado = "O valor " + maior + " é maior que " + menor;
        } else {
            int maior = this.valor2;
            int menor = this.valor1;
            resultado = "O valor " + maior + " é maior que " + menor;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        int val1 = input.nextInt();

        System.out.println("Digite o segundo valor:");
        int val2 = input.nextInt();

        Uni4Exe03 classeExec = new Uni4Exe03(val1, val2);
        System.out.println(classeExec.verificadorMaiorNumero());

        input.close();
    }

}
