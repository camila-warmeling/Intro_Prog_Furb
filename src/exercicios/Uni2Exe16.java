package exercicios;

import java.util.Scanner;

public class Uni2Exe16 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.println("Digite quantas latas pequenas de 350ml deseja:");
        double refriPequeno = input.nextInt();

        System.out.println("Digite quantas garrafa média de 600ml deseja:");
        double refriMedio = input.nextInt();

        System.out.println("Digite quantas garrafa grande de 2L deseja:");
        double refriGrande = input.nextInt();

        refriPequeno = refriPequeno*350;
        refriMedio = refriMedio*600;
        refriGrande = refriGrande*2000;

        double quantLitros = (refriPequeno + refriMedio + refriGrande)/1000;

        System.out.println("A quantidade de litros comprado pelo comerciente é " + quantLitros + " litros");
    
        input.close();
    }
}
