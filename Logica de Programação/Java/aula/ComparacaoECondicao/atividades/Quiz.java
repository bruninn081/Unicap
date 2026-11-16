package aula.ComparacaoECondicao.atividades;

import java.util.Scanner;

public class Quiz {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String resposta1, resposta2, resposta3;
        int acertos = 0;

        System.out.println("QUIZ");
        System.out.println();
        System.out.print("1 - Qual a capital de Pernambuco?");
        resposta1 = sc.next();

        System.out.print("2 - Qual o método compara conteúdo de texto em Java?");
        resposta2 = sc.next();

        System.out.print("3 - Quantos lados tem um triângulo?");
        resposta3 = sc.next();

        if (resposta1.trim().equalsIgnoreCase("Recife")) {
            acertos = acertos + 1;
        }
        if (resposta2.trim().equalsIgnoreCase("Equals")) {
            acertos = acertos + 1;
        }
        if (resposta3.trim().equalsIgnoreCase("3")) {
            acertos = acertos + 1;
        }
        
        if (acertos >= 3) {
            System.out.println("Excelente");
        }
        else if (acertos >= 2) {
            System.out.println("Bom");
        }
        else if (acertos >= 1) {
            System.out.println("Precisa revisar");
        }
        else {
            System.out.print("Vamos rever a materia"); 
        }

        sc.close();
    }
}
