package unidade4.exerciciosUni4;

import java.util.Scanner;

public class Uni4Exe04 {

    private float numeroPontoFlutuante;
    private String resultado;

    public Uni4Exe04(float numeroPontoFlutuante){
        this.numeroPontoFlutuante = numeroPontoFlutuante;
    }

    public String verificarCasasDecimaisExistentes(){
        if (this.numeroPontoFlutuante % 1 == 0){
            resultado = "Não foi digitado um número com casas decimais";
        }
        else{
            resultado = "Foi digitado um número com casas decimais";
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor(maior que 0):");
        float valor = input.nextFloat();

        if (valor > 0){
            Uni4Exe04 classeExec = new Uni4Exe04(valor);
            System.out.println(classeExec.verificarCasasDecimaisExistentes());        
        }
        else{
            System.out.println("Valor inválido!");
        }
        input.close();
    }

}
