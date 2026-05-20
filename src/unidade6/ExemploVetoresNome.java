package unidade6;

public class ExemploVetoresNome {
    public static void main(String[] args) {
        String[] nomes = new String[10]; //vetor de string que cabe até 10 nomes
        nomes[0] = "João";
        nomes[1] = "Marina";
        nomes[3] = "Martina";
        nomes[4] = "João Vinicius";

        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);
        System.out.println(nomes[3]);
        System.out.println(nomes[4]);
        System.out.println(nomes[10]);
    }
}
