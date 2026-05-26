package unidade5.exerc_23_refatoracao.entidades;

public class Produto {
    private String nome;
    public void setNome(String novoNome){
        nome = novoNome;
    }
    public String getNome(){
        return this.nome;
    }

    private double valor;
    public void setvalor(double novoValor){
        valor = novoValor;
    }
    public double getValor(){
        return this.valor;
    }

    public Produto(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }
}
