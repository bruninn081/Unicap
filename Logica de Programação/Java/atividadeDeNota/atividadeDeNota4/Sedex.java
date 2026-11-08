package atividadeDeNota4;

import java.util.Scanner;

public class Sedex {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int bola, v1, v2, v3;

        bola = sc.nextInt();
        v1 = sc.nextInt();
        v2 = sc.nextInt();
        v3 = sc.nextInt();

        if (bola <= v1 && bola <= v2 && bola <= v3) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

        sc.close();
    }
}
