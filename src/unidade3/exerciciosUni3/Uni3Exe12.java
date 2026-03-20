package unidade3.exerciciosUni3;

import java.util.Scanner;

public class Uni3Exe12 {

    private float horasTrabalhadas;
    private int quantDependentes;

    public Uni3Exe12(float horasTrabalhadas, int quantDependentes){
        this.horasTrabalhadas = horasTrabalhadas;
        this.quantDependentes = quantDependentes;
    }

    public float calcularSalarioHorasTrabalhadas(){
        float salarioHorasTrabalhadas = horasTrabalhadas * 10;
        return salarioHorasTrabalhadas; 
    }

    public int calcularSalarioQuantidadeDeDependentes(){
        int salarioQuantDependentes = quantDependentes * 60;
        return salarioQuantDependentes;
    }

    public float calcularSalarioBruto(){
        float salarioBruto = calcularSalarioHorasTrabalhadas() + calcularSalarioQuantidadeDeDependentes();
        return salarioBruto;
    }

    public float calcularSalarioLiquido(){
        float descontoINSS = calcularSalarioHorasTrabalhadas() * 0.085f;
        float descontoIR = calcularSalarioHorasTrabalhadas() * 0.05f;
        float salarioLiquido = calcularSalarioBruto() - descontoINSS - descontoIR;
        return salarioLiquido;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário:");
        String nomeFuncionario = input.nextLine();

        System.out.println("Digite a quantidade de horas trabalhadas:");
        float horasTrab = input.nextFloat();

        System.out.println("Digite a quantidade de dependentes:");
        int quantDepend = input.nextInt();

        Uni3Exe12 classeExec = new Uni3Exe12(horasTrab, quantDepend);
        float salarioB = classeExec.calcularSalarioBruto();
        float salarioL = classeExec.calcularSalarioLiquido();
        System.out.printf("O funcionário %s teve o salário bruto de R$%.2f e salário Líquido de R$%.2f", nomeFuncionario, salarioB, salarioL);

        input.close();
    }
}
