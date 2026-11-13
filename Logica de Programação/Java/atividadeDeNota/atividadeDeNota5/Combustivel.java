import java.util.Scanner;

public class Combustivel {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int al = 0;
        int ga = 0;
        int di = 0;
        int codigo;

        codigo = sc.nextInt();

        while (codigo != 4) {
            if (codigo == 1) {
                al = al + 1;
            }
            if (codigo == 2) {
                ga = ga + 1;
            }
            if (codigo == 3) {
                di = di + 1;
            }
            
            codigo = sc.nextInt();    
          
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + al);
        System.out.println("Gasolina: " + ga);
        System.out.println("Diesel: " + di);
        

        sc.close();
    }
}
