package aula.ComparacaoECondicao.atividades;

import java.util.Scanner;

public class ValidarEmail {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String email;

        System.out.print("E-mail: ");
        email = sc.next();

        if (email.length() >= 6) {
            if (email.contains("@")) {
                if (email.endsWith(".com")) {
                    System.out.println("E-mail válido");
                }
                if (email.endsWith(".br")) {
                    System.out.println("E-mail válido");
                }
                else {
                    System.out.println("Email inválido: o e-mail deve terminar com [.com] ou [].br");
                }
            }
            else {
                System.out.println("E-mail invalido: falta o simbolo @");
            }
        }
        else {
            System.out.println("E-mail inválido: favor digitar o e-mail corretamente");
        }

        sc.close();
    }
}
