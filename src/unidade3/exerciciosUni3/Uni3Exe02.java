package unidade3.exerciciosUni3;

import java.util.Scanner;

public class Uni3Exe02 {
    //atributos
    private float valorDoCalcado;
    private float percentualDeDesconto;

    public Uni3Exe02(float valor, float desconto){
        this.valorDoCalcado = valor;
        this.percentualDeDesconto = desconto;
    }

    public float valorEmDinheiroDoDesconto(float preco, float desconto){
        return this.valorDoCalcado * (this.percentualDeDesconto / 100);
    }

    public float valorTotalAPagar(){
        return this.valorDoCalcado - valorEmDinheiroDoDesconto(valorDoCalcado, percentualDeDesconto);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do calçado:");

        float valorTenis = input.nextFloat();
        float percentualDeDesconto = 12.0f;
        Uni3Exe02 calcado = new Uni3Exe02(valorTenis, percentualDeDesconto);
        float valorDesconto = calcado.valorEmDinheiroDoDesconto(valorTenis, percentualDeDesconto);
        float valorAPagar = calcado.valorTotalAPagar();
        System.out.printf("O valor do desconto é de R$%.2f %nO valor total a pagar é de R$%.2f", valorDesconto, valorAPagar);
    
        input.close();
    }   

}
