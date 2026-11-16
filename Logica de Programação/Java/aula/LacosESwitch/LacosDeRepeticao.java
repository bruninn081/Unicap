package aula.LacosESwitch;

public class LacosDeRepeticao {
    public static void main (String[] args) {
        int x = 100;
        System.out.println("Começou");

        while (x < 10) { 
            System.out.println("X: " + x); 
            x = x + 1;
        }
        System.out.println("Acabou");


        x = 100;
        do {
            System.out.println("Entrou no do-while");
            x++;
        } while (x < 10);
    }
}

// diferença do "while" para o "do-while"
// o while ele nem chega a executar caso a condição esteja errada
// já o do-while ele realiza um teste antes mesmo que a condição esteja errada