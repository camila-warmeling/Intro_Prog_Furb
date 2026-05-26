package unidade5.exerc_23_refatoracao.console_desing;

public class Escritor {
    public void escrever(String texto){
        System.out.println(texto);
    }

    public void escreverErro(String erro){
        System.err.println(erro);
    }
}
