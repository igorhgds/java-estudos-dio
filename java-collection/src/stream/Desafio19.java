package stream;

import java.util.Arrays;
import java.util.List;

//Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.

public class Desafio19 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, -3, 4, 5, 6, -7, 8, -9, 10, 5, -4, 3, 9, 15, 21, 25, 55, 27);

        numeros.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .reduce((a, b) -> a + b)
                .ifPresent(System.out::println);

    }
}
