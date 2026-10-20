package aula.ComparacaoECondicao;

public class Erro3 {
    public static void main (String[] args) {
        double nota = 9.5;

        if (nota <= 5.0) {
            System.out.println("Reprovado");
        } else if (nota <= 7.0) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Aprovado");
        }
    }
}
