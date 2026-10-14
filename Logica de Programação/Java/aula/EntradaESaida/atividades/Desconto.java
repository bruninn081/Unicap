package aula.EntradaESaida.atividades;

import java.util.Scanner;

public class Desconto {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Produto: ");
        String produto = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        System.out.print("Desconto: ");
        double desconto = sc.nextDouble();

        double dt = desconto/100*preco;

        System.out.println("---RECIBO---");

        System.out.println("Produto: " + produto);

        System.out.printf("Preço original: R$ %.2f%n", preco);

        System.out.printf("Desconto (" + desconto +"%%): R$ %.2f%n", dt); // Na hora de executar a % está ficando com 15.0%, se for colocar ao final com a outra variavel "dt" acrescenta mais 0, deixar aqui para tirar duivda mais pra frente

        System.out.printf("Preço final: R$ %.2f%n", preco-dt);
        
        sc.close();
    }
}
