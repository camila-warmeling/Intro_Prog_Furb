package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe05 {

    Scanner input = new Scanner(System.in);
    private int numero = 6, entrada;

    public Uni5Exe05(){
        entradaDados();
        if (entrada >= 2){
            mostrarNumeros();
        }else{
            System.out.println("A entrada deve ser maior que 2!");
        }
    }

    public void entradaDados(){
        System.out.println("Digite a quantidade de números que deseja:");
        entrada = input.nextInt();
    }

    public void mostrarNumeros(){
        for(int i=1; i<=entrada; i++){
            if(i%2 == 0){
                numero += 2;
            }
            else{
                numero = (numero-2) * 2;
            }
            System.out.println(numero);
        }
    }

    public static void main(String[] args) {
       new Uni5Exe05();
    }
}

