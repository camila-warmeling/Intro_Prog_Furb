package unidade5;

import java.util.Scanner;

public class ExemploFor {
    public static void main(String[] args) {
        //inicialização; limite; incremento
        
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        //looping infinito
        // for(;;){
        //     System.out.println("");
        // }

        for(int i = 10; i>=0; i--){
            System.out.println(i);
        }

        //for(int i=0; i<=10; i++){
        //    if((i%2)==0){
        //        System.out.println(i);
        //    }
        //}

        for(int i=0; i<=10; i+=2){
            System.out.println(i);
        }

        for(char x='a'; x<='z'; x++){
            System.out.println(x);
        }

        for(double i=0.1; i<=10; i+=0.1){
            System.out.println(i);
        }

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<=5; i++){
            System.out.println("Digite o nome");
            String nome = sc.next();
            System.out.println("Digite a idade");
            int idade = sc.nextInt();
            System.out.println("A pessoa " + nome + " tem " + idade);
        }
        sc.close();
    }
}
