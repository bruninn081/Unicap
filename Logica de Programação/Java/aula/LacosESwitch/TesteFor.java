package aula.LacosESwitch;

public class TesteFor {
    public static void main (String[] args) {
        int x = 0;
        while (x < 10) {
            System.out.println("X: " + x);
            x = x +1;
        }

        System.out.println("--- com for ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("I: " + i);
        }
    }
}
