package unidade6.exerciciosUni6;

import java.util.ArrayList;
import java.util.Scanner;

public class Uni6Exe08ArrayList {

    public Scanner input = new Scanner(System.in);
    public ArrayList<Double> listaNumeros = new ArrayList<>();
    public int tamanho = 0;

    private Uni6Exe08ArrayList(){
        solicitarTamanhoLista();
        solicitarDados();
        mostrarTabelaFrequencia();
    }

    private int solicitarTamanhoLista(){
        do{
            System.out.println("Digite o tamanho da lista (máximo 20):");
            tamanho = input.nextInt();
            if(tamanho <=0 || tamanho > 20){
                System.out.println("Tamanho inválido! Valor máximo: 20");
            }
        }while(tamanho > 20);

        return tamanho;
    }

    private void solicitarDados(){
        System.out.println("Digite os " + tamanho + " valores reais:");
        for(int i=0; i<tamanho; i++){
            System.out.print("Valor [" + i + "]: ");
            double valor = input.nextDouble();
            listaNumeros.add(valor);
        }
    }

    private void mostrarTabelaFrequencia() {
        ArrayList<Double> numerosContados = new ArrayList<>();

        System.out.println("\nVALOR     | FREQUÊNCIA");
        System.out.println("---------------------");

        for(int i=0; i< listaNumeros.size(); i++){
            double valorAtual = listaNumeros.get(i);

            if (!numerosContados.contains(valorAtual)) {
                int frequencia = 0;

                for(int j=0; j<listaNumeros.size(); j++){
                    if (listaNumeros.get(j) == valorAtual){
                        frequencia++;
                    }
                }
                System.out.printf("%9.2f | %9d\n", valorAtual, frequencia);

                numerosContados.add(valorAtual);
            }
        }
    }

    public static void main(String[] args) {
        new Uni6Exe08ArrayList();
    }

}
