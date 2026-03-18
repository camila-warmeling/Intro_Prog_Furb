package unidade3.exerciciosUni3;

import java.util.Scanner;

public class Uni3Exe09 {

    private float raioLata;
    private float alturaLata;

    public Uni3Exe09(float raioLata, float alturaLata){
        this.raioLata = raioLata;
        this.alturaLata = alturaLata;
    }

    public double calcularVolumeLata(){
        double volumeLata = Math.PI * (Math.pow(this.raioLata, 2)) * this.alturaLata;
        return volumeLata;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do raio da lata:");
        float raio = input.nextFloat();

        System.out.println("Digite a altura da lata:");
        float altura = input.nextFloat();

        Uni3Exe09 classeExec = new Uni3Exe09(raio, altura);
        double volume = classeExec.calcularVolumeLata();
        System.out.println("O volume da lata é: " + String.format("%.2f", volume));

        input.close();
    }
}
