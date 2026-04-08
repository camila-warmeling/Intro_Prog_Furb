package unidade4.exerciciosUni4;

import java.util.Scanner;

public class Uni4Exe19 {

    private float valorX, valorY;
    private int quadrante;

    public Uni4Exe19(float valorX, float valorY){
        this.valorX = valorX;
        this.valorY = valorY;
    }

    public int verificarQuadranteCorreto(){
        if(this.valorX == 0 && this.valorY == 0){
            quadrante = 0;
        }
        else if(this.valorX > 0 && this.valorY > 0){
            quadrante = 1;
        }
        else if(this.valorX < 0 && this.valorY > 0){
            quadrante = 2;
        }
        else if(this.valorX < 0 && this.valorY < 0){
            quadrante = 3;
        }
        else{
            quadrante = 4;
        }
        return quadrante;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Digite o valor do ponto x:");
        float valX = input.nextFloat();

        System.err.println("Digite o valor do ponto x:");
        float valY = input.nextFloat();

        Uni4Exe19 classeExec = new Uni4Exe19(valX, valY);
        System.err.println("Quadrante " + classeExec.verificarQuadranteCorreto());

        input.close();
    }   
}
