package unidade5.exerc_23_refatoracao.relacionamentos;

import java.util.ArrayList;
import java.util.List;

import unidade5.exerc_23_refatoracao.componentes_negocio.CalculaSalarioFuncionarioComponent;
import unidade5.exerc_23_refatoracao.componentes_negocio.CalculaTotalVendasComponent;
import unidade5.exerc_23_refatoracao.entidades.Funcionario;

public class FuncionarioPagamento {

    private int anoPagamento;
    public int getAnoPagamento(){
        return anoPagamento;
    }

    private int mesPagamento;
    public int getMesPagamento(){
        return mesPagamento;
    }

    public String getFullMesPagamento(){
        String mes = Integer.toString(mesPagamento);
        if(mes.length() == 1){
            mes = "0"+mes;
        }
        return mes+"/"+Integer.toString(anoPagamento);
    }

    private Funcionario funcionario;
    public Funcionario getFuncionario(){
        return funcionario;
    }

    private boolean valorTotalVendas_calculado = false;
    private double valorTotalVendas;
    public double getValorTotalVendas(){
        if(!valorTotalVendas_calculado)
        {
            valorTotalVendas = CalculaTotalVendasComponent.calcuar(vendasProdutos);
            valorTotalVendas_calculado = true;
        }
        return valorTotalVendas;
    }

    private boolean salario_calculado = false;
    private double salario;
    public double getTotalSalario(){
        if(!salario_calculado)
        {
            salario = CalculaSalarioFuncionarioComponent.calcuar(vendasProdutos);
            salario_calculado = true;
        }
        return salario;
    }

    private List<FuncionarioProdutoVenda> vendasProdutos = new ArrayList<>();
    public List<FuncionarioProdutoVenda> getVendasProdutos(){
        return vendasProdutos;
    }

    public void adicionarVendaDeProduto(FuncionarioProdutoVenda funcionarioProdutoVenda){
        vendasProdutos.add(funcionarioProdutoVenda);
    }

    public void adicionarVendasDeProduto(List<FuncionarioProdutoVenda> funcionarioProdutoVendas){
        vendasProdutos.addAll(funcionarioProdutoVendas);
    }

    public void removerVendaDeProduto(FuncionarioProdutoVenda funcionarioProdutoVenda){
        if(vendasProdutos.contains(funcionarioProdutoVenda)){
            vendasProdutos.remove(funcionarioProdutoVenda);
        }
    }

    public FuncionarioPagamento(Funcionario funcionario, int mes, int ano) {
        this.funcionario = funcionario;
        this.anoPagamento = ano;
        this.mesPagamento = mes;
    }
}
