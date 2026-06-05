package unidade6.exerciciosUni6;

import java.util.Scanner;

public class Uni6Exe10Vetor {

    Scanner input = new Scanner(System.in);
    public int  tamanho = 50, opcao = 0, posicaoFim = 0, valor;
    public int[] vetor = new int[tamanho];


    private Uni6Exe10Vetor(){
        receberOpcao();
    }

    private void receberOpcao(){

        do{ 
            System.out.println("1 - Incluir valor");
            System.out.println("2 – Pesquisar valor");
            System.out.println("3 – Alterar valor");
            System.out.println("4 – Excluir valor");
            System.out.println("5 – Mostrar valores");
            System.out.println("6 – Ordenar valores");
            System.out.println("7 – Inverter valores");
            System.out.println("8 – Sair do sistema");

            System.out.println("Digite a opção que deseja:");
            opcao = input.nextInt();

            switch(opcao) {
                case 1: 
                    incluirValor();
                    break;

                case 2: 
                    pesquisarValor();
                    break;

                case 3:
                    alterarValor();
                    break;

                case 4: 
                    excluirValor();
                    break;

                case 5: 
                    mostrarValores();
                    break;

                case 6: 
                    ordenarValores();
                    break;

                case 7: 
                    inverterValores();
                    break;

                case 8: 
                    System.out.println("Você saiu do programa!");
                    break;
            
                default:
                    System.out.println("Opção inexistente!");
                    break;
            }
        }while(opcao != 8);
    }     

    private void incluirValor(){
        if(posicaoFim < vetor.length){  
            System.out.println("Digite o valor a ser adicionado:");
            int numero = input.nextInt();
            vetor[posicaoFim] = numero;
            System.out.println("Número inserido com sucesso!");
            posicaoFim ++;
        }else{
            System.out.println("Vetor cheio!");
        }
    }   

    private int pesquisarValor(){
        System.out.println("Digite o valor:");
        valor = input.nextInt();
        for(int i=0; i<posicaoFim; i++){
            if(valor == vetor[i]){
                System.out.println("O número "+ valor + " foi encontrado na posição " + i);
                return i;
            }
        }
        System.out.println("Número não encontrado");
        return -1;
    }

    private void alterarValor(){
        int posicaoAntiga = pesquisarValor();
        if(posicaoAntiga != -1){
            System.out.println("Digite o novo valor:");
            valor = input.nextInt();
            vetor[posicaoAntiga] = valor;
            System.out.println("Numero "+valor+" atualizado na posição "+posicaoAntiga);
        }
    }

    private void excluirValor(){
        int posicao = pesquisarValor();
        if(posicao != -1){
            for(int i=posicao; i<posicaoFim; i++){
                vetor[i] = vetor[i+1];
            }
            posicaoFim --;
            System.out.println("Número "+valor+" foi excluído!");
        }
    }

    private void mostrarValores(){
        System.out.println("Valores armazenados até o momento:");
        System.out.print("[");
        for(int i=0; i<posicaoFim-1; i++){
            System.out.print(vetor[i]+",");
        }
        System.out.print(vetor[posicaoFim-1]);
        System.out.println("]");
    }

    private void ordenarValores(){//método bolha alterado
        int temp;//variável temporária para não perder o valor maior na hora da troca
        for(int i=0; i<posicaoFim-1; i++){
            if(vetor[i]>vetor[i+1]){//vai do começo até o final repetidas vezes até que esteja em ordem
                temp = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = temp;
                i = -1; //zera o for, assim ele começa desde começo
            }
        }
        System.out.println("Valores ordenados!");
    }

    private void inverterValores(){
        int temp;
        for(int i=0; i<posicaoFim; i++){
            for(int j=0; j<i; j++){
                temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] =temp;
            }
        }
        System.out.println("Valores invertidos!");
    }

    public static void main(String[] args) {
        new Uni6Exe10Vetor();
    }
}
