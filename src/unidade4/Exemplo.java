package unidade4;

import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua idade:");
        int idade = sc.nextInt();

        System.out.println("Você é doador de sangue?");
        String respostaDoador = sc.next();
        boolean doador = false;
    //para valores se usa == para comparar. Se for string se usa equalsIgnoreCase - não diferencia letras maiúsculas de minúsculas
        if (respostaDoador.equalsIgnoreCase("Sim") || respostaDoador.equalsIgnoreCase("S")){
            doador = true;
        }

        System.out.println("Você é estudante?");
        String respostaEstudante = sc.next();
        boolean estudante = false;
        if (respostaEstudante.equalsIgnoreCase("Sim") || respostaEstudante.equalsIgnoreCase("S")){
           estudante = true;
        }
    //quando a variável é um boolean, se ela precisa ser verdadeira não precisa ser declarada
        if (idade < 18 || idade >=60 || doador || estudante){
            System.out.println("Meia Entrada!");
        }
        else{
            System.out.println("Entrada Inteira!");
        }

        sc.close();
    }
}
