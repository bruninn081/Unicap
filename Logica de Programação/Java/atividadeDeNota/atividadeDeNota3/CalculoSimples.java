import java.util.Scanner;

public class CalculoSimples {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        double v3 = sc.nextDouble();

        int v4 = sc.nextInt();
        int v5 = sc.nextInt();
        double v6 = sc.nextDouble();        

        double vt;

        vt = (v2*v3)+(v5*v6);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", vt);

        sc.close();
    }
}

