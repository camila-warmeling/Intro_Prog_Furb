package exerciciosUni2;
import java.util.Scanner;

public class Uni2Exe01 {
    public static void main(String[] args) {
        int numero1, numero2, soma; //declarando variáveis do tipo int sem definir um valor
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        numero1 = input.nextInt();
        System.out.println("Digite o segundo número:");
        numero2 = input.nextInt();
        soma = numero1 + numero2;
        System.out.println("A soma é " + soma);

        input.close();
    }
}
