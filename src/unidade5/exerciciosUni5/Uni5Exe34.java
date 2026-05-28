package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe34 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcao = 0, quantDiarias, quantHospedes = 0;
        float taxaServico, totalPagar;
        String nomeHospede;

        while(opcao != 3){
            
            System.out.println("(1) encerrar a conta de um hóspede \n(2) verificar número de contas encerradas; \n(3) Sair");
            System.out.println("Digite a opção:");
            opcao = input.nextInt();
            input.nextLine();

            switch(opcao){
                case 1:

                    System.out.println("Digite o nome do hóspede:");
                    nomeHospede = input.nextLine();
                    System.out.println("Digite a quantidade de diárias:");
                    quantDiarias = input.nextInt();

                    if(quantDiarias < 15){
                        taxaServico = 7.5f;
                    }else if(quantDiarias == 15){
                        taxaServico = 6.5f;
                    }else{
                        taxaServico = 5;
                    }
                    totalPagar = 50 + (taxaServico * quantDiarias);

                    quantHospedes ++;

                    System.out.println("O hóspede "+nomeHospede+" deve pagar R$"+totalPagar);
                    break;

                case 2:
                    System.out.println("Tem "+quantHospedes+" hóspedes que encerraram as contas.");
                    break;

                case 3:
                    System.out.println("Saindo!");
                    break;
            
                default:
                    System.out.println("Opção inexistente!");
                    break;
            }
        }
        input.close();
    }
}
