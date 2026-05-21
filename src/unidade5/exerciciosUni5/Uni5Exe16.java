package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe16 {
//a partir da altura e do gênero (gênero = 'M' ou gênero = 'm' para masculino; gênero = 'F' e gênero = 'f' 
//para feminino ou gênero = 'O' ou gênero = 'o' para outro) de cada pessoa informe a média da altura das 
//mulheres e a média de altura do grupo.A leitura deve ser finalizada ao digitar 0 para a altura.

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char genero;
        float altura = 1, mediaAlturaMulheres = 0, mediaAlturaGrupo = 0;
        float somaAlturaMulheres = 0, somaAlturaGrupo = 0;
        int contadorGrupo = 0, contadorMulheres = 0;

        while(altura != 0){
            System.out.println("M - Masculino \nF - Feminino \nO - outro");
            genero = input.next().charAt(0);
            System.out.println("Digite a altura:");
            altura = input.nextFloat();

            if(altura != 0){
                contadorGrupo ++;
            }

            if((genero == 'f' || genero == 'F') && altura!=0){ //tem que ser aspas simples para comparar um char
                contadorMulheres ++;
                somaAlturaMulheres += altura;
            }
            
            somaAlturaGrupo += altura;
        }

        mediaAlturaGrupo = somaAlturaGrupo/contadorGrupo;
        mediaAlturaMulheres = somaAlturaMulheres/contadorMulheres;

        System.out.println("A altura média das mulheres é de " + String.format("%.2f", mediaAlturaMulheres) + "m");
        System.out.println("A altura média do grupo é de " + String.format("%.2f", mediaAlturaGrupo) + "m");
        input.close();
    }
}
