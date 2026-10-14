package atividadeDeNota2;

import java.util.Scanner;

public class atividade3 {
    public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    double v1, v2, media;

    v1 = sc.nextDouble();
    v2 = sc.nextDouble();

    media = ((v1*3.5)+(v2*7.5))/(3.5+7.5);
    
    System.out.printf("MEDIA = %.5f%n", media);

    sc.close();
    }
}
