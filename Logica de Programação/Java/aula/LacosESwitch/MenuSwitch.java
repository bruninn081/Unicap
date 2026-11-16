package aula.LacosESwitch;

import java.util.Scanner;

public class MenuSwitch {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Cadastrar");
        System.out.println("2 - Consultar");
        System.out.println("3 - Alterar");
        System.out.print("Escolha: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Cadastrar");
                break;
            case 2:
                System.out.println("Consultar");
                break;
            case 3:
                System.out.println("Alterar");
                break;
            default:
                System.out.println("Opção inválida");
        }

        sc.close();
    }
}
