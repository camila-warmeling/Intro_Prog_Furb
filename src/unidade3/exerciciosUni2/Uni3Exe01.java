package unidade3.exerciciosUni2;

import java.util.Scanner;

public class Uni3Exe01 {
    //atributos
    private int comprimento;
    private int largura;

    //construtor
    public Uni3Exe01(int comprimento, int largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public int calcularArea(){
        int areaTotal = this.comprimento * this.largura;
        return areaTotal;
    }
    public static void main(String[] args) {
        //pegar medidas do usuário
        //Exibir o total
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o comprimento");
        int compr = input.nextInt();
        
        System.out.println("Digite a largura");
        int larg = input.nextInt();

        Uni3Exe01 classeExec = new Uni3Exe01(compr, larg);
        classeExec.calcularArea();
        System.out.println("Area Total do terreno:" + classeExec.calcularArea() + "m²");

        input.close();
    }
}
