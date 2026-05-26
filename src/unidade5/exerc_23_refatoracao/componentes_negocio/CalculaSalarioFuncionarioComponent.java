package unidade5.exerc_23_refatoracao.componentes_negocio;

import java.util.List;

import unidade5.exerc_23_refatoracao.relacionamentos.FuncionarioProdutoVenda;

public class CalculaSalarioFuncionarioComponent {
    public static double calcuar(List<FuncionarioProdutoVenda> vendas){
        double percentualComissao = 0.3;
        double totalVendas = CalculaTotalVendasComponent.calcuar(vendas);

        double salario = percentualComissao * totalVendas;
        return salario;
    }
}
