package unidade5.exerciciosUni5;

public class Uni5Exe10 {
    public static void main(String[] args) {
        int contador = 0;
        for(int i=0; i<=10000; i++){
            for(int j=0; j<=10000; j++){
                //System.out.println(i + "-" + j);
                int soma = i + j;
                int total = (int)Math.pow(soma, 2);
                String termo1 = i+""+j;
                String termo2 = ""+total;
                if(termo1.equals(termo2)){
                    contador ++;
                    System.out.println(i+" + "+j+" = "+soma+" -> "+soma+"²"+" = "+termo2);
                }
                if(contador == 10){
                    break;
                }
            }
        }
    }
}
