package aula.EntradaESaida;

public class TesteSaida {
    public static void main (String[] args) {
        System.out.println("Linha A"); 
        System.out.println("Linha B");

        System.out.print("Linha C");  
        System.out.print("Linha D");

        System.out.printf("%n");
        System.out.printf("Linha E%n");
        System.out.printf("Nota: %.2f%n", 7.5);
        System.out.printf("%s tem %d anos%n", "Ana", 20);
    }
}

//Observações 

//println - Escreve e  pula linha ao final
//print - Escreve e não pula linha
//printf - Escreve formatado e também não  pula linha sozinho
//para o printf pular linha automaticamente deve inserir no final "%n"
