import java.util.Scanner;

public class Pares {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int v;
        int contador = 0;

        for (int i = 1; i <= 5; i++) {
            v = sc.nextInt();
            if (v%2==0) { 
                contador++;  
            }
        } 

        System.out.println(contador + " valores pares");

        sc.close();
    }
}