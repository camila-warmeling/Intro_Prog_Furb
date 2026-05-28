package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe27 {

    public static void main(String[] args) {   
        
        Scanner input = new Scanner(System.in);
        int pecasManha, pecasTarde, quantTotalManha = 0, quantTotalTarde = 0, totalPecasDia;
        int novoFuncionario = 1, dia, diaMaisProducao = 0, quantMaiorProducao = 0; 
        float valorDia;

        while(novoFuncionario == 1){
        
            System.out.println("Digite o dia:");
            dia = input.nextInt();

            if(dia > 0 && dia < 31){
                System.out.println("Quantas peças foram produzidas no período da manhã?");
                pecasManha = input.nextInt();
                System.out.println("Quantas peças foram produzidas no período da tarde?");
                pecasTarde = input.nextInt();
                
                totalPecasDia = pecasManha + pecasTarde;

                if(dia < 16){
                    if(totalPecasDia > 100 && pecasManha >= 30 && pecasTarde >=30){
                        valorDia = totalPecasDia * 0.8f;
                    }else{
                        valorDia = totalPecasDia * 0.5f;
                    }
                }else{
                    valorDia = (pecasManha * 0.4f) + (pecasTarde * 0.3f);
                }

                if(totalPecasDia > quantMaiorProducao){
                    quantMaiorProducao = totalPecasDia;
                    diaMaisProducao = dia;
                }

                quantTotalManha += pecasManha; 
                quantTotalTarde += pecasTarde;

                System.out.println("O funcionário ganhará R$"+String.format("%.2f",valorDia)+" no dia "+dia+" de abril.");
                System.out.println("Novo funcionário (1.sim 2.não)?");
                novoFuncionario = input.nextInt();
            }else{
                System.out.println("Dia inválido!");
            }
        }

        System.out.println("O dia com mais produção foi " + diaMaisProducao + " de Abril.");
        if(quantTotalManha > quantTotalTarde){ //maior produção na manhã
            System.out.println("O período com maior produção é o da manhã com produção total de " + quantTotalManha + " itens");
        }else{ //maior produção na manhã
            System.out.println("O período com maior produção é o da tarde com produção total de " + quantTotalTarde + " itens");
        }

        input.close();
    }
}
