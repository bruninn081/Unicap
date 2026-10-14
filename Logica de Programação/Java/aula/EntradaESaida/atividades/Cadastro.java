package aula.EntradaESaida.atividades;

import java.util.Scanner;

public class Cadastro {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome, cidade;
        int ano;

        System.out.print("Nome completo: ");
        nome = sc.nextLine();

        System.out.print("Cidade: ");
        cidade = sc.nextLine();

        System.out.print("Ano de nascimento: ");
        ano = sc.nextInt();
        System.out.println();

        System.out.printf("---FICHA---%n");
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Cidade: %s%n", cidade);
        System.out.printf("Idade: %d anos", 2026-ano);
        sc.close();
    }
}
