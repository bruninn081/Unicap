package aula.EntradaESaida.atividades;

import java.util.Scanner;

public class MediaNotas {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        double nota1, nota2, nota3, media;

        System.out.print("Aluno: ");
        nome = sc.nextLine();

        System.out.print("Nota 1: ");
        nota1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        nota2 = sc.nextDouble();

        System.out.print("Nota 3: ");
        nota3 = sc.nextDouble();

        media = (nota1+nota2+nota3)/3;

        System.out.println("Aluno: " + nome);
        System.out.printf("Média: %.2f%n", media);
        System.out.print("Situação: ");

        if (media > 7) {
            System.out.print("APROVADO");
        }
        else {
            System.out.print("REPROVADO");
        }        
        sc.close();
    }
 }
