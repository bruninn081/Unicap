package aula.EntradaESaida.atividades;

import java.util.Scanner;

public class TabelaProdutos {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtd1, qtd2, qtd3;
        double total, total1, total2, total3;    
    
        System.out.print("Quantos cadernos? ");
        qtd1 = sc.nextInt();

        System.out.print("Quantas canetas? ");
        qtd2 = sc.nextInt();
        
        System.out.print("Quantas mochilas? ");   
        qtd3 = sc.nextInt();

        total1 = 12.90*qtd1;
        total2 = 2.50*qtd2;
        total3 = 159.99*qtd3;
        total = total1+total2+total3;
    
        System.out.printf("PRODUTO %7s %8s %9s%n", "QTD", "UNIT", "TOTAL");

        System.out.printf("Caderno %7d %8s %9.2f%n", qtd1, "12,90", total1);

        System.out.printf("Caneta %8d %8s %9.2f%n", qtd1, "2,50", total2);

        System.out.printf("Mochila %7d %8s %9.2f%n", qtd1, "159,99", total3);

        System.out.println("----------------------------------");
        System.out.printf("%24.2f%n", total);

        sc.close();
    }
}
