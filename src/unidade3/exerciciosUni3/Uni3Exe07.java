package unidade3.exerciciosUni3;

import java.util.Scanner;

public class Uni3Exe07 {

    private int quantLata;
    private int quantGarrafaMedia;
    private int quantGarrafaGrande;

    public Uni3Exe07(int quantLata, int quantGarrafaMedia, int quantGarrafaGrande){
        this.quantLata = quantLata;
        this.quantGarrafaMedia = quantGarrafaMedia;
        this.quantGarrafaGrande = quantGarrafaGrande;
    }

    public float calcularQuantidadeLitros(){
        float litrosTotal = (this.quantLata * 0.35f) + (this.quantGarrafaMedia * 0.6f) + (this.quantGarrafaGrande * 2);
        return  litrosTotal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de latas de 350ml:");
        int lata = input.nextInt();

        System.out.println("Digite a quantidade de garrafas de 600ml:");
        int garrafaMedia = input.nextInt();

        System.out.println("Digite a quantidade de garrafas de 2L:");
        int garrafaGrande = input.nextInt();

        Uni3Exe07 classeExec = new Uni3Exe07(lata, garrafaMedia, garrafaGrande);
        float quantTotal = classeExec.calcularQuantidadeLitros();
        System.out.println("A quantidade de litros comprados de refrigerante é: " + String.format("%.2f", quantTotal));

        input.close();
    }
}
