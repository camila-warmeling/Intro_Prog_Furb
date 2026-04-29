import java.util.Scanner;

public class questao4 {

    Scanner input = new Scanner(System.in);
    private float valorConta, valorFinalPagar;
    private int tipoCliente;

    public questao4(){
        obterDados();
        calcularDescontoCliente();
        calcularTaxaServico();
        mostrarResultados();
    }

    public void obterDados(){
        System.out.println("Digite o valor da conta:");
        valorConta = input.nextFloat();

        System.out.println("Informe o tipo de cliente (1-Comum, 2-VIP)");
        tipoCliente = input.nextInt();
    }

    public void calcularDescontoCliente(){
        switch (tipoCliente) {
            case 1:
                if(valorConta >= 200){
                    valorConta = valorConta - (valorConta * 0.05f);
                }
                break;

            case 2:
                valorConta = valorConta - (valorConta * 0.10f); 
                break;
        
            default:
                System.out.println("Tipo de cliente inválido!");
                break;
        }
    }

    public void calcularTaxaServico(){
        if(valorConta >= 100){
            valorFinalPagar = valorConta + (valorConta * 0.10f);
        }
        else{
            valorFinalPagar = valorConta + (valorConta * 0.05f);
        }
    }

    public void mostrarResultados(){
        System.out.println("Valor final a pagar: R$" + valorFinalPagar);
    }

    public static void main(String[] args) {
        new questao4();
    }
}
