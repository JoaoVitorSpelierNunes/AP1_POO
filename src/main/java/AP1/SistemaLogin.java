package AP1;

import java.util.Scanner;
public class SistemaLogin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String loginCorreto = "java8";
        String senhaCorreta = "java8";

        int tentativas = 3;

        while (tentativas > 0) {
            System.out.print("Login: ");
            String login = scan.nextLine();

            System.out.print("Senha: ");
            String senha = scan.nextLine();

            if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Acesso permitido! Bem-vindo ao sistema.");
                return;
            } else {
                tentativas--;
                System.out.println("Login ou senha incorretos. Tentativas restantes: " + tentativas);
            }
        }
    }
    
    
}