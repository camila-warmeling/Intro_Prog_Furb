package unidade5.exerciciosUni5;

public class Uni5Exe02 {

    private int somaPares = 0, somaImpares = 0, n;

    public Uni5Exe02(){
        somarNumeros();
        mostrarValores();
    }

    public void somarNumeros(){
        for(n=1; n<=100; n++){
            if(n%2 == 0){
                somaPares += n;
            }
            else{
                somaImpares += n;
            }
        }
    }

    public void mostrarValores(){
        System.out.println("A soma dos números pares de 1 a 100 é:" + somaPares);
        System.out.println("A soma dos números ímpares de 1 a 100 é:" + somaImpares);
    }

    public static void main(String[] args) {
        new Uni5Exe02();
    }
}
