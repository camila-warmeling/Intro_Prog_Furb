package unidade4.exerciciosUni4;

import java.util.Scanner;

public class Uni4Exe09 {

    private int valorA, valorB;
    private String resultado;

    public Uni4Exe09(int valorA, int valorB){
        this.valorA = valorA;
        this.valorB = valorB;
    }

    public String verificarMultiplicidadeDosValores(){
        if(valorA != 0 || valorB != 0){
            if(valorA % valorB == 0 || valorB % valorA == 0){
                resultado = "Os números são múltiplos";
            }
            else{
                resultado = "Os números não são múltiplos";
            }
        }
        else{
            resultado = "Nenhum dos valores pode ser 0";
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Digite o primeiro valor:");
        int valA = input.nextInt();
        
        System.err.println("Digite o segundo valor:");
        int valB = input.nextInt();

        Uni4Exe09 classeExec = new Uni4Exe09(valA, valB);
        System.err.println(classeExec.verificarMultiplicidadeDosValores());

        input.close();
    }
}
