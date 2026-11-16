package aula.LacosESwitch;

import java.util.Scanner;

public class DigitarNotas {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas notas você deseja digitar?");
        int quantidade = sc.nextInt();
        int contador = 0;
        float soma = 0;

        while (contador < quantidade) {
            System.out.println("Digite a nota " + (contador + 1));
            float nota = sc.nextFloat();
            soma = soma + nota;
            contador++;
        }

        System.out.printf("Soma das notas: %.2f%n", soma);

        sc.close();
    }
}
