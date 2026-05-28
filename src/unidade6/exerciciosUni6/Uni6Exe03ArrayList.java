package unidade6.exerciciosUni6;

import java.util.ArrayList;
import java.util.Scanner;

public class Uni6Exe03ArrayList {

    public int tamanho = 12;
    public ArrayList<Double> valores = new ArrayList<>();
    public Scanner input = new Scanner(System.in);

    public Uni6Exe03ArrayList(){

    }

    public void lerValores(){
        for(int i=0; i<tamanho; i++){
            System.out.println("Digite o valor:");
            double valor = input.nextDouble();
            valores.add(valor);
        }
    }

    public void alterarValores(){
        for(int i=0; i<tamanho; i++){
            if(i % 2 == 0){
                //par aumenta o valor em 2%
                valores.set(i, valores.get(i) * 1.02);
            }else{
                //impar aumenta o valor em 5%
                valores.set(i, valores.get(i) * 1.05);
            }
        }
    }

    public void imprimir(){
        int i = 1;

        //foreach
        for(Double item : valores){
        System.out.println("Posição "+i+" valor: " + String.format("%.2f",item));
            i++;
        }
    }

    public static void main(String[] args) {
        Uni6Exe03ArrayList exec03 = new Uni6Exe03ArrayList();
        exec03.lerValores();
        exec03.alterarValores();
        exec03.imprimir();
    }
}
