package unidade5.exerciciosUni5;

public class Uni5Exe11 {

    private int quantBiscoitosQueb = 1;

    public Uni5Exe11(){
        calcularBiscoitosQuebrados();
        mostrarResultado();
    }

    public void calcularBiscoitosQuebrados(){
        for(int i=2; i<=16; i++){
            quantBiscoitosQueb *= 3;
        }
    }

    public void mostrarResultado(){
        System.out.println("A quantidade de biscoitos quebrados em 1 dia é: " + quantBiscoitosQueb);
    }

    public static void main(String[] args) {
        new Uni5Exe11();
    }
}
