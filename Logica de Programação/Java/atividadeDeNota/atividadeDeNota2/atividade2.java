package atividadeDeNota.atividadeDeNota2;

import java.util.Scanner;

public class atividade2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int nf = sc.nextInt();
        int ht = sc.nextInt();
        double vh = sc.nextDouble();
        
        System.out.println("NUMBER = " + nf);
        System.out.printf("SALARY = U$ %.2f%n", (double)ht*vh);

        sc.close();
    } 
}
