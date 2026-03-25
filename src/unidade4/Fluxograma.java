package unidade4;

import java.util.Scanner;

public class Fluxograma {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a idade:");
    int idade = sc.nextInt();

    if(idade >= 80){
        System.out.println("Idoso");
    }

    else if(idade >= 60){
        System.out.println("Terceira idade");
    }

    else if(idade >=18){
        System.err.println("Adulto");
    }

    else if(idade > 6){
            System.out.println("Criança");
        }

        else{
            System.out.println("Infantil");
        }

    sc.close();
    }
}
