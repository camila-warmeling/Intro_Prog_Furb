package unidade4.exerciciosUni4;

import java.util.Scanner;

public class Uni4Exe21 {

    private double massa, altura, IMC;
    private String classificacaoIMC;

    public Uni4Exe21 (double massa, double altura){
        this.massa = massa;
        this.altura = altura;
    } 

    public void calcularIMC(){
        IMC = this.massa / Math.pow(this.altura, 2);
    }

    public String classificarIMC(){
        if(IMC < 18.5){
            classificacaoIMC = "Magreza";
        }
        else if(IMC < 25){
            classificacaoIMC = "Saudável";
        }
        else if(IMC < 30){
            classificacaoIMC = "Sobrepeso";
        }
        else if(IMC < 35){
            classificacaoIMC = "Obesidade Grau I";
        }
        else if(IMC < 40){
            classificacaoIMC = "Obesidade Grau II (severa)";
        }
        else{
            classificacaoIMC = "Obesidade Grau III (mórbida)";
        }

        return classificacaoIMC;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a massa em quilogramas:");
        double massaIndividuo = input.nextFloat();

        System.out.println("Digite a altura em metros:");
        double alturaIndividuo = input.nextFloat();

        if(massaIndividuo > 0 && alturaIndividuo > 0){
            Uni4Exe21 classeExec = new Uni4Exe21(massaIndividuo, alturaIndividuo);
            classeExec.calcularIMC();
            System.out.println("A classificação do indivíduo é " + classeExec.classificarIMC());
        }
        
        else{
            System.out.println("Dados Inválidos!");
        }

        input.close();
    }
}
