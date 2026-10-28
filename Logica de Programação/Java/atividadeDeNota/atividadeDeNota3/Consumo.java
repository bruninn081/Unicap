import java.util.Scanner;

public class Consumo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int km = sc.nextInt();
        double l = sc.nextDouble();
        double m = km/l;
        System.out.printf("%.3f km/l%n", m);

        sc.close();
    }
}
