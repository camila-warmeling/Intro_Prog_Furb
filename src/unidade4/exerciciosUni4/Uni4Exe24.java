package unidade4.exerciciosUni4;

import java.util.Scanner;

//Dados 3 valores, escreva um algoritmo que os informe em uma determinada ordem a 
//partir de um menu de opções:
//se opção = 1, escreva os 3 valores em ordem crescente
//se opção = 2, escreva os 3 valores em ordem decrescente
//se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio

public class Uni4Exe24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        float valor1 = input.nextFloat();

        System.out.println("Digite o segundo valor:");
        float valor2 = input.nextFloat();

        System.out.println("Digite o terceiro valor:");
        float valor3 = input.nextFloat();

        System.out.println("Opção 1 - valores em ordem crescente \nOpção 2 - valores em ordem decrescente \nOpção 3 - maior valor no meio");
        System.out.println("Digite a opção que você deseja:");
        int opcao = input.nextInt();

        switch (opcao){
            case 1: //crescente
                if(valor1 < valor2 && valor1 < valor3){ //valor1 menor
                    if(valor2 < valor3){ //valor3 maior
                        System.out.printf("%.2f %.2f %.2f", valor1, valor2, valor3);
                    }
                    else{ //valor2 maior
                        System.out.printf("%.2f %.2f %.2f", valor1, valor3, valor2);
                    }
                }

                else if(valor2 < valor1 && valor2 < valor3){ //valor2 menor
                    if(valor1 < valor3){ //valor3 maior
                        System.out.printf("%.2f %.2f %.2f", valor2, valor1, valor3);
                    }
                    else{ //valor1 maior
                        System.out.printf("%.2f %.2f %.2f", valor2, valor3, valor1);
                    }
                }

                else{ //valor3 menor
                    if(valor1 < valor3){ //valor2 maior
                        System.out.printf("%.2f %.2f %.2f", valor3, valor1, valor2);
                    }
                    else{ //valor1 maior
                        System.out.printf("%.2f %.2f %.2f", valor3, valor2, valor1);
                    }
                }
                break;

            case 2: //decrescente
                if(valor1 > valor2 && valor1 > valor3){ //valor1 maior
                    if(valor2 > valor3){ //valor3 menor
                        System.out.printf("%.2f %.2f %.2f", valor1, valor2, valor3);
                    }
                    else{ //valor2 menor
                        System.out.printf("%.2f %.2f %.2f", valor1, valor3, valor2);
                    }
                }

                else if(valor2 > valor1 && valor2 > valor3){ //valor2 maior
                    if(valor1 > valor3){ //valor3 menor
                        System.out.printf("%.2f %.2f %.2f", valor2, valor1, valor3);
                    }
                    else{ //valor1 menor
                        System.out.printf("%.2f %.2f %.2f", valor2, valor3, valor1);
                    }
                }

                else{ //valor3 maior
                    if(valor1 > valor3){ //valor2 menor
                        System.out.printf("%.2f %.2f %.2f", valor3, valor1, valor2);
                    }
                    else{ //valor1 menor
                        System.out.printf("%.2f %.2f %.2f", valor3, valor2, valor1);
                    }
                }
                break;

            case 3: //maior no meio
                if(valor1 > valor2 && valor1 > valor3){ //valor1 maior
                    System.out.printf("%.2f %.2f %.2f", valor2, valor1, valor3);
                }

                else if(valor2 > valor1 && valor2 > valor3){ //valor2 maior
                    System.out.printf("%.2f %.2f %.2f", valor1, valor2, valor3);
                }

                else{ //valor3 maior
                    System.out.printf("%.2f %.2f %.2f", valor1, valor3, valor2);
                }
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }
        input.close();
    }
}

