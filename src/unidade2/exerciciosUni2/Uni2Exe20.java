package unidade2.exerciciosUni2;

import java.util.Scanner;

public class Uni2Exe20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de vezes (tem que ser par) que o papel será dobrado:");
        int quantDobraduras = input.nextInt();
        int resto = quantDobraduras%2;

        if (resto == 0 & quantDobraduras >= 0){
            int quantQuadrados = (int) Math.pow(2, quantDobraduras);
            System.out.printf("A quantidade de quadrados que podem ser vistos após dobra-lo %d vezes é %d quadradinhos", quantDobraduras, quantQuadrados);
        }
        
        else{
            System.out.println("Valor inválido!");
        }

        input.close();
    }
}

 
