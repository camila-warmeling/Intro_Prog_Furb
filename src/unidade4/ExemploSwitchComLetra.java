package unidade4;

import java.util.Scanner;

public class ExemploSwitchComLetra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Digite uma vogal:");
        char letraDigitada = sc.next().toUpperCase().charAt(0); //charAt pega a letra de índice 0. Se a pessoa digitar ab, vai desonsiderar o b e ficar somente com o a.
        
        switch (letraDigitada){ //vai fazer as verificaçõs (if) com a variável que está entre parênteses.
            case 'A':
                System.out.println("Vogal A");
                break;
        
            case 'E':
                System.out.println("Vogal E");
                break;

            case 'I':
                System.out.println("Vogal I");
                break;

            case 'O':
                System.out.println("Vogal O");
                break;

            case 'U':
                System.out.println("Vogal U");
                break;

            default:
                System.out.println("Não é uma vogal");
                break;
        }
    
        sc.close();
    }
}
