package unidade4.exerciciosUni4;

import java.util.Scanner;

public class Uni4Exe14 {

    Scanner input = new Scanner(System.in);
    private int dia, mes, ano;
    private boolean diaCorreto, mesCorreto, anoBissexto;
    private boolean dataCorreta;

    public Uni4Exe14(){
        obterData();
        verificarDataCorreta();
        mostrarResultado();
    }

    public void obterData(){
        System.out.println("Digite o dia:");
        dia = input.nextInt();

        System.out.println("Digite o mês:");
        mes = input.nextInt();

        System.out.println("Digite o ano:");
        ano = input.nextInt();
    }

    public void verificarMesFevereiro(){
            if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
                anoBissexto = true;
            }
            if((anoBissexto && dia == 29) || (dia > 0 && dia <29 )){
                diaCorreto = true;
            }
            else{
                diaCorreto = false;
            }
    }

    public void verificarDataCorreta(){
        if(mes > 0 && mes < 13){
            mesCorreto = true;
        }
        if(mesCorreto){
            if(mes == 2){
                verificarMesFevereiro();
            }
            else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                if(dia > 0 && dia <= 31){
                    diaCorreto = true;
                }
            }
            else{
                if(dia > 0 && dia <=30){
                    diaCorreto = true;
                }
            }
        }
        if(diaCorreto && mesCorreto){
            dataCorreta = true;
        }
    }

    public void mostrarResultado(){
        if(dataCorreta == true){
            System.out.println("Data válida!");
        }
        else{
            System.out.println("Data inválida!");
        }
    }
    
    public static void main(String[] args) {
        new Uni4Exe14();
    }
}
