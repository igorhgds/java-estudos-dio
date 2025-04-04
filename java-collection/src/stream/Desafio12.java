package stream;

import java.util.Arrays;
import java.util.List;

//Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.

public class Desafio12 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 4, 5, 6, 7, 8);

        int produto = numeros.stream() // Cria uma Stream a partir da lista
                .reduce(1, (a, b) -> a * b); // Multiplica todos os elementos

        System.out.println("O produto de todos os números é: " + produto);

    }
}
