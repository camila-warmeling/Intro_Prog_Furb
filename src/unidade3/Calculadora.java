package unidade3;

public class Calculadora {
    private int num1;
    private int num2;
    private int resultado;

    public Calculadora(int numero1, int numero2){ //por boa prática se coloca o mesmo nome da variável no parâmetro (int num1, int num2)
        this.num1 = numero1;
        this.num2 = numero2;
    }

    public int somar(){
        return num1 + num2;
    }

    public int somaDoisNumeros(int n1, int n2){
        return n1 + n2;
    }
    
    public void obterNumeros(){
        //faz alguma coisa
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora(1,2);
        
        int valor = calc.somaDoisNumeros(10,5);
        System.out.println(valor);
        
        valor = calc.somaDoisNumeros(5,5);
        System.out.println(valor);

        valor = calc.somar();
        System.out.println(valor);
    }
    }

