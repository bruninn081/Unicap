package aula.EntradaESaida;

import java.util.Scanner;

public class Armadilha {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Quantidade: ");
        int qtd = ler.nextInt();

        System.out.print("Nome do produto: ");
        String produto = ler.nextLine();

        System.out.printf("Você comprou %d unidades de [%s]%n",qtd,produto);

        ler.close();
    }
}

// Ao executar o programa ele não vai permitir inserir o nome do produto.

// Quando você digita o valor de quantidade e pressiona Enter, fica duas coisas na fila de entrada: o numero digitado e a marca enter

// nextInt - pega o valor digitado e deixar o enter para trás

//nextLine - pega aquele enter esquecido, entende que a linha acabou e devolver o texto vazio

// o nextLine não leu o que você quis ele leu apenas o que sobrou do comando anterior.

//para corrigir: adicionar um ler.nextLine(); sozinho depois do nextInt();, para que ele consuma a sobre e o seguinte consuma o nome do produto

// Regra importante: sempre usar um nextLine(); logo apos de um nextInt(); ou nextDouble(); inserir o ler.nextLine();

//obs: "ler" é o nome de identificação do Scanner!
