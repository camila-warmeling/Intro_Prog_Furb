public class Exemplo1 {
    public static void main(String[] args) {
        System.out.println("Aula 25/02/2026");
        double notaUm = 9.5;
        double notaDois = 8.4;
        double notaTres = 4.3;
        double soma = (notaUm + notaDois + notaTres);
        System.out.println("Soma das notas é:"+soma);
        double media = (soma/3);
        System.out.println("A média das notas é:");
        System.out.println(String.format("%.2f",media)); //"%.2f" faz com que fique somente 2 números após a vírgula
    }
}
