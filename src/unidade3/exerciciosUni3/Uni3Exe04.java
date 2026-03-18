package unidade3.exerciciosUni3;

import java.util.Scanner;

public class Uni3Exe04 {
    private float nota1;
    private float nota2;
    private float nota3;

    public Uni3Exe04(float nota1, float nota2, float nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public float calcularMediaPonderada(){
        float mediaPonderada = (this.nota1 * 0.5f) + (this.nota2 * 0.3f) + (this.nota3 * 0.2f);
        return mediaPonderada;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        float n1 = input.nextFloat();

        System.out.println("Digite a segunda nota:");
        float n2 = input.nextFloat();

        System.out.println("Digite a terceira nota:");
        float n3 = input.nextFloat();

        Uni3Exe04 classe = new Uni3Exe04(n1, n2, n3);
        float calcular = classe.calcularMediaPonderada();
        System.out.println("A média ponderada do aluno é:" + String.format("%.2f", calcular));

        input.close();
    }

}
