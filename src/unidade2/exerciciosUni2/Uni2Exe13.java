package unidade2.exerciciosUni2;

import java.util.Scanner;

public class Uni2Exe13 {
    public static void main(String[] args) {
        //Dois carros (X e Y) partem em uma mesma direção. 
        //O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.
        //Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, 
        //ou seja, consegue se afastar um quilômetro a cada 2 minutos. 
        //Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y 
        //tomar essa distância do outro carro X.
    
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a distância em Km:");
        double distancia = input.nextDouble();

        if (distancia >= 0){
            double tempo = distancia * 2;
            tempo = Math.round(tempo * 100.0) / 100.0;
            System.out.printf("Para o carro Y se distanciar %.2f Km do carro X precisa de %.0f minutos aproximadamente", distancia, tempo);
        }
        
        else{
            System.out.println("Valor inválido!");
        }

        input.close();
    }
}
