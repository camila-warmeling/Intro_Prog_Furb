package unidade4.exerciciosUni4;

import java.util.Scanner;

public class Uni4Exe10 {

    private int idadeFilhoMar, idadeFilhoZe, idadeFilhoLulu; 
    private String filhoMaisNovo;

    public Uni4Exe10(int idadeFilhoMar, int idadeFilhoZe, int idadeFilhoLulu){
        this.idadeFilhoMar = idadeFilhoMar;
        this.idadeFilhoZe = idadeFilhoZe;
        this.idadeFilhoLulu = idadeFilhoLulu;
    } 

    public String verificarCaculaDaFamilia(){
        if (this.idadeFilhoMar < this.idadeFilhoLulu || this.idadeFilhoZe < this.idadeFilhoLulu){
            if(this.idadeFilhoMar < this.idadeFilhoZe){
                filhoMaisNovo = "O filho mais novo é o Marquinhos";
            }
            else{
                filhoMaisNovo = "O filho mais novo é o Zezinho";
            }
        }else{
            filhoMaisNovo = "O filho mais novo é a Luluzinha";
        }

        return filhoMaisNovo;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Digite a idade de Marquinhos");
        int idadeMarquinhos = input.nextInt();

        System.err.println("Digite a idade de Zezinho");
        int idadeZezinho = input.nextInt();

        System.err.println("Digite a idade de Luluzinha");
        int idadeLuluzinha = input.nextInt();

        Uni4Exe10 classeExec = new Uni4Exe10(idadeMarquinhos, idadeZezinho, idadeLuluzinha);
        System.err.println(classeExec.verificarCaculaDaFamilia());

        input.close();
    }
}
