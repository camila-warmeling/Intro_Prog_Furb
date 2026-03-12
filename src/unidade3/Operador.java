package unidade3;

public class Operador {
    public static void main(String[] args) {
        String texto = "Amanhã é quinta-feira";
        texto = texto.toLowerCase();
        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());


        boolean ehPalavra = false;
        ehPalavra = (texto.equals("Amanhã é sexta-feira")); //equals - comparador de texto
        System.out.println(ehPalavra); //equals é chamado de text sensitive pq ele distingui letras de maiúscula e minúscula
    }
}
