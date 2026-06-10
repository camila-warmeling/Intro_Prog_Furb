package unidade6.exerciciosUni6;

import java.util.ArrayList;
import java.util.Scanner;

public class Uni6Exe09ArrayList {
    public Scanner input = new Scanner(System.in);
    public int tamanho = 30;
    public ArrayList<ArrayList<Integer>> listaMatriz = new ArrayList<>(); //recebe uma lista de inteiros
    public int quantHomens = 0;

    private Uni6Exe09ArrayList(){
        solicitarDados();
        mostrarResultados();
    }

    private void solicitarDados(){
        int sexo, nota, idade;
        for(int i=0; i<tamanho; i++){
            ArrayList<Integer> dadosClientes = new ArrayList<>();

            System.out.println("--------DIGITE OS DADOS--------");
            System.out.println("Digite o sexo (1 = feminino, 2 = masculino):");
            sexo = input.nextInt();
            System.out.println("Digite a nota (0-10):");
            nota = input.nextInt();
            System.out.println("Digite a idade:");
            idade = input.nextInt();

            dadosClientes.add(sexo);
            dadosClientes.add(nota);
            dadosClientes.add(idade);

            listaMatriz.add(dadosClientes);
        }
    }   

    private float calcularMediaNotasCinema(){
        float mediaCinema;
        int somaNotasCinema = 0;
        for(int i=0; i<tamanho; i++){
            somaNotasCinema += listaMatriz.get(i).get(1);
        }
        mediaCinema = (float)somaNotasCinema/tamanho; 
        return mediaCinema;
    }

    private float calcularMediaNotasHomensCinema(){
        float mediaNotasHomens;
        int somaNotaHomens = 0;

        for(int i=0; i<tamanho; i++){
            if(listaMatriz.get(i).get(0) == 2){
                quantHomens ++;
                somaNotaHomens += listaMatriz.get(i).get(1);
            }
        }
        mediaNotasHomens = (float)somaNotaHomens/quantHomens;

        return mediaNotasHomens;
    }

    private ArrayList<ArrayList<Integer>> encontrarMulheresNoVetorMatriz(){
        ArrayList<ArrayList<Integer>> listaMulheres = new ArrayList<>();

        for(int i=0; i<tamanho; i++){
            if(listaMatriz.get(i).get(0) == 1){
                ArrayList<Integer> dadosMulher = new ArrayList<>();

                int notaMulher = listaMatriz.get(i).get(1);//nota
                int idadeMulher = listaMatriz.get(i).get(2);//idade

                dadosMulher.add(notaMulher);
                dadosMulher.add(idadeMulher);
                listaMulheres.add(dadosMulher);
            }
        }

        return listaMulheres;
    }

    private int encontrarNotaMulherMaisJovem(){
        ArrayList<ArrayList<Integer>> listaMulheresCinema = encontrarMulheresNoVetorMatriz();

        if(listaMulheresCinema.size() == 0){
            return 0;
        }

        int mulherMaisJovem = listaMulheresCinema.get(0).get(1);
        int indiceMulherMaisJovem = 0;

        for(int i=0; i<listaMulheresCinema.size(); i++){
            if(mulherMaisJovem > listaMulheresCinema.get(i).get(1)){
                mulherMaisJovem = listaMulheresCinema.get(i).get(1);
                indiceMulherMaisJovem = i;
            }
        }
        int notaMulherMaisJovem = listaMulheresCinema.get(indiceMulherMaisJovem).get(0);

        return notaMulherMaisJovem;
    }

    private int calcularNotasMulheresMaiorMediaCinema(){
        ArrayList<ArrayList<Integer>> listaMulheresCinema = encontrarMulheresNoVetorMatriz();
        float mediaCinema = calcularMediaNotasCinema();
        int quantMulheresAcima50MediaMaior = 0;

        for(int i=0; i<listaMulheresCinema.size(); i++){
            if(listaMulheresCinema.get(i).get(0)>mediaCinema && listaMulheresCinema.get(i).get(1) > 50){
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
        new Uni6Exe09ArrayList();
    }
}
