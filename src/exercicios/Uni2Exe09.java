package exercicios;

import java.util.Scanner;

public class Uni2Exe09 {
    public static void main(String[] args) {
        //Uma pessoa foi até uma casa de câmbio trocar dólares por reais. 
        // Para isto ela entregou um valor em dólares para o atendente. 
        // Considerando que o atendente tem a cotação do dólar, 
        // calcule quantos reais o atendente deve devolver para a pessoa.

        double cotacaoDolar = 5.26;
        double valorDolar, valorReais;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de doláres:");
        valorDolar = input.nextDouble();

        valorReais = valorDolar * cotacaoDolar;

        System.out.printf("Foi dado %.2f em dólares" + " e deverá ser devolvido %.2f em reais", valorDolar, valorReais);
        
        input.close();
    }
}
