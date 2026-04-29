import java.util.Scanner;

public class questao3 {

    Scanner input = new Scanner (System.in);
    private String usuario;
    private int senha;

    public questao3(){
        obterDados();
        verificarUsuarioSenha();
    }

    public void obterDados(){
        System.out.println("Digite o usuário:");
        usuario = input.next();

        System.out.println("Digite a senha:");
        senha = input.nextInt();
    }

    public void verificarUsuarioSenha(){
        if(usuario.equals("admin")){
            switch (senha) {
                case 1234:
                    System.out.println("Login bem-sucedido");
                    break;

                case 0000:
                    System.out.println("Acesso bloqueado");
                    break;
            
                default:
                    System.out.println("Senha Incorreta");
                    break;
            }
        }
        else{
            System.out.println("Usuário Inválido");
        }
    }

    public static void main(String[] args) {
        new questao3();
    }
}
