package aula.ComparacaoECondicao.atividades;

import java.util.Scanner;

public class OrdemAlfabetica {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome1, nome2;

        System.out.print("Primeiro nome: ");
        nome1 = sc.next();
        System.out.print("Segundo nome: ");
        nome2 = sc.next();
        System.out.println();
        
        if (nome2.compareTo(nome1) < 0) {
            System.out.println("Em ordem: " + nome2 + ", " + nome1);
        }

        sc.close();
    }
}