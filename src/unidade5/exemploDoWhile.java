package unidade5;

import java.util.Scanner;

public class exemploDoWhile {

    private static int numero1 = 0;
    private static int numero2 = 0;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean sair = false;
        int opcao = 0;

        do {
            System.out.println("Menu");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("9 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    somar();
                    break;

                case 2:
                    subtrair();
                    break;

                case 3:
                    multiplicar();
                    break;

                case 4:
                    dividir();
                    break;

                case 9:
                    sair = true;
                    System.out.println("FIM!");
                    break;

                default:
                    System.out.println("Digite um número válido!");
            }

        } while (!sair);

        sc.close();
    }

    private static void obterValores() {
        System.out.println("Digite o número 1:");
        numero1 = sc.nextInt();
        System.out.println("Digite o número 2:");
        numero2 = sc.nextInt();
    }

    private static void somar() {
        obterValores();
        int resultado = numero1 + numero2;
        System.out.println("A soma é " + resultado);
    }

    private static void subtrair() {
        obterValores();
        int resultado = numero1 - numero2;
        System.out.println("A subtração é " + resultado);
    }

    private static void multiplicar() {
        obterValores();
        int resultado = numero1 * numero2;
        System.out.println("A multiplicação é " + resultado);
    }

    private static void dividir() {
        obterValores();
        if(numero2 == 0){
            System.out.println("Não pode dividir por zero!");
        }else{
            int resultado = numero1 / numero2;
            System.out.println("A divisão é " + resultado);
        }
    }
}