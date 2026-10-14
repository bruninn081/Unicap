package aula.EntradaESaida.atividades;

import java.util.Scanner;

public class Compra {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade: ");
        int qtd = sc.nextInt();
        sc.nextLine();

        System.out.print("Produto: ");
        String pdt = sc.nextLine();

        System.out.print("Preço unitário: ");
        double pr = sc.nextDouble();

        double total = pr * qtd;

        System.out.printf("%d x %s = R$ %.2f", qtd, pdt, total);

        sc.close();
    }
}
