package unidade6.exerciciosUni6;

import java.util.ArrayList;
import java.util.Scanner;

public class Uni6Exe01ArrayList {

    Scanner input = new Scanner(System.in);
    //começa vazio
    public ArrayList<Integer> numeros = new ArrayList<>();

    private Uni6Exe01ArrayList(){
        lerDados();
        mostrarNumerosInverso();
    }

    private void lerDados(){
        for(int i=0; i<10; i++){
            System.out.println("Digite o " + (i+1) + "º número");
            int valor = input.nextInt();
            numeros.add(valor);
        }
    }

    private void mostrarNumerosInverso(){
        for(int i=9; i>=0; i--){
            System.out.println(numeros.get(i));
        }
    }
    
    public static void main(String[] args) {
        new Uni6Exe01ArrayList();
    }
}
