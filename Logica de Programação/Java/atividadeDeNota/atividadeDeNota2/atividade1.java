package atividadeDeNota.atividadeDeNota2;

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v1 = sc.nextInt();
        int v2 = sc.nextInt();

        int prod = v1*v2;

        System.out.println("PROD = " + prod);

        sc.close();
    }
}
