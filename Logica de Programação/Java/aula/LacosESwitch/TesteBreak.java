package aula.LacosESwitch;

public class TesteBreak {
    public static void main (String[] args) {
        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
            case 2:
                System.out.println("Segunda");
            case 3:
                System.out.println("Terça");
            case 4:
                System.out.println("Quarta");
            case 5:
                System.out.println("Quinta");
        }
    }
}

// Erro por falta do break, se não incluir o break a cada case quando for executado ele vai apenas iniciar e seguir com a sequencia, como no exemplo acima que repete o 3, 4 e 5 mesmo escolhendo apenas o 3