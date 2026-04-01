package unidade4;

import java.util.Scanner;

public class ExemploSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Digite um número de 0 a 5:");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Opção 1");                
                break;
            
            case 2:
                System.err.println("Opção 2");
                break;

            case 3:
                System.out.println("Opção 3");
                break;

            case 4:
                System.out.println("Opção 4");                
                break;
            
            case 5:
                System.err.println("Opção 5");
                break;

            default: //else. Se não tiver o default o switch pode dar erro se digitar uma valor tem acima.
                System.out.println("Opção não existe"); 
                break;
        }
        sc.close();
    }
}
