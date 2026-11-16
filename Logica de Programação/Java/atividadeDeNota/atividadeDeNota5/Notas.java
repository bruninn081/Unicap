import java.util.Scanner;

public class Notas {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, media;
        int resposta = 1;

        while (resposta == 1) {
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();

        while (n1 > 10 || n1 < 0) {
            System.out.println("nota invalida");
            n1 = sc.nextDouble();
        }

        while (n2 > 10 || n2 < 0) {
            System.out.println("nota invalida");
            n2 = sc.nextDouble();
        }

        media = (n1 + n2) / 2;
        
        System.out.printf("media = %.2f%n", media);
        do {
            System.out.println("novo calculo (1-sim 2-nao)");
            resposta = sc.nextInt();
            }
            while (resposta != 1 && resposta !=2); 
            }
            sc.close();
    }
}
