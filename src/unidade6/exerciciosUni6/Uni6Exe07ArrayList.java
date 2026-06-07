package unidade6.exerciciosUni6;

import java.util.ArrayList;
import java.util.Scanner;

public class Uni6Exe07ArrayList {
// Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base neste valor, crie um 
//vetor do tipo inteiro. Em seguida, solicite ao usuário para digitar um número inteiro várias vezes, 
//até preencher o vetor. Esse número deverá ser armazenado no vetor caso ainda não exista, e se o valor 
//já existir deve ser pedido um novo valor. Isto é, se o usuário informar o número 2 e já existir o número 
//2 em alguma posição do vetor, o número não deve ser adicionado. Após ter adicionado todos os números 
//dentro do vetor, o mesmo deve ser ordenado. Para isso reordene os elementos internos do vetor de modo 
//que este fique em ordem crescente, conforme no exemplo:
//Vetor origem: [0][4][2][6][3]
//Vetor ordenado: [0][2][3][4][6]

    public Scanner input = new Scanner(System.in);
    public ArrayList<Integer> listaNumeros = new ArrayList<>();
    public ArrayList<Integer> listaOrdenada = new ArrayList<>();
    public int tamanho = 0;

    private Uni6Exe07ArrayList(){
        solicitarNumerosParaLista();
        criarCopiaLista();
        ordenarLista();
        mostrarListas();
    }

    private int solicitarTamanhoLista(){
        do{
            System.out.println("Digite o tamanho da lista:");
            tamanho = input.nextInt();
            if(tamanho > 20){
                System.out.println("Tamanho inválido! Valor máximo: 20");
            }
        }while(tamanho > 20);

        return tamanho;
    }

    private void solicitarNumerosParaLista(){
        int tam = solicitarTamanhoLista();

        for(int i=0; i<tam; i++){
            System.out.println("Digite um número:");
            int numero = input.nextInt();
            boolean numeroEncontrado = procurarNumeroLista(numero);
            if(numeroEncontrado == false){
                listaNumeros.add(numero);
                System.out.println("O número " + numero + " foi adicionado com sucesso!");
            }else{
                System.out.println("O número " + numero + " já existe na lista, tente novamente!");
                i--;
            }
        }
    }

    private boolean procurarNumeroLista(int numProcurar){
    boolean numEncontrado = false;

        for(int i=0; i<listaNumeros.size(); i++){
            if(listaNumeros.get(i) == numProcurar){
                numEncontrado = true;
                break;
            }
        }
        return numEncontrado;
    }

    private void criarCopiaLista(){
        for(int i=0; i<tamanho; i++){
            int numero = listaNumeros.get(i);
            listaOrdenada.add(numero);
        }
    }

    private void ordenarLista(){
        int variavelTemporaria;
        for(int i=0; i<tamanho-1; i++){
            if(listaOrdenada.get(i)>listaOrdenada.get(i+1)){
                variavelTemporaria = listaOrdenada.get(i);
                listaOrdenada.set(i, listaOrdenada.get(i+1));
                listaOrdenada.set(i+1, variavelTemporaria);

                i = -1;
            }
        }
    }

    private void mostrarListas(){
        System.out.println("Lista inicial: " + listaNumeros);
        System.out.println("Lista ordenada: " + listaOrdenada);
    }

    public static void main(String[] args) {
        new Uni6Exe07ArrayList();
    }
}
