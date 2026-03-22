package unidade3.exerciciosUni3;

import java.util.Scanner;

//azulejo R$ 12,50. Ler comprimento e altura de uma parede (em metros), 
//escrever o valor gasto com a compra de azulejos. 
//Considere que um metro quadrado é formado por 9 azulejos.

public class Uni3Exe13 {

    private double comprimentoParede;
    private double alturaParede;

    public Uni3Exe13 (double comprimentoParede, double alturaParede){
        this.comprimentoParede = comprimentoParede;
        this.alturaParede = alturaParede;
    }

    public double calcularQuantidadeAzulejos(){
        double quantAzulejos = (this.comprimentoParede * this.alturaParede) * 9;
        return quantAzulejos;
    }

    public double calcularPrecoDosAzulejos(){
        double gastoAzulejos = calcularQuantidadeAzulejos() * 12.50f;
        return gastoAzulejos;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o comprimento da parede:");
        double comp = input.nextDouble();

        System.out.println("Digite a altura da parede:");
        double alt = input.nextDouble();

        Uni3Exe13 classeExec = new Uni3Exe13(comp, alt);
        double gastoTotal = classeExec.calcularPrecoDosAzulejos();
        System.out.println("O valor gasto com os azulejos é R$" + String.format("%.2f", gastoTotal)); 

        input.close();
    }

}
