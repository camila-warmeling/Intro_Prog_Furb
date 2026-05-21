package unidade6;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Marina");
        nomes.add("Josefina");

        for(int i=0; i<5; i++){
            System.out.println("Digite um nome:");
            nomes.add(sc.next());
            //se fosse um vetor: nomes[i] = sc.next();
        }

        System.out.println(nomes); //imprime toda a lista [item1, item2, ...]

        sc.close();
    }
}
