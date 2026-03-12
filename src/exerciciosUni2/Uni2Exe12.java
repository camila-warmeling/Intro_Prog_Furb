package exerciciosUni2;

import java.util.Locale;
import java.util.Scanner;

public class Uni2Exe12 {
    public static void main(String[] args) {
        //Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, 
        //p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, 
        //segundo a fórmula: distancia = Raiz ((x2-x1)²+(y2-y1)²)

        Scanner input = new Scanner(System.in);
        input.useLocale(new Locale("pt", "BR"));

        System.out.println("Digite o valor de x1:");
        int x1 = input.nextInt();
    
        System.out.println("Digite o valor de x2:");
        int x2 = input.nextInt();

        System.out.println("Digite o valor de y1:");
        int y1 = input.nextInt();

        System.out.println("Digite o valor de y2:");
        int y2 = input.nextInt();
    
        double valorX = Math.pow((x2-x1), 2);
        double valorY = Math.pow((y2-y1), 2);

        double distancia = Math.sqrt(valorX + valorY);

        System.out.println("A distância é: " + String.format("%.4f", distancia));
    
        input.close();
    }
}
