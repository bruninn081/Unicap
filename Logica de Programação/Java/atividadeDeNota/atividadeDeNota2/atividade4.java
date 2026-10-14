package atividadeDeNota2;

import java.util.Scanner;

public class atividade4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        double v1, v2, v3, media;

        v1 = sc.nextDouble();
        v2 = sc.nextDouble();
        v3 = sc.nextDouble();

        media = (((v1*2)+(v2*3)+(v3*5))/(2+3+5));

        System.out.printf("MEDIA = %.1f%n", media);
        
        sc.close();
    }
}
