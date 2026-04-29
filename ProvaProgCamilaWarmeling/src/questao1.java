import java.util.Scanner;

public class questao1 {

    Scanner input = new Scanner(System.in);
    private int idade;
    private float temperatura;
    private char prioritario; // S/N
    private String tipoAtendimento;

    public questao1(){
        obterDados();
        verificarTipoAtendimento();
        mostrarResultados();
    }

    public void obterDados(){
        System.out.println("Digite a idade do paciente:");
        idade = input.nextInt();

        System.out.println("Digite a temperatura corporal:");
        temperatura = input.nextFloat();

        System.out.println("Paciente prioritário? (S/N):");
        prioritario = input.next().toUpperCase().charAt(0);
    }

    public void verificarTipoAtendimento(){
        if(temperatura >= 38 || prioritario == 'S'){
            if (idade >= 60){
                tipoAtendimento = ("Atendimento imediato - Idoso prioritário");
            }
            else{
                tipoAtendimento = ("Atendimento imediato");
            }
        }

        else if(temperatura >= 37){
            tipoAtendimento = ("Aguardar - Estado febril");
        }

        else{
            tipoAtendimento = ("Aguardar - Normal");
        }
    }

    public void mostrarResultados(){
        System.out.println(tipoAtendimento);
    }

    public static void main(String[] args) {
        new questao1();
    }
}
