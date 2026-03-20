package unidade3.exerciciosUni3;

//azulejo R$ 12,50. Ler comprimento e altura de uma parede (em metros), 
//escrever o valor gasto com a compra de azulejos. 
//Considere que um metro quadrado é formado por 9 azulejos.

public class Uni3Exe13 {

    private double comprimentoParede;
    private double alturaParede;

    public Uni3Exe13 (float comprimentoParede, float alturaParede){
        this.comprimentoParede = comprimentoParede;
        this.alturaParede = alturaParede;
    }

    public double calcularQuantidadeAzulejos(){
        double quantAzulejos = Math.ceil((this.comprimentoParede * this.alturaParede) * 9);
        return quantAzulejos;
    }

    public double calcularPrecoDosAzulejos(){
        double gastoAzulejos = calcularQuantidadeAzulejos() * 12.50f;
        return gastoAzulejos;
    }


}
