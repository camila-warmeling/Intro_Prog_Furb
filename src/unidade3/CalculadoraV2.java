package unidade3;

public class CalculadoraV2 {
    private double numero1;
    private double numero2;

    public CalculadoraV2(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double somar(double n1, double n2){
        return n1+n2;
    }

    public double dividir(double n1, double n2){
        return n1/n2;
    }

    public double multiplicar(double n1, double n2){
        return n1*n2;
    }

    public double subtrair(double n1, double n2){
        return n1-n2;
    }

    public double raiz(double n1){
        return Math.sqrt(n1);
    }

    public double exponencial(double n1, double n2){
        return Math.pow(n1, n2);
    }

    public static void main(String[] args) {
        CalculadoraV2 calc = new CalculadoraV2(1,1);

        double valor = calc.somar(10,5);
        System.out.println("Soma " + valor);
        
        valor = calc.dividir(5,5);
        System.out.println("Divisão " + valor);

        valor = calc.multiplicar(2,0);
        System.out.println("Multiplicação " + valor);

        valor = calc.subtrair(9,3);
        System.out.println("Subtração " + valor);
        
        valor = calc.raiz(9);
        System.out.println("Raiz " + valor);

        valor = calc.exponencial(2,2);
        System.out.println("Expoente " + valor);

    }

}
