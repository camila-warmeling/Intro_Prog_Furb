package unidade5.exerc_23_refatoracao.relacionamentos;

import unidade5.exerc_23_refatoracao.entidades.Funcionario;
import unidade5.exerc_23_refatoracao.entidades.Produto;

public class FuncionarioProdutoVenda {

    private Funcionario funcionario;
    public Funcionario getFuncionario(){
        return funcionario;
    }

    private Produto produto;
    public Produto getProduto(){
        return produto;
    }

    public int quantidadeProdutosVenda;

    public double getValorTotalVenda(){
        return quantidadeProdutosVenda * produto.getValor();
    }

    public FuncionarioProdutoVenda(Funcionario funcionario, Produto produto, int quantidadeProdutosVenda) {
        this.funcionario = funcionario;
        this.produto = produto;
        this.quantidadeProdutosVenda = quantidadeProdutosVenda;
    }

}
