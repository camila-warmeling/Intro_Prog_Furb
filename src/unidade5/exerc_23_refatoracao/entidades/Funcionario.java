package unidade5.exerc_23_refatoracao.entidades;

import java.util.Random;

public class Funcionario {
    private String nome;
    public void setNome(String novoNome){
        nome = novoNome;
    }
    public String getNome(){
        return this.nome;
    }

    private String id;
    public String getId(){
        return this.id;
    }

    public Funcionario(String nome){
        this.nome = nome;
        this.id = criarFuncionarioId();
    }

    private String criarFuncionarioId(){
        String result = "";
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        Random rand = new Random();

        char letraRandomica = alfabeto.charAt(rand.nextInt(26));
        int posicaoLetraRandomica = rand.nextInt(10);

        for (int index = 0; index < 10; index++){

            if(index == posicaoLetraRandomica)
            {
                result += letraRandomica;
            }
            else
            {
                int numeroRandomico = rand.nextInt(20);
                result += Integer.toString(numeroRandomico);
            }

        }

        return result;
    }

}
