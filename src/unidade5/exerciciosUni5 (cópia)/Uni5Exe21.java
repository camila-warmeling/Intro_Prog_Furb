package unidade5.exerciciosUni5;

public class Uni5Exe21 {

    public static void main(String[] args) {
        
        int alturaChico = 150, alturaZe = 110, anos = 0;
        int crescChico = 2, crescZe = 3;

        while(alturaZe <= alturaChico){
            anos ++;
            alturaChico += crescChico;
            alturaZe += crescZe;
        }

        System.out.println("Para Zé ficar maior que Chico vai demorar " + anos + " anos!");
    }
}
