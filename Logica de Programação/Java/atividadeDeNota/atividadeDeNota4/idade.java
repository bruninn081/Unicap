package atividadeDeNota4;

import java.util.Scanner;

public class idade {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int pessoas = 0;


        int idade = sc.nextInt();
        
        while (idade >= 0) {
            soma = soma+idade;
            pessoas++;
            idade = sc.nextInt();
        }
        System.out.printf("%.2f%n", (double)soma/pessoas);
        sc.close();
    }
}