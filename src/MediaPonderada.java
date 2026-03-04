import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        // Calculo da media ponderada da disciplina
        // float prova1 = 7;
        // float prova2 = 9;
        // float trabalhoFinal = 9.7f; //quando se usa float deve se colocar um f após o
        // número caso for decimal
        // float mediaTrabalhos = (10 + 8.5f + 0 + 5 + 10 + 9.8f + 9.5f)/7;
        // float media = prova1 * 0.2f + prova2 * 0.3f + trabalhoFinal * 0.3f +
        // mediaTrabalhos * 0.2f;
        // System.out.println("Média Aritmética Final é " + String.format("%.2f",
        // media));

        float prova1 = 0;
        float prova2 = 0;
        float trabalhoFinal = 0;
        float mediaDosTrabalhos = 0;
        float trabalhoUnidade1 = 0;
        float trabalhoUnidade2 = 0;
        float trabalhoUnidade3 = 0;
        float trabalhoUnidade4 = 0;
        float trabalhoUnidade5 = 0;
        float trabalhoUnidade6 = 0;
        float trabalhoUnidade7 = 0;
        float mediaFinalPonderada = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a nota da prova 1");
        prova1 = teclado.nextFloat();

        System.out.println("Digite a nota da prova 2");
        prova2 = teclado.nextFloat();

        System.out.println("Digite a nota do trabalho final");
        trabalhoFinal = teclado.nextFloat();

        System.out.println("Digite a nota do trabalho da unidade 1 ");
        trabalhoUnidade1 = teclado.nextFloat();

        System.out.println("Digite a nota do trabalho da unidade 2 ");
        trabalhoUnidade2 = teclado.nextFloat();

        System.out.println("Digite a nota do trabalho da unidade 3 ");
        trabalhoUnidade3 = teclado.nextFloat();

        System.out.println("Digite a nota do trabalho da unidade 4 ");
        trabalhoUnidade4 = teclado.nextFloat();

        System.out.println("Digite a nota do trabalho da unidade 5 ");
        trabalhoUnidade5 = teclado.nextFloat();

        System.out.println("Digite a nota do trabalho da unidade 6 ");
        trabalhoUnidade6 = teclado.nextFloat();

        System.out.println("Digite a nota do trabalho da unidade 7 ");
        trabalhoUnidade7 = teclado.nextFloat();

        mediaDosTrabalhos = (trabalhoUnidade1 + trabalhoUnidade2 + trabalhoUnidade3 + trabalhoUnidade4
                + trabalhoUnidade5 + trabalhoUnidade6 + trabalhoUnidade7) / 7;

        mediaFinalPonderada = prova1 * 0.2f + prova2 * 0.3f + trabalhoFinal * 0.3f + mediaDosTrabalhos * 0.2f;
        
        System.out.println("Media final do Aluno é: " + mediaFinalPonderada);
        System.out.println("Media final do Aluno é: " + String.format("%.2f", mediaFinalPonderada));
        System.out.printf("Media final do Aluno é: %.2f%n", mediaFinalPonderada); //%.2 fica duas casas decimais. Precisa ser vírgula e não + pq o printf espera dois parâmetros, a string com a formatação e a variável.
        DecimalFormat df = new DecimalFormat("0.00"); //formatar o número
        System.out.println("Media final do Aluno é: " + df.format(mediaFinalPonderada)); //concatena e chama a variável do DecimalFormat

        if  (mediaFinalPonderada >= 6){
            System.out.println("A aluna está aprovada!");
        }
        else{
            System.out.println("A aluna está reprovada");
        }

        teclado.close();
    }
}
