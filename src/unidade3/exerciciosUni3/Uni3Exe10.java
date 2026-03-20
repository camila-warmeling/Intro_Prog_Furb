package unidade3.exerciciosUni3;

import java.util.Scanner;

//leia o comp dos catetos de um triângulo retângulo e calcule o comp da hipotenusa.

public class Uni3Exe10 {

    private float catetoAdjacente;
    private float catetoOposto;

    public Uni3Exe10(float catetoAdjacente, float catetoOposto){
        this.catetoAdjacente = catetoAdjacente;
        this.catetoOposto = catetoOposto;
    }

    public double calcularComprimentoHipotenusa(){
        double hipotenusa = Math.sqrt((Math.pow(this.catetoAdjacente, 2)) + (Math.pow(this.catetoOposto, 2))); 
        return hipotenusa;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do cateto adjacente:");
        float catetoA = input.nextFloat();

        System.out.println("Digite o valor do cateto oposto");
        float catetoO = input.nextFloat();

        Uni3Exe10 classeExec = new Uni3Exe10(catetoA, catetoO);
        double hipot = classeExec.calcularComprimentoHipotenusa();
        System.out.println("O comprimento da hipotenusa é:" + String.format("%.2f", hipot));
    
        input.close();
    }
}
