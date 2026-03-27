package unidade4.exerciciosUni4;

import java.util.Scanner;

public class Uni4Exe08 {

    private char letraUsuario;
    private String resposta;

    public Uni4Exe08(char letraUsuario){
        this.letraUsuario = letraUsuario;
    }

    public String verificarVogalConsoante(){
        if(this.letraUsuario == 'A' || this.letraUsuario == 'E' || this.letraUsuario == 'I' || this.letraUsuario == 'O' || this.letraUsuario == 'U'){
            resposta = "A primeira letra é uma vogal";
        }
        else{
            resposta = "A primeira letra não é uma vogal";
        }
        return resposta;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma letra:");
        char letra = input.next().toUpperCase().charAt(0);

        Uni4Exe08 classeExec = new Uni4Exe08(letra);
        System.err.println(classeExec.verificarVogalConsoante());

        input.close();
    }
}
