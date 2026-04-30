package unidade5.exerciciosUni5;

import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i=0; i<20; i++){
            System.out.println("Digite um número");
            int numero = input.nextInt();
            if((numero%2) == 0){
                System.out.println("Par");
            }
            else{
                System.out.println("Ímpar");
            }
        }
        input.close();
    }
}
