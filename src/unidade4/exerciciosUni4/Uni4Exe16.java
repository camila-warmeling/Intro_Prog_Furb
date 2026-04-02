package unidade4.exerciciosUni4;

import java.util.Scanner;

public class Uni4Exe16 {

    Scanner input = new Scanner(System.in);
    private int idadeHomem1, idadeHomem2, homemMaisNovo, homemMaisVelho;
    private int idadeMulher1, idadeMulher2, mulherMaisNova, mulherMaisVelha;
    private int somaIdade1, somaIdade2;

    public Uni4Exe16(){
        obterIdades();
        verificarMaisVelhoMaisNovo();
        somarIdades();
        mostrarResultados();
    }

    public void obterIdades(){
        System.out.println("Digite a idade do primeiro homem");
        idadeHomem1 = input.nextInt();

        System.out.println("Digite a idade do segundo homem");
        idadeHomem2 = input.nextInt();

        System.out.println("Digite a idade da primeira mulher");
        idadeMulher1 = input.nextInt();

        System.out.println("Digite a idade da segunda mulher");
        idadeMulher2 = input.nextInt();
    }

    public void verificarMaisVelhoMaisNovo(){
        if(idadeHomem1 > idadeHomem2){
            homemMaisNovo = idadeHomem2;
            homemMaisVelho = idadeHomem1;
        }
        else{
            homemMaisNovo = idadeHomem1;
            homemMaisVelho = idadeHomem2;
        }

        if(idadeMulher1 > idadeMulher2){
            mulherMaisNova = idadeMulher2;
            mulherMaisVelha = idadeMulher1;
        }
        else{
            mulherMaisNova = idadeMulher1;
            mulherMaisVelha = idadeMulher2;
        }
    }

    public void somarIdades(){
        somaIdade1 = homemMaisVelho + mulherMaisNova;
        somaIdade2 = homemMaisNovo + mulherMaisVelha;
    }

    public void mostrarResultados(){
        System.out.println("A soma do homem mais velho com a mulher mais nova é " + somaIdade1);
        System.out.println("A soma do homem mais novo com a mulher mais velha é " + somaIdade2);
    }

    public static void main(String[] args) {
        new Uni4Exe16();   
    }
}
