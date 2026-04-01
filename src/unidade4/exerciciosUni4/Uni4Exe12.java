package unidade4.exerciciosUni4;

import java.util.Scanner;

public class Uni4Exe12 {

    Scanner input = new Scanner(System.in);
    private float lado1, lado2, lado3;
    private boolean possivelTriangulo;
    private String tipoTriangulo;

    public Uni4Exe12(){
        obterNumerosUsuario();
        verificarPossibilidadeTriangulo();
        mostrarResultado();
    }

    private void obterNumerosUsuario(){
        System.out.println("Digite o primeiro lado:");
        lado1 = input.nextFloat();
 
        System.out.println("Digite o sedundo lado:");
        lado2 = input.nextFloat();

        System.out.println("Digite o terceiro lado:");
        lado3 = input.nextFloat();
    }

    public void verificarPossibilidadeTriangulo(){
        float soma1 = lado1 + lado2;
        float soma2 = lado1 + lado3;
        float soma3 = lado2 + lado3;

        if (lado3 < soma1 && lado2 < soma2 && lado1 < soma3){
            possivelTriangulo = true;
        }
        else{
            possivelTriangulo = false;
        }
    }

    public String classificarTriangulo(){
        if (lado1 == lado2 && lado2 == lado3){
            tipoTriangulo = "Equilátero";
        }
        else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            tipoTriangulo = "Isósceles";
        }
        else{
            tipoTriangulo = "Escaleno";
        }

        return tipoTriangulo;
    }

    public void mostrarResultado(){
        if (possivelTriangulo == true){
            System.out.println(classificarTriangulo());
        }
        else{
            System.err.println("As medidas não formam um triângulo");
        }
    }

    public static void main(String[] args) {
        new Uni4Exe12();   
    }
}
