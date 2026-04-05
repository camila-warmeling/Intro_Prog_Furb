package unidade4.exerciciosUni4;

import java.util.Scanner;

public class Uni4Exe17 {

    Scanner input = new Scanner(System.in);
    private float rendaAnual, rendaLiquida, impostoSalarioLiquido;
    private int numDependentes, descontoNumDependentes;
    private String porcentagemDeImposto; 
    
    public Uni4Exe17(){
        obterDadosUsuario();
        calcularRendaLíquida();
        calcularImpostoDoContribuinte();
        mostrarResultados();
    }

    public void obterDadosUsuario(){
        System.out.println("Digite a renda anual do contribuinte:");
        rendaAnual = input.nextFloat();

        System.out.println("Digite o número de dependentes:");
        numDependentes = input.nextInt();
    }

    public void calcularRendaLíquida(){
        descontoNumDependentes = numDependentes * 2;
        rendaLiquida = rendaAnual - (rendaAnual * descontoNumDependentes / 100);
    }

    public void calcularImpostoDoContribuinte(){
        if(rendaLiquida <= 2000){
            impostoSalarioLiquido = 0;
        }
        else if(rendaLiquida <= 5000){
            porcentagemDeImposto = "5%";
            impostoSalarioLiquido = rendaLiquida * 0.05f;
        }
        else if(rendaLiquida <= 10000){
            porcentagemDeImposto = "10%";
            impostoSalarioLiquido = rendaLiquida * 0.10f;
        }
        else{
            porcentagemDeImposto = "15%";
            impostoSalarioLiquido = rendaLiquida * 0.15f;
        }
    }

    public void mostrarResultados(){
        if(numDependentes < 0 || rendaAnual <= 0){
            System.out.println("Os números são inválidos!");
        }
        else if(impostoSalarioLiquido == 0){
            System.out.println("O contribuinte não precisa pagar nenhum imposto!");
        }
        else{
            System.out.printf("O imposto é de %s e deve ser pago R$%.2f", porcentagemDeImposto, impostoSalarioLiquido);;
        }
    }

    public static void main(String[] args) {
        new Uni4Exe17();   
    }
}
