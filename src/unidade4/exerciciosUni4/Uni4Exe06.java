package unidade4.exerciciosUni4;

import java.util.Scanner;

public class Uni4Exe06 {

    private char caracterUsuario;
    private String resultado;

    public Uni4Exe06(char caracterUsuario){
        this.caracterUsuario = caracterUsuario;
    }

    public String verificarCaracter(){
        if(this.caracterUsuario == 'M'){
            resultado = "Masculino";
        }
        else if(this.caracterUsuario == 'F'){
            resultado = "Feminino";
        }
        else if(this.caracterUsuario == 'I'){
            resultado = "Não Informado";
        }
        else{
            resultado = "Entrada Incorreta";
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println(" M - Masculino\n F - feminino\n I - prefiro não informar");
        System.out.println("Digite o caracter:");
        char letra = input.next().toUpperCase().charAt(0);

        Uni4Exe06 classeExec = new Uni4Exe06(letra);
        System.out.println(classeExec.verificarCaracter());

        input.close();
    }
}
