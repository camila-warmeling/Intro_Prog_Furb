package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe06 {

    Scanner input = new Scanner(System.in);
    private double altura, somaAlturas, mediaAlturas;

    public Uni5Exe06(){
        lerAltura();
        calcularMedia();
        mostrarResultado();
    }

    public void lerAltura(){
        for(int i=1; i<=20; i++){
            System.out.printf("Digite a altura da pessoa %d:", i);
            altura = input.nextDouble();

            somaAlturas += altura;
        }
    }

    public void calcularMedia(){
        mediaAlturas = somaAlturas / 20;
    }

    public void mostrarResultado(){
        System.out.println("A media das alturas é:" + mediaAlturas);
    }

    public static void main(String[] args) {
        new Uni5Exe06();
    }
}
