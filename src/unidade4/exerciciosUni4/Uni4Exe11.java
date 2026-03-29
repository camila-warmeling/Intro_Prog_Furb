package unidade4.exerciciosUni4;

import java.util.Scanner;

public class Uni4Exe11 {

    private int idadeIrmao1, idadeIrmao2, idadeIrmao3;
    private String resultado;

    public Uni4Exe11(int idadeIrmao1, int idadeIrmao2, int idadeIrmao3){
        this.idadeIrmao1 = idadeIrmao1;
        this.idadeIrmao2 = idadeIrmao2;
        this.idadeIrmao3 = idadeIrmao3;
    }

    public String verificarTrigemeosGemeosApenasIrmaos(){
        if (this.idadeIrmao1 == this.idadeIrmao2 && this.idadeIrmao2 == this.idadeIrmao3){
            resultado = "Trigêmeos!";
        } else if(this.idadeIrmao1 == this.idadeIrmao2 || this.idadeIrmao1 == this.idadeIrmao3 || this.idadeIrmao2 == this.idadeIrmao3){
            resultado = "Gêmeos!";
        }else{
            resultado = "apenas Irmãos!";
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Digite a idade do primeiro irmão:");
        int irmao1 = input.nextInt();

        System.err.println("Digite a idade do segundo irmão:");
        int irmao2 = input.nextInt();

        System.err.println("Digite a idade do terceiro irmão:");
        int irmao3 = input.nextInt();

        Uni4Exe11 classeExec = new Uni4Exe11(irmao1, irmao2, irmao3);
        System.err.println("Os irmãos são " + classeExec.verificarTrigemeosGemeosApenasIrmaos());

        input.close();
    }
}
