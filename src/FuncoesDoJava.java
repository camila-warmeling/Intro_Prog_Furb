import java.util.Random;

public class FuncoesDoJava {
    public static void main(String[] args) {
        double numero = 25;
        double valor = Math.sqrt(numero); //sqrt - raiz quadrada
        System.out.println(valor);

        numero = 4;
        double potencia = 16;
        valor = Math.pow(numero, potencia);
        System.out.println(valor);

        final double pi = 3.1416; //a variável com final não pode ser alterada 
        double piJava = Math.PI; //valor de pi que está na biblioteca do Java
        System.out.println(pi);
        System.out.println(piJava);

        int num1 = 40;
        int num2 = 35;
        int maiorNumero = Math.max(num1, num2); //retona o maior número
        System.out.println(maiorNumero);

        double aleatorio = Math.random(); //retorna números aleatórios
        System.out.println(aleatorio);

        Random random = new Random();
        int numeroAle = random.nextInt(1000); //gera um número aleatório até o valor indicado
        System.out.println(numeroAle);
        
    }
}
