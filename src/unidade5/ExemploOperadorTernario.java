package unidade5;

public class ExemploOperadorTernario {
    public static void main(String[] args) {
        boolean maiorDeIdade = false;
        //faz um if e else na mesma linha
        //recomendado para respostas curtas e de uma linha só.
        String resultado = (maiorDeIdade) ? "Sim" : "Não";

        System.out.println(resultado);

        int maiorDeIdade2 = 18;
        String resultado2 = (maiorDeIdade2 >= 18) ? "Sim" : "Não";

        System.out.println(resultado2);
    }
}
