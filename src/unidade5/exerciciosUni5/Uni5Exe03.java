package unidade5.exerciciosUni5;

public class Uni5Exe03{

    private double n, divisao, somaTotal;

    public Uni5Exe03(){
        somarDivisoes();
        mostrarResultados();
    }

    public void somarDivisoes(){
        for(n=1; n<=100; n++){
            divisao = 1/n;
            somaTotal += divisao;
        }
    }

    public void mostrarResultados(){
        System.out.println("A soma total aproximadamente é:" + String.format("%.2f",somaTotal));
    }

    public static void main(String[] args) {
        new Uni5Exe03();
    }
}
