package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.

public class Desafio13 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, -3, 4, 5, 6, -7, 8, -9, 10, 5, -4, 3, 9, 15, 21, 25, 55, 27);

        List<Integer> filtrados = numeros.stream()
                .distinct()
                .filter(n -> n >= 5 && n <= 20)
                .collect(Collectors.toList());

        System.out.println(filtrados);

    }
}
