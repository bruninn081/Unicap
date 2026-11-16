package aula.ComparacaoECondicao.atividades;

import java.util.Scanner;

public class Login {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String login, senha;

        System.out.print("USUARIO: ");
        login = sc.next();
            if (login.trim().equalsIgnoreCase("ADMIN")) {
                System.out.print("SENHA ");
                senha = sc.next(); 
                    if (senha.trim().equals("unicap2026")) {
                        System.out.println("Acesso liberado. Bem-vindo, " + login);
                        } 
                        else {
                            System.out.println("SENHA INCORRETA");
                        }
        } 
        else {
            System.out.println("USUÁRIO INEXISTENTE");
        }
        
        sc.close();
    }
}
