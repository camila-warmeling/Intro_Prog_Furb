package unidade5.exerciciosUni5;

public class Uni5Exe04 {

    private double i, resultadoFinal;

    public Uni5Exe04(){
        somarDivisoes();
        mostrarResultados();
    }

    public void somarDivisoes(){
        for(i=1;i<=20;i++){
            resultadoFinal += (2.0*i+1) / (i*(i+1));
        }
    }

    public void mostrarResultados(){
        System.out.println("O resultado da soma é:" + String.format("%.2f", resultadoFinal));
    }

    public static void main(String[] args) {
        new Uni5Exe04();
    }
}
