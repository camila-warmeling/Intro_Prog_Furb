package unidade4.exerciciosUni4;

import java.util.Scanner;

public class Uni4Exe06 {

    private String caracterUsuario;
    private String resultado;

    public Uni4Exe06(String caracterUsuario){
        this.caracterUsuario = caracterUsuario;
    }

    public String verificarCaracter(){
        if(this.caracterUsuario.equals("M")){
            resultado = "Masculino";
        }
        else if(this.caracterUsuario.equals("F")){
            resultado = "Feminino";
        }
        else if(this.caracterUsuario.equals("I")){
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
        String caracter = input.next().toUpperCase();

        Uni4Exe06 classeExec = new Uni4Exe06(caracter);
        System.out.println(classeExec.verificarCaracter());

        input.close();
    }
}
