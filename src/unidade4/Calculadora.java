package unidade4;

import java.util.Scanner;

public class Calculadora {

        Scanner sc = new Scanner(System.in);
        float numero1, numero2, resultado;
        char operador;

        public Calculadora(){
            //construtor
            obterValores();
            executarOperacao();
            exibirResultado();
        }

        private void obterValores(){
            //recebe os numeros que o usuario digitar
            System.out.println("Digite o número 1");
            numero1 = sc.nextFloat();

            System.out.println("Digite o número 2");
            numero2 = sc.nextFloat();
        }

        private void executarOperacao(){
            System.out.println("Digite a operação \n" +
                            "+ para somar \n" + 
                            "- para subtrair \n" + 
                            "* para multiplicar \n" + 
                            "/ para dividir \n" + 
                            "^ para exponenciação \n" +
                            "% para resto da divisão");

            operador = sc.next().charAt(0);
            if (operador == '+'){
                somar(numero1, numero2);
            }
            else if (operador == '-'){
                subtrair(numero1, numero2);
            }
            else if (operador == '*'){
                multiplicar(numero1, numero2);
            }
            else if (operador == '/'){
                dividir(numero1, numero2);
            }
            else if (operador == '^'){
                potencia(numero1, numero2);
            }
            else if (operador == '%'){
                restoDivisao(numero1, numero2);
            }
            else{
                System.err.println("Operador inválido!");
            }
        }

        public void exibirResultado(){
            System.err.println("O resultado é: " + resultado);
        }

    public static void main(String[] args) {
        new Calculadora();
    }

    private void somar(float numero1, float numero2){
        resultado =  numero1 + numero2;
    }

    private void subtrair(float numero1, float numero2) {
        resultado =  numero1 - numero2;
    }

    private void multiplicar(float numero1, float numero2) {
        resultado =  numero1 * numero2;
    }

    private void dividir(float numero1, float numero2) {
        if(numero2 > 0){
            resultado =  numero1 / numero2;
        }
        else{
            System.out.println("o numero 2 deve ser maior que zero!");
        }
    }

    private void potencia(float numero1, float numero2) {
        resultado = (float)(Math.pow(numero1, numero2));//vai transformar de double para float (Math.pow retorna um double). Chamado de cast.
    }

    private void restoDivisao(float numero1, float numero2) {
        if(numero2 > 0){
            resultado =  numero1 % numero2;
        }
        else{
            System.out.println("o numero 2 deve ser maior que zero!");
        }
    }
}  
    


    

