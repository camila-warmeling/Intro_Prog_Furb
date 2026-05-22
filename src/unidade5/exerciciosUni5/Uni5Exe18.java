package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe18 {

    Scanner input = new Scanner(System.in);
    private int canal, quantPessoas, totalPessoas;
    private int canal4=0, canal5=0, canal9=0, canal12=0;
    private float porcentagemCanal4, porcentagemCanal5, porcentagemCanal9, porcentagemCanal12;

    public Uni5Exe18(){
        receberDados();
        calcularPorcentagem();
        mostrarResultados();
    }

    public void receberDados(){
        System.out.println("Digite o número do canal (4, 5, 9, 12):");
        canal = input.nextInt();

        while (canal != 0){
            System.out.println("Digite a quantidade de pessoas assistindo:");
            quantPessoas = input.nextInt();

            switch (canal) {
                case 4:
                    canal4 += quantPessoas;
                    break;
            
                case 5:
                    canal5 += quantPessoas;
                    break;

                case 9:
                    canal9 += quantPessoas;
                    break;

                case 12:
                    canal12 += quantPessoas;
                    break;

                default:
                    System.out.println("Canal Inexistente!");
                    break;
            }
            System.out.println("Digite o número do canal:");
            canal = input.nextInt();
        }
    }

    public void calcularPorcentagem(){
        totalPessoas = canal4 + canal5 + canal9 + canal12;
        porcentagemCanal4 = (canal4 * 100f) / totalPessoas;
        porcentagemCanal5 = (canal5 * 100f) / totalPessoas;
        porcentagemCanal9 = (canal9 * 100f) / totalPessoas;
        porcentagemCanal12 = (canal12 * 100f) / totalPessoas;
    }

    public void mostrarResultados(){
        System.out.printf("Audiência dos canais:\n canal 4 - %.2f%%\n canal 5 - %.2f%%\n canal 9 - %.2f%%\n canal 12 - %.2f%%", porcentagemCanal4, porcentagemCanal5, porcentagemCanal9, porcentagemCanal12);
    }

    public static void main(String[] args) {
        new Uni5Exe18();
    }
}