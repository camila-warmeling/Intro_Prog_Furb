package unidade4.exerciciosUni4;

import java.util.Scanner;


public class Uni4Exe27 {

    Scanner input = new Scanner(System.in);
    private int horaEntrada, minEntrada, horaSaida, minSaida;
    private int horasEstacionado, minutosEstacionados, restoMinutos, totalHorasEstacionado;
    private int horarioEntradaMinutos, horarioSaidaMinutos;
    private float valorPagar;
    private boolean horarioCorreto, saidaMesmoDia;

    public Uni4Exe27(){
        obterEntradaSaida();
        verificarDadosCorretos();
        verificarSaidaMesmoDia();
        if(saidaMesmoDia  && horarioCorreto){ //o código não vai executar todo novamente caso de false
            calcularTempoEstacionado();
            calcularPreco();
        }
        mostrarResultados();
    }

    public void obterEntradaSaida(){
        System.out.println("Digite a hora da entrada:");
        horaEntrada = input.nextInt();
        System.out.println("Digite a hora da entrada:");
        minEntrada = input.nextInt();
        System.out.println("Digite a hora da saída:");
        horaSaida = input.nextInt();
        System.out.println("Digite a hora da saída:");
        minSaida = input.nextInt();
    }

    public void verificarDadosCorretos(){ //a hora não pode ser maior que 23 e os minutos maior que 59
        if(horaEntrada < 24 && horaSaida < 24 && minEntrada < 60 && minSaida < 60){
            horarioCorreto = true;
        }
    }

    public void verificarSaidaMesmoDia(){
        horarioEntradaMinutos = (horaEntrada * 60) + minEntrada;
        horarioSaidaMinutos = (horaSaida * 60) + minSaida;
        if(horarioEntradaMinutos < horarioSaidaMinutos){
            saidaMesmoDia = true;
        }
    }

    public void calcularTempoEstacionado(){ //calcula quantidade de horas totais estacionado
        minutosEstacionados = horarioSaidaMinutos - horarioEntradaMinutos;
        horasEstacionado = minutosEstacionados / 60;
        restoMinutos = minutosEstacionados % 60;
        if(restoMinutos >= 30){ //se os min sobrando for 30 ou mais soma 1h no total
            totalHorasEstacionado = horasEstacionado + 1;
        }
        else if(horasEstacionado == 0){ //Se ele ficou menos de 30min é cobrado uma hora
            totalHorasEstacionado = horasEstacionado + 1;
        }
        else{ //dessa forma o tempo de permanência aparece de forma correta
            totalHorasEstacionado = horasEstacionado; 
        }
    }

    public void calcularPreco(){
        switch (totalHorasEstacionado) {
            case 1,2://1 ou 2 horas
                valorPagar = totalHorasEstacionado * 5;
                break;

            case 3,4://3 ou 4 horas
                valorPagar = 10 + ((totalHorasEstacionado - 2) * 7.5f);
                break;
        
            default: //5 ou mais horas
                valorPagar = 25 + ((totalHorasEstacionado - 4) * 10);
                break;
        }
    }

    public void mostrarResultados(){
        if(saidaMesmoDia  && horarioCorreto){
            System.out.printf("O tempo estacionado foi de %d:%d. O valor a ser pago é de R$%.2f", horasEstacionado, restoMinutos, valorPagar);
        }
        else{
            System.out.println("Dados Inválidos!");
        }
    }

    public static void main(String[] args){
        new Uni4Exe27();
    }
}
