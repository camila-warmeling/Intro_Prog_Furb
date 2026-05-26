*Exercício 23*

**Enunciado**

Uma grande loja de departamentos paga aos vendedores um salário com base nas vendas efetuadas durante o mês, que é igual a 30% de comissão sobre o preço de cada produto vendido. Cada vendedor, em um determinado mês, vende n produtos, onde, para cada produto tem-se o preço unitário e a quantidade vendida. O departamento de pessoal deseja obter um relatório com: nome, total de vendas (em R$) e salário de cada vendedor. Descreva um algoritmo que gere o relatório desejado. Para prosseguir com a entrada de dados o algoritmo deve apresentar a seguinte mensagem: “deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?”. O número de produtos (n) de cada vendedor deve ser informado.

**Fluxograma**

Início do loop
    Pergunta nome do funcionário
    *Input usuário
    Pergunta quantos produtos distintos o funcionário vendeu
    *Input usuário
    Entra em outro loop para cada produto vendido
        Pergunta valor unitário do produto (vu)
        *input usuario
        Pergunta quantidade de produtos vendidos (qnt)
        *Input usuário
    Fecha loop ao finalizar todos produtos
    Sistema calcula, para cada produto informado, o total vendido (vu*qnt)
    Soma total retorna no total de vendas
    30% dessa soma retorna no salário
    Pergunta se usuário deseja cadastrar outro funcionário
    Caso Sim, retorna ao início do loop, caso contrário, encerra o programa

**Estrutura**

Relatorio.java -> arquivo de entrada

entidades/
    |
    |__ Contém as entidades (classes representantes de ideias reais) principais do projeto
    |__ Funcionario.java
    |__ Produto.java

relacionamentos/
    |
    |__ contém os relacionamentos entre entidades (representam as ligações entre ideias)
    |__ FuncionarioProdutoVenda.java
    |__ FuncionarioPagamento.java

componentes_negocio/
    |
    |__ contém os arquivos com as regras de negócio (como regras de cálculo)
    |__ CalculaTotalVendasFuncionario.java
    |__ CalculaSalarioFuncionario.java

componentes_desing/
    |
    |__ contém os designers do projeto, para apresentação visual