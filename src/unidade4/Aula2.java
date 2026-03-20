package unidade4;

public class Aula2 {

    public static void main(String[] args) {
        
        float media = 6.5f;
        float frequencia = 79.8f;


        if (media>=6 && frequencia >=75){ //&& - and
            System.out.println("Aprovado");
            System.out.println("Parabéns");
        }

        else{
            System.out.println("Reprovado");
            System.out.println("Refaça a disciplina");
        }
    }
}
