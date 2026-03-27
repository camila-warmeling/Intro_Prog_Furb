package unidade4.exerciciosUni4;

import java.util.Scanner;

public class Uni4Exe07 {

    private int pesoCarta;
    private float valorTotalSelo;

    public Uni4Exe07(int pesoCarta){
        this.pesoCarta = pesoCarta;
    }

    public float calcularPrecoSelo(){
        if(this.pesoCarta > 50){
            int excedente = (int)Math.ceil((this.pesoCarta - 50) / 20.0);
            float valorAdicional = 0.45f * excedente;
            valorTotalSelo = 0.45f + valorAdicional;
        }
        else{
            valorTotalSelo = 0.45f;
        }

        return valorTotalSelo;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite em gramas o peso da carta:");
        int peso = input.nextInt();

        Uni4Exe07 classeExec = new Uni4Exe07(peso);
        float valor = classeExec.calcularPrecoSelo();
        System.err.println("O valor total do selo é de R$" + String.format("%.2f", valor));

        input.close();
    }
}   
