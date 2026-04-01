package unidade4.exerciciosUni4;

import java.util.Scanner;

public class Uni4Exe13 {

    Scanner input = new Scanner(System.in);
    private int carta1, carta2, carta3;
    private int quantCartasBoas = 0;

    public Uni4Exe13(){
        obterCartasUsuario();
        verificarQuantCartasBoas();
        verificarResultadoTruco();
    }

    public void obterCartasUsuario(){
        System.err.println("Digite a primeira carta:");
        carta1 = input.nextInt();

        System.err.println("Digite a segunda carta:");
        carta2 = input.nextInt();

        System.err.println("Digite a terceira carta:");
        carta3 = input.nextInt();
    }

    public void verificarQuantCartasBoas(){
        if (carta1 == 1 || carta1 == 2 || carta1 == 3){
            quantCartasBoas ++;
        }
        if(carta2 == 1 || carta2 == 2 || carta2 == 3){
            quantCartasBoas ++;
        }
        if(carta3 == 1|| carta3 == 2 || carta3 == 3){
            quantCartasBoas ++;
        }
    }

    public void verificarResultadoTruco(){
        if (quantCartasBoas == 1){
            System.out.println("TRUCO!");
        }
        else if(quantCartasBoas == 2){
            System.out.println("SEIS!");
        }
        else if(quantCartasBoas == 3){
            System.err.println("NOVE!");
        }
    }

    public static void main(String[] args) {
        new Uni4Exe13();
    }
}
