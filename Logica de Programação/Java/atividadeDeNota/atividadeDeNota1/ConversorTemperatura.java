package atividadeDeNota;
import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius,fahrenheit;

        System.out.println("Nome: Bruno de Oliveira Silva");
        
        System.out.println("Matricula: 00000868417");
        
        System.out.print("Digite a temperatura em Celsius: ");

        celsius = sc.nextDouble();

        System.out.print(celsius);

        fahrenheit = (celsius * 9)/5+32;

        System.out.println("Fahrenheit: " + fahrenheit);

        System.out.print("Classificacao: ");
        
            if (celsius < 0) {
                System.out.println("CONGELANDO");
            } else if (celsius <= 15) {
                System.out.println("FRIO");
            } else if (celsius <= 25) {
                System.out.println("AGRADAVEL");
            } else {
                System.out.println("QUENTE");
            }
        sc.close();
    }
}
