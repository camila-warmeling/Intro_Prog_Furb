import java.util.Scanner;

public class questao2 {

    Scanner input = new Scanner(System.in);
    private int codigo, quantidade;
    private float valorCompra, valorTotalPagar;

    public questao2(){
        obterDados();
        calcularValorCompra();
        calcularValorTotalPagar();
        mostrarResultados();
    }

    public void obterDados(){
        System.out.println("Informe o código do produto(1,2 ou 3):");
        codigo = input.nextInt();

        System.out.println("Informe a quantidade desejada:");
        quantidade = input.nextInt();
    }

    public void calcularValorCompra(){ //calcula o valor total sem descontos
        switch (codigo) {
            case 1:
                valorCompra = quantidade * 50;
                break;

            case 2:
                valorCompra = quantidade * 100;
                break;

            case 3:
                valorCompra = quantidade * 200;
                break;
        
            default:
                System.out.println("Código produto invalido!");
                break;
        }
    }

    public void calcularValorTotalPagar(){ //verifica se tem descontos e os aplica no valor total
        if(quantidade >= 10 && quantidade < 500){
            valorTotalPagar = valorCompra - (valorCompra * 0.10f);
        }
        else if(quantidade >=500){
            valorTotalPagar = valorCompra - (valorCompra * 0.15f);
        }
        else{
            valorTotalPagar = valorCompra;
        }
    }

    public void mostrarResultados(){        
            System.out.println("Valor total da compra: R$" + valorCompra);
            System.out.println("Valor final com desconto: R$" + valorTotalPagar);
    }

    public static void main(String[] args) {
        new questao2();
    }
}
