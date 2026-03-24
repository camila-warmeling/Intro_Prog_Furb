package unidade3.exerciciosUni3;

import java.util.Scanner;

//notas de 100, 10 e 1 reais. programa que determine e escreva o número mínimo de notas 
//de troco. Escreva também o número de cada tipo de nota a ser fornecido como troco. 

public class Uni3Exe16 {

    private int valorTotalCompra;
    private int valorPagoCliente;

    public Uni3Exe16(int valorTotalCompra, int valorPagoCliente){
        this.valorTotalCompra = valorTotalCompra;
        this.valorPagoCliente = valorPagoCliente;
    }

    public int calcularTroco(){
        int troco = this.valorPagoCliente - this.valorTotalCompra;
        return troco;
    }

    public int calcularQuantNotas100(){
        int notas100 = calcularTroco()/100;
        return notas100;
    }
    
    public int calcularQuantNotas10(){
        int resto = calcularTroco()%100;
        int notas10 = resto/10;
        return notas10;
    }
     
    public int calcularQuantNotas1(){
        int notas1 = calcularTroco()%10;
        return notas1;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Digite o valor total da compra:");
        int valorCompra = input.nextInt();

        System.out.println("Digite o valor pago pelo cliente");
        int valorPago = input.nextInt();

        Uni3Exe16 classeExec = new Uni3Exe16(valorCompra, valorPago);
        int troco = classeExec.calcularTroco();
        int n100 = classeExec.calcularQuantNotas100();
        int n10 = classeExec.calcularQuantNotas10();
        int n1 = classeExec.calcularQuantNotas1();
        System.err.printf("O total do troco é %d.\n Quantidade mínima de notas de 100:%d\n Quantidade mínima de notas de 10:%d\n Quantidade mínima de notas de 1:%d\n", troco, n100, n10, n1);
    
        input.close();
    }
}
