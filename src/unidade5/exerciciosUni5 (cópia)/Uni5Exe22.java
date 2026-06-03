package unidade5.exerciciosUni5;

public class Uni5Exe22 {

    public static void main(String[] args) {
        
        double salarioAtual = 2000, aumento = 1.5, anoAtual = 1996;  

        while(anoAtual < 2026){
            salarioAtual = salarioAtual + ((salarioAtual * aumento)/100);
            aumento *= 2;
            anoAtual ++;
        }
        System.out.println("No ano de 2026 o salário vai ser de R$"+String.format("%.2f",salarioAtual)+" com um aumento de %"+aumento);
    }
}
