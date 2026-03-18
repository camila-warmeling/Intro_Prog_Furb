package unidade3.exerciciosUni3;

import java.util.Scanner;

public class Uni3Exe08 {

    private float dinheiroDolar;

    public Uni3Exe08(float dinheiroDolar){
        this.dinheiroDolar = dinheiroDolar;
    }

    public float calcularDolarParaReal(){ 
        float valorEmReais = this.dinheiroDolar * 5.26f;
        return valorEmReais;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor em dólares:");
        float dinDolar = input.nextFloat();

        Uni3Exe08 classeExec = new Uni3Exe08(dinDolar);
        float dolarEmReais = classeExec.calcularDolarParaReal();
        System.out.println("O valor em reais é de R$" + String.format("%.2f", dolarEmReais));

        input.close();
    }
}
