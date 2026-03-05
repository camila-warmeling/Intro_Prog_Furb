package exercicios;
import java.util.Scanner;

public class Uni2Exe01 {
    public static void main(String[] args) {
        int numero1, numero2, soma; //declarando duas variáveis do tipo int sem definir um valor
        Scanner usuario = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        numero1 = usuario.nextInt();
        System.out.println("Digite o segundo número:");
        numero2 = usuario.nextInt();
        soma = numero1 + numero2;
        System.out.println("A soma é " + soma);

        usuario.close();
    }
}
