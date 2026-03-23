package unidade3.exerciciosUni3;

import java.util.Scanner;

//ler um número inteiro (assuma até 3 dígitos) e imprima a saída da seguinte forma:
//X centena(s)  Y dezena(s) K unidade(s)  
//Exemplo, se for submetido o número 384, o programa deverá exibir:
//3 centena(s)  8 dezena(s) 4 unidade(s)  

public class Uni3Exe15 {

    private int numeroInteiro;

    public Uni3Exe15(int numeroInteiro){
        this.numeroInteiro = numeroInteiro;
    }

    public int separarCentenasDoNumeroInteiro(){
        int centenas = this.numeroInteiro/100;
        return centenas;
    }

    public int separarDezenasDoNumeroInteiro(){
        int resto = this.numeroInteiro%100;
        int dezenas = resto/10;
        return dezenas;
    }

    public int separarUnidadesDoNumeroInteiro(){
        int unidades = this.numeroInteiro%10;
        return unidades;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número inteiro");
        int numero = input.nextInt();

        Uni3Exe15 classeExec = new Uni3Exe15(numero);
        int cent = classeExec.separarCentenasDoNumeroInteiro();
        int dez = classeExec.separarDezenasDoNumeroInteiro();
        int uni = classeExec.separarUnidadesDoNumeroInteiro();
        System.err.printf("%d centena(s) %d dezena(s) %d unidade(s)", cent, dez, uni);

        input.close();
    }
}
