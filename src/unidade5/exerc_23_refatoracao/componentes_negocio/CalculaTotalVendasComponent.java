package unidade5.exerc_23_refatoracao.componentes_negocio;

import java.util.List;

import unidade5.exerc_23_refatoracao.relacionamentos.FuncionarioProdutoVenda;

public class CalculaTotalVendasComponent {
    public static double calcuar(List<FuncionarioProdutoVenda> vendas){
        double totalVendas = 0;
        
        for (FuncionarioProdutoVenda venda : vendas) {
            totalVendas += venda.getValorTotalVenda();
        }

        return totalVendas;
    }
}
