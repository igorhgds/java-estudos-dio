package codigosBasicos;

import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        double allowance = 50.0;
        int count = 0;

        while (allowance > 0) {
            Double sweetValue = randomValue();

            if (sweetValue > allowance)
                sweetValue = allowance;

            System.out.println("Doce no valor de: R$" + String.format("%.2f", sweetValue) + " adicionado no carrinho");
            allowance -= sweetValue;
            count++;
        }

        System.out.println("Mesada: " + String.format("%.2f", allowance));
        System.out.println("Joãozinho gastou toda sua mesada...");
        System.out.println("Ele conseguiu comprar " + count + " doces");
    }

    private static double randomValue() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
