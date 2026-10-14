package aula.EntradaESaida;

import java.util.Scanner;

public class TesteEntrada {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite seu nome:");
        String nome = ler.nextLine();

        System.out.println("Digite sua idade:");
        int idade = ler.nextInt();

        System.out.printf("Ola, %s! Você tem %d anos.%n",nome,idade);

        ler.close();
    }
}
