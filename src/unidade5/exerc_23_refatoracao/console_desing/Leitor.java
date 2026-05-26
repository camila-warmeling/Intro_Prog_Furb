package unidade5.exerc_23_refatoracao.console_desing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Leitor {

    private Scanner scan;
    private Escritor escritor;

    public Leitor() {
        scan = new Scanner(System.in);
        escritor = new Escritor();
    }

    private void LimparLeitor(){
        scan.nextLine();
    }

    public String LerTexto(String mensagem){
        escritor.escrever(mensagem);
        return scan.nextLine();
    }

    public int LerInteiro(int min, int max, String mensagem){
        while(true){
            escritor.escrever(mensagem);
            try {
                int leitura = scan.nextInt();
                if(leitura < min){
                    throw new InputMismatchException("Valor mínimo é "+min);
                }
                else if(leitura >max){
                    throw new InputMismatchException("Valor máximo é "+max);
                }
                LimparLeitor();
                return leitura;
            }
            catch (Exception e)
            {
                escritor.escreverErro("Erro ao carregar número inteiro. Verifique se o valor digitado é (i) um número, (ii) inteiro e (iii) está entre "+min+" e "+max+". Mensagem: "+e.getMessage());
                LimparLeitor();
            }
        }
    }

    public double LerDouble(double min, double max, String mensagem){
        while(true){
            escritor.escrever(mensagem);
            try {
                double leitura = scan.nextDouble();
                if(leitura < min){
                    throw new InputMismatchException("Valor mínimo é "+min);
                }
                else if(leitura >max){
                    throw new InputMismatchException("Valor máximo é "+max);
                }
                LimparLeitor();
                return leitura;
            }
            catch (Exception e)
            {
                escritor.escreverErro("Erro ao carregar número decimal. Verifique se o valor digitado é (i) um número e (ii) está entre "+min+" e "+max+". Mensagem do erro: "+e.getMessage());
                LimparLeitor();
            }
        }
    }
}
