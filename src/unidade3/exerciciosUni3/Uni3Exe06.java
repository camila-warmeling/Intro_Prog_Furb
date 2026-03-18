package unidade3.exerciciosUni3;

import java.util.Scanner;

public class Uni3Exe06 {

    private float pesoPratoMontado;

    public Uni3Exe06(float pesoPratoMontado){
        this.pesoPratoMontado = pesoPratoMontado;
    }

    public float calcularvalorAPagar(){
        float valorPrato = (this.pesoPratoMontado - 0.75f) * 25;
        return valorPrato;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o peso do prato montado pelo cliente:");
        float pesoPratoCliente = input.nextFloat();

        Uni3Exe06 classeExec = new Uni3Exe06(pesoPratoCliente);
        float valorPrato = classeExec.calcularvalorAPagar();
        System.out.println("O preço que o cliente deve pagar é:" + String.format("%.2f", valorPrato));

        input.close();
    }

}
