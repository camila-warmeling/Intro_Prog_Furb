package unidade3.exerciciosUni2;

import java.util.Scanner;

public class Uni3Exe03 {

    private float precoGasolina;
    private float valorPagamento;

    public Uni3Exe03(float preco, float pagamento){
        this.precoGasolina = preco;
        this.valorPagamento = pagamento;
    }

    public float calcularQuantidadeDeLitros(float preco, float pagamento){
        return valorPagamento/precoGasolina;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o preço da gasolina:");
        float precoGaso = input.nextFloat();

        System.out.println("Digite o valor do pagamento:");
        float valorPag = input.nextFloat();

        Uni3Exe03 gasolina = new Uni3Exe03(precoGaso, valorPag);
        float quantidadeLitros = gasolina.calcularQuantidadeDeLitros(precoGaso, valorPag);

        System.out.println("O motorista conseguiu colocar " + String.format("%.2f", quantidadeLitros) + " litros");

        input.close();
    }
}
