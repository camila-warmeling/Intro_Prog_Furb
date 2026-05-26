package unidade5.exerc_23_refatoracao;

import java.util.ArrayList;
import java.util.List;

import unidade5.exerc_23_refatoracao.console_desing.Escritor;
import unidade5.exerc_23_refatoracao.console_desing.Leitor;
import unidade5.exerc_23_refatoracao.entidades.Funcionario;
import unidade5.exerc_23_refatoracao.entidades.Produto;
import unidade5.exerc_23_refatoracao.relacionamentos.FuncionarioPagamento;
import unidade5.exerc_23_refatoracao.relacionamentos.FuncionarioProdutoVenda;

public class Relatorio {

    private List<FuncionarioPagamento> funcionariosPagamento = new ArrayList<>();
    private Leitor leitor;
    private Escritor escritor;

    public Relatorio() {
        leitor = new Leitor();
        escritor = new Escritor();
    }

    public static void main(String[] args) {
        Relatorio relatorio = new Relatorio();
        relatorio.executar();
    }

    public void executar(){
        carregarDados();
        emitir();
    }

    private void carregarDados(){
        while(true){
            String nomeFuncionario = leitor.LerTexto("DIGITE O NOME DO FUNCIONÁRIO:");
            Funcionario funcionario = new Funcionario(nomeFuncionario);
            List<FuncionarioProdutoVenda> vendasFuncionario = new ArrayList<>();;

            int quantidadeProdutosVenda = leitor.LerInteiro(0, 5, "DIGITE O NÚMERO DE PRODUTOS DISTINTOS QUE O FUNCIONÁRIO VENDEU");
            for (int contador = 1; contador <= quantidadeProdutosVenda; contador++){
                String nomeProduto = leitor.LerTexto("DIGITE O NOME DO PRODUTO "+contador);
                double valorProduto = leitor.LerDouble(0, 9999, "DIGITE O VALOR UNITÁRIO DO PRODUTO");

                Produto produto = new Produto(nomeProduto, valorProduto);

                int quantidadeProdutosVendidos = leitor.LerInteiro(0, 999, "DIGITE A QUANTIDADE DE PRODUTOS "+produto.getNome()+" VENDIDOS");

                FuncionarioProdutoVenda funcionarioProdutoVenda = new FuncionarioProdutoVenda(funcionario, produto, quantidadeProdutosVendidos);
                vendasFuncionario.add(funcionarioProdutoVenda);
            }

            FuncionarioPagamento pagamento = new FuncionarioPagamento(funcionario, 5, 2026);
            pagamento.adicionarVendasDeProduto(vendasFuncionario);

            funcionariosPagamento.add(pagamento);

            char continuarLoop = leitor.LerTexto("ADICIONAR MAIS ALGUM FUNCIONÁRIO? S/N").toUpperCase().charAt(0);
            if(continuarLoop != 'S') {
                break;
            }
        }
    }

    private void emitir(){
        for (FuncionarioPagamento funcionarioPagamento : funcionariosPagamento) {
            escritor.escrever("==============================================");
            escritor.escrever("FUNCIONÁRIO "+funcionarioPagamento.getFuncionario().getNome());
            escritor.escrever("ID"+funcionarioPagamento.getFuncionario().getId());
            escritor.escrever("PAGAMENTO DE "+funcionarioPagamento.getFullMesPagamento());
            escritor.escrever("TOTAL DE VENDAS: R$"+funcionarioPagamento.getValorTotalVendas());
            escritor.escrever("SALÁRIO: R$"+funcionarioPagamento.getTotalSalario());
            escritor.escrever("");
        }
    }
}
