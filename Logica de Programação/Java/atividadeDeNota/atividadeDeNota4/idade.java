package atividadeDeNota4;

import java.util.Scanner;

public class idade {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1, v2, v3, v4, v5;

        v1 = sc.nextInt();
        v2 = sc.nextInt();
        v3 = sc.nextInt();
        v4 = sc.nextInt(); //devo usar estrutura de repetição
        v5 = sc.nextInt();

        System.out.printf("%.2f%n", (double)(v1+v2+v3+v4)/4);

        sc.close();
    }
}