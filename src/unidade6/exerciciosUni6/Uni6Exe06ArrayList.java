package unidade6.exerciciosUni6;

import java.util.ArrayList;
import java.util.Scanner;

public class Uni6Exe06ArrayList {

    public Scanner input = new Scanner(System.in);
    public ArrayList<Double> listaNumeros = new ArrayList<>();  
    public int tamanho;
    public double numProcurar;

    private Uni6Exe06ArrayList(){
        solicitarDados();
        mostrarResultado();
    }

    private void solicitarDados(){
        System.out.println("Digite a quantidade de números que deseja:");
        tamanho = input.nextInt();

        for(int i=0; i<tamanho; i++){
            System.out.println("Digite um número:");
            double num = input.nextDouble();
            listaNumeros.add(num);
        }
    }

    private boolean procurarNumeroLista(){
        System.out.println("Qual valor deseja procurar?");
        numProcurar = input.nextDouble();
        boolean numEncontrado = false;

        for(int i=0; i<tamanho; i++){
            double valor = listaNumeros.get(i);
            if(valor == numProcurar){
                numEncontrado = true;
            }
        }
        return numEncontrado;
    }

    private void mostrarResultado(){
        boolean num = procurarNumeroLista();
        if(num == true){
            System.out.println("O número " + numProcurar + " foi encontrado na lista");
        }else{
            System.out.println("O número " + numProcurar + " não foi encontrado na lista");
        }
    }

    public static void main(String[] args) {
        new Uni6Exe06ArrayList();
    }
}