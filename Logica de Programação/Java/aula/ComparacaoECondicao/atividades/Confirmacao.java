package aula.ComparacaoECondicao.atividades;

import java.util.Scanner;

public class Confirmacao {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String resposta;

        System.out.print("Deseja continuar? (sim/não): ");
        resposta = sc.next();
            if (resposta.equalsIgnoreCase("s")) {
                System.out.println("Certo, vamos continuar");
            }
            else if (resposta.equalsIgnoreCase("sim")) {
                System.out.println("Certo, vamos continuar");
            }
            else if (resposta.equalsIgnoreCase("n")) {
                System.out.println("Certo, não vamos continuar");
            }
            else if (resposta.equalsIgnoreCase("não")) {
                System.out.println("Certo, não vamos continuar");
            }    
            else {
                System.out.println("Resposta não reconhecida: [" + resposta + "]");
            }

        sc.close();
    }
}
