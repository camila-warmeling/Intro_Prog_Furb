package unidade4.exerciciosUni4;

import java.util.Scanner;

public class Uni4Exe18 {

    Scanner input = new Scanner(System.in);
    private int diaVencimento, diaPagamento;
    private float valorPrestacao, valorPagar;
    private boolean diaPagamentoCorreto, diaVencimentoCorreto;

    public Uni4Exe18(){
        obterDados();
        verificarDataCorreta();
        if(diaVencimentoCorreto && diaPagamentoCorreto){
            calcularValorPagar();
        }
        mostrarResultados();
    }

    public void obterDados(){
        System.out.println("Digite o dia do vencimento:");
        diaVencimento = input.nextInt();

        System.out.println("Digite o dia do Pagamento:");
        diaPagamento = input.nextInt();

        System.out.println("Digite o valor da Prestação:");
        valorPrestacao = input.nextFloat();
    }
    
    public void verificarDataCorreta(){
        if(diaVencimento <= 10){
            diaVencimentoCorreto = true;
        }
        if(diaPagamento <= 30){
            diaPagamentoCorreto = true;
        }
    }

    public void calcularValorPagar(){
        if(diaPagamento <= diaVencimento){ //10% de desconto
            valorPagar = valorPrestacao - (valorPrestacao * 0.10f);
        }
        else if(diaPagamento <= (diaVencimento + 5)){ //valor normal até 5 dias após o vencimento
            valorPagar = valorPrestacao;
        }
        else{ //2% a mais pra cada dia de atraso 
            valorPagar = valorPrestacao + ((valorPrestacao * 0.02f) * (diaPagamento - diaVencimento));
        }
    }

    public void mostrarResultados(){
        if(diaVencimentoCorreto && diaPagamentoCorreto){
            System.out.println("O valor a ser pago é de R$" + valorPagar);
        }
        else{
            System.out.println("Valores Inválidos!");
        }
    }

    public static void main(String[] args) {
        new Uni4Exe18();
    }
}
