import java.util.Scanner;

public class Distancia {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int KM = sc.nextInt();
        int min = KM*2;

        System.out.println(min + " minutos");

        sc.close();
    }
}