package unidade6.exerciciosUni6;

import java.util.Scanner;

public class Uni6Exe09Vetor {

    public Scanner input = new Scanner(System.in);
    public int tamanho = 5, sexo, idade, nota;
    public int[][] vetorMatrizDadosClientes = new int[tamanho][3];//linha e depois coluna
    public int quantHomens = 0;

    private Uni6Exe09Vetor(){
        solicitarDados();
        mostrarResultados();
    }

    private void solicitarDados(){
        for(int i=0; i<tamanho; i++){
            System.out.println("--------DIGITE OS DADOS--------");
            System.out.println("Digite o sexo (1 = feminino, 2 = masculino):");
            vetorMatrizDadosClientes[i][0] = input.nextInt();
            System.out.println("Digite a nota (0-10):");
            vetorMatrizDadosClientes[i][1] = input.nextInt();
            System.out.println("Digite a idade:");
            vetorMatrizDadosClientes[i][2] = input.nextInt();
        }
    }   

    private float calcularMediaNotasCinema(){
        float mediaCinema;
        int somaNotasCinema = 0;
        for(int i=0; i<tamanho; i++){
            somaNotasCinema += vetorMatrizDadosClientes[i][1];
        }
        mediaCinema = (float)somaNotasCinema/tamanho; //(float)variável - transforma aquela variável no tipo float
        return mediaCinema;
    }

    private float calcularMediaNotasHomensCinema(){
        float mediaNotasHomens;
        int somaNotaHomens = 0;

        for(int i=0; i<tamanho; i++){
            if(vetorMatrizDadosClientes[i][0] == 2){
                quantHomens ++;
                somaNotaHomens += vetorMatrizDadosClientes[i][1];
            }
        }
        mediaNotasHomens = (float)somaNotaHomens/quantHomens;

        return mediaNotasHomens;
    }

    private int[][] encontrarMulheresNoVetorMatriz(){
        int[][] vetorMulheres = new int[tamanho-quantHomens][2];
        int linhaVetorMulheres = 0;

        for(int i=0; i<tamanho; i++){
            if(vetorMatrizDadosClientes[i][0] == 1){
                vetorMulheres[linhaVetorMulheres][0] = vetorMatrizDadosClientes[i][1];//nota
                vetorMulheres[linhaVetorMulheres][1] = vetorMatrizDadosClientes[i][2];//idade

                linhaVetorMulheres ++;
            }
        }

        return vetorMulheres;
    }

    private int encontrarNotaMulherMaisJovem(){
        int[][] vetorMulheresCinema = encontrarMulheresNoVetorMatriz();

        if(vetorMulheresCinema.length == 0){
            return 0;
        }

        int mulherMaisJovem = vetorMulheresCinema[0][1];
        int indiceMulherMaisJovem = 0;

        for(int i=0; i<vetorMulheresCinema.length; i++){
            if(mulherMaisJovem > vetorMulheresCinema[i][1]){
                mulherMaisJovem = vetorMulheresCinema[i][1];
                indiceMulherMaisJovem = i;
            }
        }
        int notaMulherMaisJovem = vetorMulheresCinema[indiceMulherMaisJovem][0];

        return notaMulherMaisJovem;
    }

    private int calcularNotasMulheresMaiorMediaCinema(){
        int[][] vetorMulheresCinema = encontrarMulheresNoVetorMatriz();
        float mediaCinema = calcularMediaNotasCinema();
        int quantMulheresAcima50MediaMaior = 0;

        for(int i=0; i<vetorMulheresCinema.length; i++){
            if(vetorMulheresCinema[i][0]>mediaCinema && vetorMulheresCinema[i][1] > 50){
                quantMulheresAcima50MediaMaior ++;
            }
        }

        return quantMulheresAcima50MediaMaior;
    }

    private void mostrarResultados(){
        float mediaHomens = calcularMediaNotasHomensCinema();

        System.out.println("--------RESULTADOS--------");

        System.out.println("A média recebida pelo cinema é: " + calcularMediaNotasCinema());
        if(quantHomens == 0){
            System.out.println("Não foi registrados clientes homens.");
        }else{
            System.out.println("A média de notas dos homens é: " + mediaHomens);
        }
        if(tamanho-quantHomens == 0){
            System.out.println("Não foi registrados clientes mulheres.");
        }else{
            System.out.println("A nota da mulher mais jovem é: " + encontrarNotaMulherMaisJovem());
            System.out.println("A quantidade de mulheres com mais de 50 anos e que atribuíram a nota maior que a média do cinema é: " + calcularNotasMulheresMaiorMediaCinema());
        }
    }

    public static void main(String[] args) {
        new Uni6Exe09Vetor();
    }
}
