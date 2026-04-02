package unidade4.exerciciosUni4;

import java.util.Scanner;

public class Uni4Exe15 {

    private int quantMeses;
    private String reajusteFuncionario;

    public Uni4Exe15(int quantMeses){
        this.quantMeses = quantMeses;
    }

    public String verigicarPorcentagemReajuste(){
        if (this.quantMeses > 0 && this.quantMeses <= 12){
            reajusteFuncionario = ("O funcionário receberá 5% de ajuste no salário");
        }
        else if (this.quantMeses > 12 && this.quantMeses <=48){
            reajusteFuncionario = ("O funcionário receberá 7% de ajuste no salário");
        }
        else{
            reajusteFuncionario = ("Não haverá reajuste no salário do funcionário");
        }

        return reajusteFuncionario;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Digite a quantidade de meses que o funcionário foi admitido:");
        int meses = input.nextInt();

        Uni4Exe15 classeExec = new Uni4Exe15(meses);
        System.err.println(classeExec.verigicarPorcentagemReajuste());

        input.close();
    }
}
