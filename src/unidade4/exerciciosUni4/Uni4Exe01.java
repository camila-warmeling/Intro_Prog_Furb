package unidade4.exerciciosUni4;

import java.util.Scanner;

public class Uni4Exe01 {

    private int horasTrabalhadas;
    private float valorHora;
    private float salarioHoraExtra = 0;
    private float salarioTotal;

    public Uni4Exe01(int horasTrabalhadas, float valorHora){
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public float calcularSalarioTotal(){
        if (horasTrabalhadas > 160){
            int horasTrabalhadasExtra = this.horasTrabalhadas - 160;
            salarioHoraExtra = horasTrabalhadasExtra * (this.valorHora * 1.5f);
            salarioTotal = salarioHoraExtra + (160 * this.valorHora);
        }
        else{
            salarioTotal = this.horasTrabalhadas * this.valorHora;
        }
        return salarioTotal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de horas trabalhadas(mensal):");
        int horasTrab = input.nextInt();

        System.out.println("Digite o valor da hora trabalhada:");
        float valHora = input.nextFloat();

        Uni4Exe01 classeExec = new Uni4Exe01(horasTrab, valHora);
        float salario = classeExec.calcularSalarioTotal();
        System.out.println("O salário total é R$" + salario);

        input.close();
    }


}
