package unidade3.exerciciosUni3;

import java.util.Scanner;

//Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:
//°F = (9/5) °C + 32

public class Uni3Exe11 {

    private float temperaturaCelsius;

    public Uni3Exe11(float temperaturaCelsius){
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public float calcularTemperatura(){
        float temperaturaF = (this.temperaturaCelsius*9/5)+32;
        return temperaturaF;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em Cº:");
        float temp = input.nextFloat();

        Uni3Exe11 classeExec = new Uni3Exe11(temp);
        float conversao = classeExec.calcularTemperatura();
        System.out.println("A temperatura em Fº é:" + String.format("%.2f", conversao)); 

        input.close();
    }
}
